package modifiers.task2;

public class Circle {
    private int PI;
    private int radius;

    public Circle() {
    }

    public int getPI() {
        return PI;
    }

    public void setPI(int PI) {
        this.PI = PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

   public static double findArea (int pi, int radius){
        return pi * (radius * radius);
   }

    public static double circumference (int pi, int radius){
        return pi * 2 *radius;
    }
}
