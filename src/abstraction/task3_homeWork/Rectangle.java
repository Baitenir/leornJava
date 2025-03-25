package abstraction.task3_homeWork;

public class Rectangle extends Shape{

    public Rectangle(double width, double height) {
        super(width, height);
    }


    @Override
    public double getPerimeter() {
        return getWidth() + getHeight() + getWidth() + getHeight();
    }
}
