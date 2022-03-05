package com.company;

public class Main {

    public static void main(String[] args) {
        Person person = new Person("Ulan", "Java developer");
        Person person2 = new Person("Urmat", "Hip hop dancer");
        Person person3 = new Person("Maks", "Country singer");

        Programmer programmer = new Programmer("Peaksoft");
        Dancer dancer = new Dancer("KG_DANCE");
        Singer singer = new Singer("B12");

        System.out.print(person);
        System.out.println(" at " + programmer);
        System.out.print(person2);
        System.out.println(" at " + dancer);
        System.out.print(person3);
        System.out.println(" at " + singer);
    }
}
