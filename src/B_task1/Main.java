package Constructor.B_task1;

public class Main {
    public static void main(String[] args) {
        String[] peaksoftLessons = new String[]{"OOP", "Math operation", "Constructor"};
        MyClass mc = new MyClass("Baitenir", "Busurmanov", 18, peaksoftLessons, "Beshbarmak");
        MyClass mc2 = new MyClass("Baitenir", 18, "Kuurdak");

        mc.showInfo();
        mc2.showInfo();


    }
}

//MyClass деген класс тузунуз
//
//Ал класста озунуз жонундо маалымат сактаган полелер болсун(атыныз, фамилияныз, жашыныз, Peaksoft то катышкан сабактарыныз(массив), жакшы коргон тамагыныз)
//
//Параметри эки башка болгон эки конструктор тузунуз
//
//MyClassтын 2 объектисин тузуп, конструктор аркылуу маани бериниз
//
//Эки объектке эки башка конструктор иштесин.
//
//Объекттердин маанилерин консольго чыгарыныз.