package ir.ac.kntu;

public class Question {
    private String name;
    private int score;
    private String text;
    private Type questionType;

    public Question(String name, int score, String text, Type questionType) {
        this.name = name;
        this.score = score;
        this.text = text;
        this.questionType = questionType;
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

    enum Level {
        EASY, NORMAL, DIFFICULT, SUPER_DIFFICULT
    }

    enum Type {
        DESCRIPTIVE, TEST, SHORT_ANSWER, BLANK
    }

    @Override
    public String toString() {
        return text +
        "\n\nname = " + name + "      questionType = " + questionType.toString() + "           score = " + score;
    }

    
}