package abstraction.task3_homeWork;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(20,30);
        double perimeterRectangle = rectangle.getPerimeter();
        System.out.println(perimeterRectangle);
    }
}
