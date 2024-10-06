package ru.mirea.lab11.lab11_1;

import java.util.Date;

public class Developer {
    private String surname;
    private Date receiveTask;
    private Date solveTask;

    public Developer(String surname, Date receiveTask) {
        this.surname = surname;
        this.receiveTask = receiveTask;
        this.solveTask = null;
    }

    public String getSurname() {
        return surname;
    }

    public Date getReceiveTask() {
        return receiveTask;
    }

    public Date getSolveTask() {
        return solveTask;
    }

    public void setSolveTask(Date endDate) {
        this.solveTask = endDate;
    }

    @Override
    public String toString() {
        return "Developer{surname='" + surname + "', " +
                "startDate=" + receiveTask + ", endDate=" + solveTask + "}";
    }
}
