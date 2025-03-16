package Inheritance.task2;

public class Programmer extends Person{
    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("I'm coding");
        System.out.println();
    }

    public String toString1() {
        return "Singer{" +
                "name= "+ name + '\'' +
                "designation= "+designation+'\''+
                "company name= " + companyName + '\'' +
                '}';
    }

}
