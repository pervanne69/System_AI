package ru.mirea.lab2;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setGender(String newGender) {
        this.name = newGender;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    @Override
    public String toString() {
        return "Author: " + "\n" +
                "Name: " + name + "\n" +
                "Email: " + email + "\n" +
                "Gender - " + gender;
    }
}
