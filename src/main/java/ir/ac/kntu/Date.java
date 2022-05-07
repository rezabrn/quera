package ir.ac.kntu;

public class dateOfOwning {
    private int start;
    private int finish;

    dateOfOwning(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getFinish() {
        return this.finish;
    }

    public void setFinish(int finish) {
        this.finish = finish;
    }

    @Override
    public String toString() {
        return "dateOfOwning [finish=" + finish + ", start=" + start + "]";
    }

    
}