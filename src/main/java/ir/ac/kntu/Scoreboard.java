package ir.ac.kntu;

import java.util.HashMap;

import ir.ac.kntu.Question;

public class Scoreboard {
    private int rank;
    private String name;
    private HashMap<Question, Integer> scoreOfEachQuestion;
    private int score;
    private int time;

    public Scoreboard() {

    }

    public Scoreboard(int rank, String name, HashMap<Question, Integer> scoreOfEachQuestion, int score, int time) {
        this.name = name;
        this.rank = rank;
        this.scoreOfEachQuestion = scoreOfEachQuestion;
        this.score = score;
        this.time = time;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Question, Integer> getScoreOfEachQuestion() {
        return scoreOfEachQuestion;
    }

    public void setScoreOfEachQuestion(HashMap<Question, Integer> scoreOfEachQuestion) {
        this.scoreOfEachQuestion = scoreOfEachQuestion;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}