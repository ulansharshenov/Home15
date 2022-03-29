package com.company;

public class Singer extends Person{
    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "Name:" + super.getName() +
                " Designation:" + super.getDesignation() +
                " Band name:" + bandName +
                "}";
    }

    public void singing(){
        System.out.println(getName() + " is singing. ");
    }

    public void playingGuitar(){
        System.out.println(getName() + " is playing guitar. ");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
}
