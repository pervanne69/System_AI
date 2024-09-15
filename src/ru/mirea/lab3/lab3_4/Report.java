package ru.mirea.lab3.lab3_4;

public class Report {
    public static void generateReport(Employee[] employees) {
        for (Employee employee: employees) {
            System.out.println("Сотрудник  " + employee.getFullName() + " с зарплатой - " + employee.getSalary());
        }
    }
}
