package ru.job4j.pojo;

import java.time.LocalDate;

public class College {
    public static void main(String[] args) {
        Student oneStudent = new Student();
        oneStudent.setName("Ivan");
        oneStudent.setSurname("Dushkin");
        oneStudent.setPatronymic("Viktorovich");
        oneStudent.setGroup("PM");
        oneStudent.setData(LocalDate.of(2020, 12, 12));

        System.out.printf("Student: %s %s %s." + System.lineSeparator()
                        + "Group is: %s." + System.lineSeparator() + "Date is: %s.",
                oneStudent.getName(),
                oneStudent.getSurname(),
                oneStudent.getPatronymic(),
                oneStudent.getGroup(),
                oneStudent.getData()
        );
    }
}
