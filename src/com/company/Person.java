package com.company;

public class Person {
    private String name;
    private String designation;

    public void learn(){
        System.out.println(name + " is learning.");
    }

    public void walk(){
        System.out.println(name + " is walking.");
    }

    public void eat(){
        System.out.println(name + " is eating. ");
    }
    public Person(){

    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    @Override
    public String toString(){
        return name + " is " + designation;
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
