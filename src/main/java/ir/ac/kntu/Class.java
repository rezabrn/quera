package ir.ac.kntu;

import java.util.ArrayList;

public class Class {
    private String name;
    private String institution;
    private User teacher;
    private int academicYear;
    private boolean open;
    private boolean general;
    private String password;
    private String classDetails;
    private ArrayList<User> students;
    private ArrayList<Practice> practices;

    public Class() {
        practices = new ArrayList<>();
    }

    public Class(String name, String institution, User teacher, int academicYear, boolean open, boolean general,
            String password, String classDetails, ArrayList<User> students, ArrayList<Practice> practices) {
        this.name = name;
        this.institution = institution;
        this.teacher = teacher;
        this.academicYear = academicYear;
        this.open = open;
        this.general = general;
        this.password = password;
        this.classDetails = classDetails;
        this.students = students;
        this.practices = practices;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public int getAcademicYear() {
        return academicYear;
    }

    public void setAcademicYear(int academicYear) {
        this.academicYear = academicYear;
    }

    public boolean isOpen() {
        return open;
    }

    public void setOpen(boolean open) {
        this.open = open;
    }

    public boolean isGeneral() {
        return general;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getClassDetails() {
        return classDetails;
    }

    public void setClassDetails(String classDetails) {
        this.classDetails = classDetails;
    }

    public ArrayList<User> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<User> students) {
        this.students = students;
    }

    public ArrayList<Practice> getPractices() {
        return practices;
    }

    public void setPractices(ArrayList<Practice> practices) {
        this.practices = practices;
    }

    @Override
    public String toString() {
        return "academicYear =" + academicYear +
                "classDetails =" + classDetails +
                "general =" + general +
                "institution =" + institution +
                "name =" + name +
                "open =" + open +
                "password =" + password +
                "teacher =" + teacher.getName();
    }
}