package ir.ac.kntu;

import java.util.Scanner;

public class User {
    private String name;
    private String userName;
    private String email;
    private String password;
    private String nationalCode;
    private String phone;

    public User() {

    }

    public User(String name, String userName, String email, String password, String nationalCode, String phone) {
        this.name = name;
        this.userName = userName;
        this.email = email;
        this.password = password;
        this.nationalCode = nationalCode;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        while (true) {
            if (email.matches("\\S+@\\w+\\.\\S+")) {
                this.email = email;
                break;
            } else {
                System.out.println("it is not an accepteble email!");
                System.out.println("please try again with (*@*.*)");
                String input = (new Scanner(System.in)).nextLine();
                setEmail(input);
            }
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        User that = (User) obj;
        if (!name.equals(that.name)) {
            return false;
        }
        if (!userName.equals(that.userName)) {
            return false;
        }
        if (!password.equals(that.password)) {
            return false;
        }
        if (!email.equals(that.email)) {
            return false;
        }
        if (!nationalCode.equals(that.nationalCode)) {
            return false;
        }
        if (!phone.equals(that.phone)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return userName.hashCode() + password.hashCode();
    }
}