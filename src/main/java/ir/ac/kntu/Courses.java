package ir.ac.kntu;

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
        System.out.println("enter your name");
        user.setName((new Scanner(System.in)).nextLine());
        System.out.println("enter a unique name");
        user.setUserName((new Scanner(System.in)).nextLine());
        System.out.println("enter your email");
        user.setEmail((new Scanner(System.in)).nextLine());
        System.out.println("enter a password (at least 8 characters)");
        user.setPassword((new Scanner(System.in)).nextLine());
        System.out.println("enter your national code");
        user.setNationalCode((new Scanner(System.in)).nextLine());
        System.out.println("enter your phone number");
        user.setPhone((new Scanner(System.in)).nextLine());
        users.add(user);
        menu();
    }

    // public void editClass(String name) {
    //     String clas = getClassByName(name);
    //     System.out.println(clas.toString());
    //     System.out.println("which section do you want to change? enter the number");
    //     listOfParts();
    //     String section = (new Scanner(System.in)).nextLine();
    //     sectionEdition(section, clas);
    // }

    // public void sectionEdition(String section, Class clas) {
    //     switch (section) {
    //         case 1:
    //             editName(clas);
    //             break;
    //         case 2:
    //             editAcademicYear(clas);
    //             break;
    //         case 3:
    //             editInstitution(clas);
    //             break;
    //         case 4:
    //             editAccess(clas);
    //             break;
    //         case 5:
    //             editPrivacy(clas);
    //             break;
    //         case 6:
    //             editDefinition(clas);
    //             break;
    //         case 7:
    //             editStudent(clas);
    //             break;
    //         default:
    //             break;
    //     }
    // }

    // public void editName(Class clas) {
    //     System.out.println("enter the new name for class");
    //     clas.setName((new Scanner(System.in)).nextLine());
    // }

    // public void editAcademicYear(Class clas) {
    //     System.out.println("enter the new year");
    //     clas.setAcademicYear(Integer.parseInt((new Scanner(System.in)).nextLine()));
    // }

    // public void editInstitution(Class clas) {
    //     System.out.println("enter the name of institution");
    //     clas.setInstitution((new Scanner(System.in)).nextLine());
    // }

    // public void editAccess(Class clas) {
    //     clas.setOpen(!clas.isOpen());
    // }

    // public void editPrivacy(Class clas) {
    // clas.setName(!clas.isGeneral());
    // }

    // public void editDefinition(Class clas) {
    //     System.out.println("write some defenition for your class");
    //     clas.setDetails((new Scanner(System.in)).nextLine());
    // }

    // public void editStudent(Class clas) {
    //     for (int i = 0; i < clas.getStudents().size(); i++) {
    //         System.out.println((i + 1) + ". " + clas.getStudents().get(i));
    //     }
    //     System.out.println("chose the number of student");
    //     int student = Integer.parseInt((new Scanner(System.in)).nextLine());
    //     clas.getStudents().remove(student - 1);
    // }

    // public void listOfParts() {
    //     System.out.println("1. name of class");
    //     System.out.println("2. academic year");
    //     System.out.println("3. institution");
    //     System.out.println("4. access");
    //     System.out.println("5. privacy");
    //     System.out.println("6. definition");
    //     System.out.println("7. students");
    // }

        // public User getUserByEmail(String email) {
    //     for (User user : users) {
    //         if (user.getEmail().equals(email)) {
    //             return user;
    //         }
    //     }
    //     return null;
    // }

    // public practiceMaking(Class clas) {           // uncompleted
    //     clas.getPractices().add(new Practice());
    //     System.out.println("make a name for practice");
    //     clas.getpractices().get(clas.getpractices().size() - 1).setName((new Scanner(System.in)).nextLine());
    //     System.out.println("write some information for the practice");
    //     clas.getpractices().get(clas.getpractices().size() - 1).setDetails((new Scanner(System.in)).nextLine());
    //     // System.out.println("enter the date");
    //     clas.getpractices().get(clas.getpractices().size() - 1).setDate();
    //     // System.out.println("");
    //     clas.getpractices().get(clas.getpractices().size() - 1).setExtraTime();
    //     System.out.println("enter delay cofficient");
    //     clas.getpractices().get(clas.getpractices().size() - 1).setDelayCoefficient();
    //     System.out.println("you want set question in which way?");
    //     System.out.println("1. make question myself");
    //     System.out.println("2. choose question from question bank");
    //     int way = Integer.parseInt((new Scanner(System.in)).nextLine());
    //     switch (way) {
    //         case 1:
    //             makeQuestion(clas.getPractices().get(clas.getpractices().size() - 1));    // uncompleted
    //             break;
    //         case 2:
    //             chooseQuestion(clas.getPractices().get(clas.getpractices().size() - 1));  // uncompleted
    //             break;
    //         default:
    //             break;
    //     }
    //     // clas.getpractices().getQuestions();
    // }

    // public void makeQuestion(Practice practice) {   
    //     practice.getQuestions();                 // uncompleted
    // }

    public void classMaker(User user) {
        boolean test;
        String input = new String();
        Class clas = new Class();
        Scanner in = new Scanner(System.in);
        System.out.println("enter name of the class");
        input = in.nextLine();
        clas.setName(input);
        System.out.println("enter name of the institution");
        input = in.nextLine();
        clas.setInstitution(input);
        clas.setTeacher(user);
        System.out.println("enter the academic year");
        input = in.nextLine();
        clas.setAcademicYear(Integer.parseInt(input));
        System.out.println("do you want your class be open? enter Y or N");
        input = in.nextLine();
        clas.setOpen(input == "Y");
        System.out.println("do you want your class be general? enter Y or N");
        input = in.nextLine();
        test =(input == "Y");
        clas.setGeneral(test);
        if (!test) {
            System.out.println("enter class password");
            input = in.nextLine();
            clas.setPassword(input);
        }
        System.out.println("write some information about your class");
        input = in.nextLine();
        clas.setClassDetails(input);
        classes.add(clas);
        System.out.println("your class has been completely made");
        in.close();
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

    public void classSearch(User user) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the name of the class");
        String name = in.nextLine();
        Class clas = getClassByName(name);
        if (clas.isOpen()) {
            System.out.println("do you want to join this class? enter Y or N");
            String a = in.nextLine();
            if (a == "Y") {
                if (clas.isGeneral()) {
                    clas.getStudents().add(user);
                    System.out.println("you have successfuly joined the class");
                } else {
                    System.out.println("enter the password");
                    String pass = in.nextLine();
                    if (pass == clas.getPassword()) {
                        clas.getStudents().add(user);
                    } else {
                        System.out.println("password is incorrect");
                    }
                }
            }
        } else {
            System.out.println("this class is closed");
            System.out.println("you can only join the class by the class owner");
        }
        System.out.println("press any key to back");
        String a = in.nextLine();
        in.close();
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
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch (number) {
            case 1:
                usersMenu();
                break;
            case 2:
                showBank();
                break;
            default:
                menu();
                break;
        }
        in.close();
    }

    public void showBank() {
        System.out.println();
        System.out.println("--------------------------------------------------------");
        for (Question q : bank) {
            System.out.println(q);
            System.out.println("--------------------------------------------------------");
        }
        menu();
    }

    public void usersMenu() {
        User user = new User();
        System.out.println("1. sign in");
        System.out.println("2. sign up");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch (number) {
            case 1:
                user = signIn();
                if (user == null) {
                    System.out.println("\n*the national code was incorrect\n");
                    usersMenu();
                } else {
                    usersOptions(user);
                }
                break;
            case 2:
                register();
                break;
            default:
                usersMenu();
        }
        in.close();
    }

    public User signIn() {
        System.out.println("enter your national code");
        Scanner in = new Scanner(System.in);
        String nationalCode = in.nextLine();
        return getUserByNationalCode(nationalCode);
    }

    public void usersOptions(User user) {
        System.out.println("choose what you want");
        System.out.println("1. search class");
        System.out.println("2. make class");
        System.out.println("3. search user");
        System.out.println("4. sign out");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        switch (number) {
            case 1:
                classSearch(user);
                break;
            case 2:
                classMaker(user);
                break;
            case 3:

                break;
            case 4:
                menu();
                break;
            // case 5:
            default:
                usersOptions(user);
        }
        in.close();
    }
}