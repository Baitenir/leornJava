package Inheritance.task2;

public class Dancer extends Person{
    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public void dancing (){
        System.out.println("I'm dancing");
        System.out.println();
    }
    public String toString2() {
        return "Singer{" +
                "name= "+ name + '\'' +
                "designation= "+designation+'\''+
                "groupName= " + groupName + '\'' +
                '}';
    }


}
