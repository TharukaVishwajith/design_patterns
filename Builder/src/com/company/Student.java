package com.company;

/**
 * Created by Asus PC on 1/25/2017.
 */
public class Student {

    private String name;
    private int age;
    private int id;

    Student(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.id = builder.id;
    }

    static class Builder{
        private String name;
        private int age;
        private int id;

        public Builder nameIs(String name){
            this.name = name;
            return this;
        }
        public Builder ageIs(int age){
            this.age = age;
            return this;
        }
        public Builder idIs(int id){
            this.id = id;
            return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

}
