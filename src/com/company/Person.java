package com.company;

public class Person {
    private String name;
    private String designation;

    public Person() {

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public void learn(){
        System.out.println(this.name + " is learning.");
    }

    public void walk(){
        System.out.println(this.name + " is walking.");
    }

    public void eat(){
        System.out.println(this.name + " is eating. ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
