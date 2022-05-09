package ir.ac.kntu;

import java.util.ArrayList;

public class Practice {
    private String name;
    private String details;
    private Date date;
    private int extraTime;
    private double delayCoefficient;
    private ArrayList<Question> questions;

    public Practice() {
        questions = new ArrayList<>();
    }

    public Practice(String name, String details, Date date, int extraTime, double delayCoefficient, ArrayList<Question> questions) {
        this.name = name;
        this.details = details;
        this.date = date;
        this.extraTime = extraTime;
        this.delayCoefficient = delayCoefficient;
        this.questions = questions;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getExtraTime() {
        return extraTime;
    }

    public void setExtraTime(int extraTime) {
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
    
}