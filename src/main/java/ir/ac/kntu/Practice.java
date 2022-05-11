package ir.ac.kntu;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Practice {
    private String name;

    private String details;

    private LocalDateTime deadline;

    private LocalDateTime extraTime;

    private double delayCoefficient;

    private ArrayList<Question> questions;

    private Scoreboard scoreboard;

    private boolean schedule;

    public Practice() {
        questions = new ArrayList<>();
    }

    public Practice(String name, String details, LocalDateTime deadline, LocalDateTime extraTime,
            double delayCoefficient, ArrayList<Question> questions, boolean schedule) {
        this.name = name;
        this.details = details;
        this.deadline = deadline;
        this.extraTime = extraTime;
        this.delayCoefficient = delayCoefficient;
        this.questions = questions;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDateTime getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDateTime deadline) {
        this.deadline = deadline;
    }

    public LocalDateTime getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(LocalDateTime extraTime) {
        this.extraTime = extraTime;
    }

    public double getDelayCoefficient() {
        return delayCoefficient;
    }

    public void setDelayCoefficient(double delayCoefficient) {
        this.delayCoefficient = delayCoefficient;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public Scoreboard getScoreboard() {
        return scoreboard;
    }

    public void setScoreboard(Scoreboard scoreboard) {
        this.scoreboard = scoreboard;
    }

    public boolean isSchedule() {
        return schedule;
    }

    public void setSchedule(boolean schedule) {
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "\nname = " + name + "\ndetails = " + details + "\ndeadline = " + deadline + "\nextraTime = " + extraTime
                + "\ndelayCoefficient = " + delayCoefficient;
    }

}