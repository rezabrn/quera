package ir.ac.kntu;

import java.util.ArrayList;
import java.util.HashMap;

public class Question {
    private String name;

    private int score;

    private String text;

    private Type questionType;

    private Level level;

    private String answer;

    private HashMap<User, ArrayList<String>> studentAnswer;

    private HashMap<User, Double> studentScore;

    public Question() {

    }

    public Question(String name, int score, String text, Type questionType, Level level, String answer) {
        this.name = name;
        this.score = score;
        this.text = text;
        this.questionType = questionType;
        this.level = level;
        this.answer = answer;
    }

    public Question(String name, int score, String text, Type questionType, Level level) {
        this.name = name;
        this.score = score;
        this.text = text;
        this.questionType = questionType;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Type getQuestionType() {
        return questionType;
    }

    public void setQuestionType(Type questionType) {
        this.questionType = questionType;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public HashMap<User, ArrayList<String>> getStudentAnswer() {
        return studentAnswer;
    }

    public void setStudentAnswer(HashMap<User, ArrayList<String>> studentAnswer) {
        this.studentAnswer = studentAnswer;
    }

    public HashMap<User, Double> getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(HashMap<User, Double> studentScore) {
        this.studentScore = studentScore;
    }

    enum Level {
        EASY, NORMAL, DIFFICULT, SUPER_DIFFICULT
    }

    enum Type {
        DESCRIPTIVE, TEST, SHORT_ANSWER, BLANK
    }

    @Override
    public String toString() {
        return text +
                "\n\nname = " + name + "      questionType = " + questionType.toString() + "      level = "
                + level.toString() + "           score = " + score;
    }
}