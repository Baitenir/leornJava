package Incapsulation.task1;

public class School {
    private String director;
    private int number;

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }

    public void showInfo(School sc){
        System.out.println("Name director: "+sc.getDirector() + ", age: " + sc.getNumber());
    }

    public void showAllInfo(School[] sc){
        for (School school : sc) {
            showInfo(school);
        }
        System.out.println("______________________________________________");
    }
}
