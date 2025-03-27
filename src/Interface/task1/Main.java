package Interface.task1;

public class Main {
    public static void main(String[] args) {

        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        Turtle turtle1 = new Turtle();
        Turtle turtle2 = new Turtle();
        Shark shark1 = new Shark();
        Shark shark2 = new Shark();



        SwimAble[] ocean = new SwimAble[]{duck1, duck2, turtle1, turtle2, shark1, shark2};
        for (SwimAble swimAble : ocean) {
            swimAble.swim();
        }

    }
}
