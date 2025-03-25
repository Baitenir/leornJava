package abstraction.task1;

public class SubCar extends Car{

    public SubCar() {
    }

    public SubCar(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    public void gas() {
        System.out.println("Car touch the gas");
    }

    @Override
    public void brake() {
        System.out.println("Car touch the brake");
    }
}
