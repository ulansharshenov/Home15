package com.company;

public class Dancer extends Person{
    private String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer{" +
                "Name:" + super.getName() +
                " Designation:" + super.getDesignation() +
                " Group name:" + groupName +
                "}";
    }

    public void dancing(){
        System.out.println(getName() + " is dancing.");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
}
