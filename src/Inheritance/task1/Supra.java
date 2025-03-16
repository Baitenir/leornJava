package Inheritance.task1;

public class Supra extends Toyota {
    int year;
    String color;

    public Supra(int year, String color){
        this.year = year;
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("Supra: ");
        super.showInfo();
        System.out.println("year: " + year);
        System.out.println("color: " + color );
    }
}
