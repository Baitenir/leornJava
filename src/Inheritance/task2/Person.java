package Inheritance.task2;

public class Person{
    String name;
    String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;

    }

    public void learn (){
        System.out.println("I'm learning");
    }
    public void walk(){
        System.out.println("I'm walking");
    }
    public void eat(){
        System.out.println("I'm eating");
    }

}
