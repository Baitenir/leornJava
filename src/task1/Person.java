package Incapsulation.task1;

public class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    public void showInfo(Person pers){
        System.out.println("Name: " + pers.getName() + ", Age: " + pers.getAge());
    }

    public void showAllInformation(Person[] people){
        for (Person person : people) {
            showInfo(person);
        }
        System.out.println("______________________________________________");
    }
}
