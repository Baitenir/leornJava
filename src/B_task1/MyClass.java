package Constructor.B_task1;

public class MyClass {
    String name;
    String lastName;
    int age;
    String[] peaksoftLessons;
    String favoriteFood;


    public MyClass (String name, String lastName, int age, String[] peaksoftLessons, String favoriteFood){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.peaksoftLessons = peaksoftLessons;
        this.favoriteFood = favoriteFood;
    }


    public MyClass (String name, int age, String favoriteFood){
        this.name = name;
        this.age = age;
        this.favoriteFood = favoriteFood;
    }

    public void showInfo() {
        System.out.println("Аты: " + name);
        System.out.println("Фамилиясы: " + lastName);
        System.out.println("Жашы: " + age);
        if (peaksoftLessons != null) {
            System.out.println("Peaksoft сабактары: " + String.join(", ", peaksoftLessons));
        }
        if (favoriteFood != null) {
            System.out.println("Жакшы көргөн тамагы: " + favoriteFood);
        }
        System.out.println("-------------------------");
    }
}



