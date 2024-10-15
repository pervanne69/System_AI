package ru.mirea.lab13.lab13_2;

public class Person {
    private String firstName;
    private String middleName;
    private String lastName;

    public Person(String lastName, String firstName, String middleName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        StringBuilder fullName = new StringBuilder();

        if (lastName != null && !lastName.isEmpty()) {
            fullName.append(lastName);
        }


        if (firstName != null && !firstName.isEmpty()) {
            fullName.append(" ");
            fullName.append(firstName.toUpperCase().charAt(0)).append(".");
            if (middleName != null && !middleName.isEmpty()) {
                fullName.append(middleName.toUpperCase().charAt(0)).append(".");
            }
        }


        return fullName.toString().trim();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}
