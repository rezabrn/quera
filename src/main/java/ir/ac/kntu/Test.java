package ir.ac.kntu;

import java.time.LocalDateTime;
import java.util.ArrayList;
import ir.ac.kntu.Question;
import ir.ac.kntu.User;

public class Test {
    static ArrayList<Question> questions() {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("1", 20, "70 rooze ke man az to khabar nadaram!?", Question.Type.TEST,
                Question.Level.DIFFICULT));
        questions.add(new Question("2", 3, "ranandeh otooboos?", Question.Type.BLANK, Question.Level.DIFFICULT));
        questions.add(new Question("3", 20, "Chand sante?", Question.Type.DESCRIPTIVE, Question.Level.DIFFICULT));
        questions.add(new Question("4", 12, "chand salete?", Question.Type.SHORT_ANSWER, Question.Level.DIFFICULT));
        questions.add(new Question("5", 4, "sdfsfsds?", Question.Type.TEST, Question.Level.DIFFICULT));
        questions.add(new Question("6", 60, "dadddddddddddddddddddd?", Question.Type.BLANK, Question.Level.DIFFICULT));
        questions.add(
                new Question("7", 80, "emshab shabe mahtabe?", Question.Type.DESCRIPTIVE, Question.Level.DIFFICULT));
        questions.add(new Question("8", 0, "rafigham kojaieieeiiii???", Question.Type.SHORT_ANSWER,
                Question.Level.DIFFICULT));
        return questions;
    }

    static ArrayList<User> users() {
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("ali", "23416545f", "afifheh@ssd.fd", "54524ddss", "254784575644", "02457584"));
        users.add(new User("ali", "23434erge345f", "afifheh@ssd.fd", "54trthddss", "25478452", "09852584"));
        users.add(new User("aliwef", "23rt57ui6i67u6545f", "afjeh@ssd.fd", "54gwergddss", "27255644", "09178527584"));
        users.add(new User("alwefwei", "2357u56y56545f", "ajh@ssd.fd", "545qweqer24ddss", "785278644", "091524584"));
        users.add(new User("aweli", "23416546yf", "afifheh@smd.fd", "54524ddss", "25478554", "09000004"));
        users.add(new User("aldvcdci", "23y45f", "afifheh@ssm.fd", "54524ddss", "005644", "091245804284"));
        users.add(new User("12e12aldvdi", "n6545f", "yeh@yd.fd", "54524ddss", "245045644", "0912450634"));
        users.add(new User("al2e1i", "23416tyh", "ayeh@ssd.fan", "54524ddss", "25252222255644", "091667584"));
        users.add(new User("fedfedali", "23416tyhjtyjh", "hh@sshhd.fd", "54524ddss", "2525644", "0912224"));
        users.add(new User("adfedflerfi", "23mnmmmmmmmmmmmmmmmmmmmm", "afihhhheh@ssd.fd", "54524ddss", "20455644",
                "0912457774"));
        users.add(new User("aldffi", "2341jhmm", "cdfh@ssd.fd", "54524ddss", "54524", "09154"));
        users.add(new User("a v", "23415", "azzz@sdd.fdff", "54524ddss", "25478455644", "091245584"));
        return users;
    }

    static ArrayList<Class> classes() {
        ArrayList<Class> classes = new ArrayList<>();
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<User> users = new ArrayList<>();
        ArrayList<Practice> practices = new ArrayList<>();
        users.add(new User("fedfedali", "23416tyhjtyjh", "hh@sshhd.fd", "54524ddss", "2525644", "0912224"));
        users.add(new User("adfedflerfi", "23mnmmmmmmmmmmmmmmm", "afihhhheh@ssd.fd", "54524ddss", "20455644",
                "0912457774"));
        users.add(new User("aldffi", "2341jhmm", "cdfh@ssd.fd", "54524ddss", "54524", "09154"));
        User teacher = new User("a v", "23415", "azzz@sdd.fdff", "54524ddss", "25478455644", "091245584");
        questions.add(new Question("1", 20, "70 rooze ke man az to khabar nadaram!?", Question.Type.TEST,
                Question.Level.DIFFICULT));
        questions.add(new Question("5", 4, "sdfsfsds?", Question.Type.TEST, Question.Level.DIFFICULT));
        questions.add(new Question("6", 60, "dadddddddddddddddddddd?", Question.Type.BLANK, Question.Level.DIFFICULT));
        questions.add(
                new Question("7", 80, "emshab shabe mahtabe?", Question.Type.DESCRIPTIVE, Question.Level.DIFFICULT));
        questions.add(new Question("8", 0, "rafigham kojaieieeiiii???", Question.Type.SHORT_ANSWER,
                Question.Level.DIFFICULT));
        practices.add(new Practice("0", "asane", LocalDateTime.of(1397, 5, 23, 12, 14),
                LocalDateTime.of(1397, 5, 24, 12, 14), 0.5, questions, true));
        classes.add(
                new Class("aval", "kntu", teacher, 1399, true, true, "12345678", "clase khoobieh!", users, practices));
        return classes;
    }
}