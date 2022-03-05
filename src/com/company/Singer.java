package com.company;

public class Singer extends Person{
    private String bandName;

    public void singing(){
        System.out.println(getName() + " is singing. ");
    }
    @Override
    public String toString(){
        return bandName;
    }

    public Singer(){

    }
    public Singer(String bandName) {
        this.bandName = bandName;
    }
}
