package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Student student = new Student.Builder().nameIs("Tharuka").ageIs(23).idIs(38).build();

        System.out.println(student.getClass());

    }
}
