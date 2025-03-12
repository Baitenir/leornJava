package Incapsulation1;

public class University {
    private String director;
    private int quantityStudents;

    public String getDirector(){
        return director;
    }
    public void setDirector(String director){
        this.director = director;
    }

    public int getQuantityStudents() {
        return quantityStudents;
    }
    public void setQuantityStudents(int quantityStudents) {
        this.quantityStudents = quantityStudents;
    }

    public void showInfo(University univer){
        System.out.println("Name director of university: "+univer.getDirector() +", Quantity students in university: " + univer.getQuantityStudents());
    }

    public void showAllInfo(University[] univer){
        for (University university : univer) {
            showInfo(university);
        }
        System.out.println("______________________________________________");
    }
}
