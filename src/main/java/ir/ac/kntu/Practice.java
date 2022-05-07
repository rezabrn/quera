package ir.ac.kntu;

public class Practice {
    private String name;
    private String details;
    private Date date;
    private int extraTime;
    private double delayCoefficient;

    public Practice(String name, String details, Date date, int extraTime, double delayCoefficient) {
        this.name = name;
        this.details = details;
        this.date = date;
        this.extraTime = extraTime;
        this.delayCoefficient = delayCoefficient;
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

    
    
}