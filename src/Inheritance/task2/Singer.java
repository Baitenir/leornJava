package Inheritance.task2;

public class Singer extends Person {
    String bandName;

    public Singer(String name, String designation, String bandName){
        super(name, designation );
        this.bandName = bandName;
    }

    public void sing (){
        System.out.println("I'm singing");
    }
    public void playGitar(){
        System.out.println("I'm play the gitar");
        System.out.println();
    }

    public String toString3() {
        return "Singer{" +
                "name= "+ name + '\'' +
                "designation= "+designation+'\''+
                "bandName= " + bandName + '\'' +
                '}';
    }
}
