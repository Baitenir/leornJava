package Inheritance.task2;

public class Main {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Baha", "Java diveloper", "Google");
        Dancer dancer = new Dancer("Toni", "Kara jorgo", "Jorgolor");
        Singer singer = new Singer("Joni", "Fonk", "Singerler");

        System.out.println(programmer.toString1());
        programmer.learn();
        programmer.walk();
        programmer.eat();
        programmer.coding();
        System.out.println(dancer.toString2());
        dancer.learn();
        dancer.walk();
        dancer.eat();
        dancer.dancing();
        System.out.println(singer.toString3());
        singer.learn();
        singer.walk();
        singer.eat();
        singer.sing();
        singer.playGitar();
    }
}
