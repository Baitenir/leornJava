package Incapsulation1;

public class Car {
    private String marka;
    private int price;

    public String getMarka(){
        return marka;
    }
    public void setMarka(String marka){
        this.marka = marka;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public void showInfo(Car car){
        System.out.println("Marka: " + car.getMarka() + ", price: " + car.getPrice());
    }

    public void showAllInformation(Car[] cars){
        for (Car car : cars) {
            showInfo(car);
        }
        System.out.println("______________________________________________");
            }
    }

