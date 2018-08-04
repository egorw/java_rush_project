package com.javarush.task.task29.task2909.human;

import java.util.*;

public class University {

    private String name;
    private int age;
    private List<Student> students = new ArrayList<>();

    public University(String name, int age) {
        this.name = name;
        this.age =age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Student getStudentWithAverageGrade(double averageGrade) {
        //TODO:
        for (Student student : students){
            if (student.getAverageGrade() == averageGrade)
                return student;
        }
        return null;
    }

    public Student getStudentWithMaxAverageGrade() {
        //TODO:
        double maxGrade = 0;
        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() > maxGrade) {
                maxGrade = students.get(i).getAverageGrade();
                index = i;
            }
        }

        return students.get(index);
    }

    public Student getStudentWithMinAverageGrade() {

        double minGrade = 100;
        int index = 0;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAverageGrade() < minGrade) {
                minGrade = students.get(i).getAverageGrade();
                index = i;
            }
        }

        return students.get(index);
    }

    public void expel(Student student){
        students.remove(student);
    }
}