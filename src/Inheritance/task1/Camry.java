package Inheritance.task1;

public class Camry extends Toyota {
    int year;
    String color;

    public Camry(int year, String color){
        this.year = year;
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("Camry: ");
        super.showInfo();
        System.out.println("year: " + year);
        System.out.println("color: " + color );
    }
}
