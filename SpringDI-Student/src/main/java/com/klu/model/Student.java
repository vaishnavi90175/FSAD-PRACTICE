package com.klu.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int studentId;
    private String name;
    private String course;
    private int year;

    // Constructor Injection
    public Student(
            @Value("102") int studentId,
            @Value("Rahul") String name,
            @Value("Java") String course,
            @Value("2024") int year) {

        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.year = year;
    }

    // Setter Injection
    @Value("Spring Boot")
    public void setCourse(String course) {
        this.course = course;
    }

    @Value("2025")
    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println("Student ID : " + studentId);
        System.out.println("Name       : " + name);
        System.out.println("Course     : " + course);
        System.out.println("Year       : " + year);
    }
}
