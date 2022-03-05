package com.company;

public class Programmer extends Person{
    private String companyName;

    public void coding(){
        System.out.println(getName() + " is coding.");
    }
    @Override
    public String toString(){
        return companyName;
    }

    public Programmer(){

    }
    public Programmer(String companyName) {
        this.companyName = companyName;
    }
}
