package com.company;

public class Main {

    public static void main(String[] args) {

        Programmer programmer = new Programmer("Ulan", "Java developer", "Peaksoft");
        Dancer dancer = new Dancer("Maks", "Hip-hop dancer", "KG_DANCE");
        Singer singer = new Singer("Jenny", "Country singer", "B12");

        System.out.println(programmer);
        programmer.coding();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("********************");
        System.out.println(dancer);
        dancer.dancing();
        programmer.learn();
        programmer.walk();
        programmer.eat();
        System.out.println("********************");
        System.out.println(singer);
        singer.singing();
        singer.playingGuitar();
        programmer.learn();
        programmer.walk();
        programmer.eat();
    }
}
