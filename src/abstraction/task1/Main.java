package abstraction.task1;

public class Main {
    public static void main(String[] args) {

        Car subCar = new SubCar();
        subCar.setModel("Supra");
        subCar.setColor("black");
        subCar.setMaxSpeed(420);

        SubCar2 subCar2 = new SubCar2();
        subCar2.setModel("Skyline");
        subCar2.setColor("red");
        subCar2.setMaxSpeed(380);

        subCar.gas();
        subCar.brake();

        subCar2.gas();
        subCar2.brake();

    }
}
