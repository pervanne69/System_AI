package ru.mirea.lab2.lab2_2;

public class Dog {
    private String nickname;
    private int age;

    public Dog(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }
    public int getAge() {
        return age;
    }
    public void setNickname(String newNickname) {
        this.nickname = newNickname;
    }
    public void setAge(int newAge) {
        this.age = newAge;
    }
    public int toHumanAge(int age) {
        return age * 7;
    }
    @Override
    public String toString() {
        return "Собака по кличке: " + nickname + "\n" +
                "Возраст собаки - " + age;
    }
}
