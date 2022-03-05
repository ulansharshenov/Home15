package com.company;

public class Dancer extends Person{
    private String groupName;

    public void dancing(){
        System.out.println(getName() + " is dancing.");
    }
    @Override
    public String toString(){
        return groupName;
    }

    public Dancer(){

    }
    public Dancer(String groupName) {
        this.groupName = groupName;
    }
}
