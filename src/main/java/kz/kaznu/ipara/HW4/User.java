package kz.kaznu.ipara.HW4;

public class User {
    public String lastName;
    public String firstName;
    public String middleName;
    public int birthYear;
    public String email;


    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getEmail() {
        return email;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public User(String lastName, String firstName, String middleName, int birthYear, String email) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    public void displayInfo() {
        System.out.println("ФИО: " + firstName + " " + lastName + " " + middleName + " " + ", Год рождения: " + birthYear + ", Email: " + email);
    }
}
