package ir.ac.kntu;

public class Class {
    private String name;
    private String institution;
    private String teacher;
    private String academicYear;
    private boolean open;
    private boolean general;
    private String password;
    private String classDetails;

    public Class(String name, String institution, String teacher, String academicYear, boolean open, boolean general, String password, String classDetails) {
        this.name = name;
        this.institution = institution;
        this.teacher = teacher;
        this.academicYear = academicYear;
        this.open = open;
        this.general = general;
        this.password = password;
        this.classDetails = classDetails;
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
    public String getTeacher() {
        return teacher;
    }
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getAcademicYear() {
        return academicYear;
    }
    public void setAcademicYear(String academicYear) {
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
    

    

}