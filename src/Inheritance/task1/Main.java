package Inheritance.task1;

public class Main {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Camry camry = new Camry(2020, "red");
        Supra supra = new Supra(2004, "black");

        camry.privod = "peredniy";
        camry.rule = "right";
        supra.privod = "zadniy";
        supra.rule = "left";

        camry.showInfo();
        supra.showInfo();

    }
}
