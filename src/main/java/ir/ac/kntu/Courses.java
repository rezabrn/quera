package ir.ac.kntu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;
import ir.ac.kntu.User;

public class Courses {
    ArrayList<Class> classes = new ArrayList<>();
    ArrayList<User> users = new ArrayList<>();
    ArrayList<Question> bank = new ArrayList<>();

    public Courses() {
        bank.addAll(Test.questions());
        users.addAll(Test.users());
        classes.addAll(Test.classes());
    }

    public void register() {
        User user = new User();
        String input = new String();
        System.out.println("enter your name");
        input = in();
        user.setName(input);
        System.out.println("enter a unique name");
        input = in();
        user.setUserName(input);
        System.out.println("enter your email");
        input = in();
        user.setEmail(input);
        System.out.println("enter a password");
        input = in();
        user.setPassword(input);
        System.out.println("enter your national code");
        input = in();
        user.setNationalCode(input);
        System.out.println("enter your phone number");
        input = in();
        user.setPhone(input);
        users.add(user);
        menu();
    }

    public void editClass(Class clas, User user) {
        System.out.println(clas.toString());
        System.out.println("which section do you want to change? enter the number");
        listOfParts();
        String section = in();
        sectionEdition(section, clas, user);
    }

    public void sectionEdition(String section, Class clas, User user) {
        switch (section) {
            case "1":
                editName(clas);
                sectionEdition(section, clas, user);
            case "2":
                editAcademicYear(clas);
                sectionEdition(section, clas, user);
            case "3":
                editInstitution(clas);
                sectionEdition(section, clas, user);
            case "4":
                editAccess(clas);
                sectionEdition(section, clas, user);
            case "5":
                editPrivacy(clas);
                sectionEdition(section, clas, user);
            case "6":
                editDefinition(clas);
                sectionEdition(section, clas, user);
            case "7":
                removeStudent(clas);
                sectionEdition(section, clas, user);
            case "8":
                teacherMenu(clas, user);
            default:
                sectionEdition(section, clas, user);
        }
    }

    public void editName(Class clas) {
        System.out.println("enter the new name for class");
        String name = in();
        clas.setName(name);
        System.out.println("name edition is successfuly done");
    }

    public void editAcademicYear(Class clas) {
        System.out.println("enter the new year");
        String academicYear = in();
        clas.setAcademicYear(Integer.parseInt(academicYear));
        System.out.println("academic year is successfuly changed");
    }

    public void editInstitution(Class clas) {
        System.out.println("enter the name of institution");
        String institution = in();
        clas.setInstitution(institution);
        System.out.println("institution name edition is successfuly done");
    }

    public void editAccess(Class clas) {
        clas.setOpen(!clas.isOpen());
        System.out.println("access is successfuly changed");
    }

    public void editPrivacy(Class clas) {
        clas.setGeneral(!clas.isGeneral());
        System.out.println("privacy is successfuly changed");
    }

    public void editDefinition(Class clas) {
        System.out.println("write some defenition for your class");
        String details = in();
        clas.setClassDetails(details);
        System.out.println("definition edition is successfuly done");
    }

    public void removeStudent(Class clas) {
        for (int i = 0; i < clas.getStudents().size(); i++) {
            System.out.println((i + 1) + ". " + clas.getStudents().get(i));
        }
        System.out.println("chose the number of student");
        int student = Integer.parseInt(in());
        clas.getStudents().remove(student - 1);
        System.out.println("student removing is successfuly done");
    }

    public void listOfParts() {
        System.out.println("1. name of class");
        System.out.println("2. academic year");
        System.out.println("3. institution");
        System.out.println("4. access");
        System.out.println("5. privacy");
        System.out.println("6. definition");
        System.out.println("7. students");
        System.out.println("8. turn back to users menu");
    }

    public void addStudent(Class clas, User teacher) {
        User student = getUserByChoosedWay(clas, teacher);
        clas.getStudents().add(student);
        teacherMenu(clas, teacher);
    }

    public User getUserByChoosedWay(Class clas, User teacher) {
        System.out.println("do you want to add user in which way?");
        System.out.println("1. by email");
        System.out.println("2. by national code");
        System.out.println("3. out");
        String way = in();
        switch (way) {
            case "1":
                System.out.println("enter email");
                String email = in();
                User user = getUserByEmail(email);
                if (user == null) {
                    System.out.println("\n*there is no person with this email\n");
                    getUserByChoosedWay(clas, teacher);
                } else {
                    return user;
                }
            case "2":
                System.out.println("enter national code");
                String nationalCode = in();
                User user2 = getUserByNationalCode(nationalCode);
                if (user2 == null) {
                    System.out.println("\n*there is no person with this national code\n");
                    getUserByChoosedWay(clas, teacher);
                } else {
                    return user2;
                }
            case "3":
                teacherMenu(clas, teacher);
            default:
                getUserByChoosedWay(clas, teacher);
                return null;
        }
    }

    public void classMaker(User user) {
        boolean test;
        String input = new String();
        Class clas = new Class();
        System.out.println("enter name of the class");
        input = in();
        clas.setName(input);
        System.out.println("enter name of the institution");
        input = in();
        clas.setInstitution(input);
        clas.setTeacher(user);
        System.out.println("enter the academic year");
        input = in();
        clas.setAcademicYear(Integer.parseInt(input));
        System.out.println("do you want your class be open? enter Y or N");
        input = in();
        clas.setOpen(input == "Y");
        System.out.println("do you want your class be general? enter Y or N");
        input = in();
        test = (input == "Y");
        clas.setGeneral(test);
        if (!test) {
            System.out.println("enter class password");
            input = in();
            clas.setPassword(input);
        }
        System.out.println("write some information about your class");
        input = in();
        clas.setClassDetails(input);
        classes.add(clas);
        System.out.println("your class has been completely made");
        //
        usersOptions(user);
    }

    public Class getClassByName(String name) {
        for (Class clas : classes) {
            if (clas.getName().equals(name)) {
                showClass(clas);
                return clas;
            }
        }
        return null;
    }

    public Class getClassByOwner(String teacher) {
        for (Class clas : classes) {
            if (clas.getTeacher().equals(teacher)) {
                showClass(clas);
                return clas;
            }
        }
        return null;
    }

    public Class getClassByInstitution(String institution) {
        for (Class clas : classes) {
            if (clas.getInstitution().equals(institution)) {
                showClass(clas);
                return clas;
            }
        }
        return null;
    }

    public User getUserByNationalCode(String nationalCode) {
        for (User user : users) {
            if (user.getNationalCode().equals(nationalCode)) {
                return user;
            }
        }
        return null;
    }

    public User getUserByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

    public void classSearch(User user) {
        System.out.println("enter the name of the class");
        String name = in();
        Class clas = getClassByName(name);
        if (clas == null) {
            System.out.println("there is not class with this name");
            usersOptions(user);
        } else if (clas.isOpen() && !clas.getTeacher().equals(user) && !clas.getStudents().contains(user)) {
            System.out.println("do you want to join this class? enter Y or N");
            String a = in();
            if (a == "Y") {
                if (clas.isGeneral()) {
                    clas.getStudents().add(user);
                    System.out.println("you have successfuly joined the class");
                } else {
                    System.out.println("enter the password");
                    String pass = in();
                    if (pass == clas.getPassword()) {
                        clas.getStudents().add(user);
                    } else {
                        System.out.println("password is incorrect");
                    }
                }
            }
        } else if (clas.getTeacher().equals(user) || clas.getStudents().contains(user)) {
            enterClass(clas, user);
        } else {
            System.out.println("this class is closed");
            System.out.println("you can only join the class by the class owner");
        }
        usersOptions(user);
    }

    public void showClass(Class clas) {
        System.out.println("name : " + clas.getName());
        System.out.println("institution : " + clas.getInstitution());
        System.out.println("teacher : " + clas.getTeacher().getName());
        System.out.println("academic year : " + clas.getAcademicYear());
        System.out.println("info : " + clas.getClassDetails());
    }

    public void menu() {
        System.out.println("choose a number");
        System.out.println("1. users");
        System.out.println("2. question bank");

        String number = in();
        switch (number) {
            case "1":
                usersMenu();
                break;
            case "2":
                showBank();
                break;
            default:
                menu();
                break;
        }

    }

    public void showBank() {
        int i = 1;
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (Question q : bank) {
            System.out.println("&" + (i) + "$" + q);
            System.out.println("--------------------------------------------------------");
            i++;
        }
        menu();
    }

    public void usersMenu() {
        User user = new User();
        System.out.println("1. sign in");
        System.out.println("2. sign up");
        String number = in();
        switch (number) {
            case "1":
                user = signIn();
                if (user == null) {
                    System.out.println("\n*the national code was incorrect\n");
                    usersMenu();
                } else {
                    usersOptions(user);
                }
                break;
            case "2":
                register();
                break;
            default:
                usersMenu();
        }

    }

    public User signIn() {
        System.out.println("enter your national code");
        String nationalCode = in();
        return getUserByNationalCode(nationalCode);
    }

    public void usersOptions(User user) {
        System.out.println("choose what you want");
        System.out.println("1. search class");
        System.out.println("2. make class");
        System.out.println("3. search user");
        System.out.println("4. back");
        System.out.println("5. sign out");
        String number = in();
        switch (number) {
            case "1":
                classSearch(user);
            case "2":
                classMaker(user);
            case "3":
                userSearch(user);
            case "4":
                usersMenu();
            case "5":
                menu();
            default:
                usersOptions(user);
        }

    }

    public String in() {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        // in.close();
        return input;
    }

    public void userSearch(User me) {
        System.out.println("do you want to search user in which way?");
        System.out.println("1. by email");
        System.out.println("2. by national code");
        String way = in();
        switch (way) {
            case "1":
                System.out.println("enter email");
                String email = in();
                User user = getUserByEmail(email);
                if (user == null) {
                    System.out.println("\n*there is no person with this email\n");
                    userSearch(me);
                } else {
                    showUser(user, me);
                }
            case "2":
                System.out.println("enter national code");
                String nationalCode = in();
                User user2 = getUserByNationalCode(nationalCode);
                if (user2 == null) {
                    System.out.println("\n*there is no person with this national code\n");
                    userSearch(me);
                } else {
                    showUser(user2, me);
                }
            default:
                userSearch(me);
        }
    }

    public void showUser(User user, User me) {
        System.out.println("name = " + user.getName());
        System.out.println("username = " + user.getUserName());
        System.out.println("phone = " + user.getPhone());
        usersOptions(me);
    }

    public void enterClass(Class clas, User user) {
        if (clas.getTeacher().equals(user)) {
            teacherMenu(clas, user);
        } else {
            studentMenu(clas, user);
        }
    }

    public void teacherMenu(Class clas, User user) {
        System.out.println("teacher menu");
        System.out.println("choose what you want");
        System.out.println("1. edit class");
        System.out.println("2. make practice");
        System.out.println("3. add user");
        System.out.println("4. out");
        String number = in();
        switch (number) {
            case "1":
                editClass(clas, user);
                teacherMenu(clas, user);
            case "2":
                practiceMaker(clas, user);
                teacherMenu(clas, user);
            case "3":
                addStudent(clas, user);
                teacherMenu(clas, user);
            case "4":
                usersOptions(user);
            default:
                teacherMenu(clas, user);
        }
    }

    public void practiceMaker(Class clas, User teacher) {
        Practice practice = new Practice();
        String input = new String();
        System.out.println("choose a name for the practis");
        input = in();
        practice.setName(input);
        System.out.println("write some definition about the practice");
        input = in();
        practice.setDetails(input);
        System.out.println("order the time");
        practice.setDeadline(setTime());
        System.out.println("order delay time");
        practice.setExtraTime(setTime());
        System.out.println("set a number between 0 and 1, for delay coefficient");
        input = in();
        practice.setDelayCoefficient(Double.parseDouble(input));
        setQuestion(clas, teacher, practice);
        clas.getPractices().add(practice);
    }

    public void setQuestion(Class clas, User teacher, Practice practice) {
        System.out.println("choose the way of adding question");
        System.out.println("1. add by myself");
        System.out.println("2. add from queation bank");
        System.out.println("3. turn back");
        String way = in();
        switch (way) {
            case "1":
                practice.setQuestions(questions());
                setQuestion(clas, teacher, practice);
            case "2":
                practice.getQuestions().add(addFromBank());
                setQuestion(clas, teacher, practice);
            case "3":
                teacherMenu(clas, teacher);
            default:
                setQuestion(clas, teacher, practice);
        }
    }

    public LocalDateTime setTime() {
        System.out.println("enter the year");
        int year = Integer.parseInt(in());
        System.out.println("enter the month");
        int month = Integer.parseInt(in());
        System.out.println("enter the day");
        int day = Integer.parseInt(in());
        System.out.println("enter the hour");
        int hour = Integer.parseInt(in());
        System.out.println("enter the minute");
        int minute = Integer.parseInt(in());
        LocalDateTime time = LocalDateTime.of(year, month, day, hour, minute);
        return time;
    }

    public ArrayList<Question> questions() {
        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0;; i++) {
            String number = new String();
            System.out.println("set a name for the question");
            number = in();
            questions.get(i).setName(number);
            System.out.println("set a score for the question");
            number = in();
            questions.get(i).setScore(Integer.parseInt(number));
            System.out
                    .println("choose the type of the question:   1.DESCRIPTIVE,   2.TEST,   3.SHORT_ANSWER,   4.BLANK");
            number = in();
            setType(questions, i, number);
            System.out.println(
                    "choose the difficulty of question:   1.EASY,   2.NORMAL,   3.DIFFICULT,   4.SUPER_DIFFICULT");
            setLevel(questions, i, number);
            System.out.println("write the text of the question");
            number = in();
            questions.get(i).setText(number);
            System.out.println("enter 'X' if do you want to finish");
            number = in();
            if (number == "X") {
                break;
            }
        }
        return questions;
    }

    public void setType(ArrayList<Question> questions, int i, String number) {
        switch (number) {
            case "1":
                questions.get(i).setQuestionType(Question.Type.DESCRIPTIVE);
                break;
            case "2":
                questions.get(i).setQuestionType(Question.Type.TEST);
                break;
            case "3":
                questions.get(i).setQuestionType(Question.Type.SHORT_ANSWER);
                break;
            case "4":
                questions.get(i).setQuestionType(Question.Type.BLANK);
                break;
            default:
                setType(questions, i, number);
        }
    }

    public void setLevel(ArrayList<Question> questions, int i, String number) {
        switch (number) {
            case "1":
                questions.get(i).setLevel(Question.Level.EASY);
                break;
            case "2":
                questions.get(i).setLevel(Question.Level.NORMAL);
                break;
            case "3":
                questions.get(i).setLevel(Question.Level.DIFFICULT);
                break;
            case "4":
                questions.get(i).setLevel(Question.Level.SUPER_DIFFICULT);
                break;
            default:
                setLevel(questions, i, number);
        }
    }

    public Question addFromBank() {
        showBank();
        System.out.println("enter the number of question you want");
        String number = in();
        return bank.get(Integer.parseInt(number) - 1);
    }

    public void studentMenu(Class clas, User student) {
        System.out.println("student menu");
        System.out.println("choose what you want");
        System.out.println("1. do practice");
        System.out.println("2. watch schedule");
        System.out.println("3. out");
        String number = in();
        switch (number) {
            case "1":
                doPractice(clas, student);
                studentMenu(clas, student);
            case "2":
                schedule(clas, student);
                studentMenu(clas, student);
            case "3":
                usersOptions(student);
            default:
                studentMenu(clas, student);
        }
    }

    public void doPractice(Class clas, User student) {
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < clas.getPractices().size(); i++) {
            System.out.println("$" + (i + 1) + "$" + clas.getPractices().get(i));
            System.out.println("--------------------------------------------------------");
        }
        System.out.println("do you want to get back? enter 'Y'");
        String input = in();
        if (input == "Y") {
            studentMenu(clas, student);
            ;
        }
        System.out.println("choose the practice");
        input = in();
        doQuestion(clas, student, clas.getPractices().get(Integer.parseInt(input) - 1));
    }

    public void doQuestion(Class clas, User student, Practice practice) {
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < practices().size(); i++) {
            System.out.println("$" + (i + 1) + "$" + practices().get(i));
            System.out.println("--------------------------------------------------------");
        }
        System.out.println("do you want to get back? enter 'Y'");
        String input = in();
        if (input == "Y") {
            doPractice(clas, student);
        }
        System.out.println("choose the question");
        input = in();
        solving(clas, student, practice, practice.getQuestions().get(Integer.parseInt(input) - 1));
    }

    public void solving(Class clas, User student, Practice practice, Question question) {
        switch (question.getQuestionType()) {
            case Type.DESCRIPTIVE:
                writeAnswer(question);
                doQuestion(clas, student, practice);
            case Type.TEST:
                doTest(question);
                doQuestion(clas, student, practice);
            case Type.SHORT_ANSWER:
                writeAnswer(question);
                doQuestion(clas, student, practice);
            case Type.BLANK:
                writeAnswer(question);
                doQuestion(clas, student, practice);
            default:
                solving(clas, student, practice, question);
        }
    }

    public void writeAnswer(Question question) {
        System.out.println("write your answer");
        String input = in();
        question.setStudentAnswer(input);
    }

    public void schedule(Class clas, User student) {
        System.out.println("--------------------------------------------------------");
        for (int i = 0; i < practices().size(); i++) {
            System.out.println("$" + (i + 1) + "$" + practices().get(i));
            System.out.println("--------------------------------------------------------");
        }
        System.out.println("choose the practice");
        String input = in();
        if (clas.getPractices(input).isSchedule()) {
            System.out.println((clas.getScoreboard()));
            studentMenu(clas, student);
        } else {
            studentMenu(clas, student);
        }
    }
}