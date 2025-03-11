package Incapsulation.task1;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();

        car1.setMarka("Toyota");
        car1.setPrice(30000);

        car2.setMarka("Lexus");
        car2.setPrice(50000);

        car3.setMarka("Nissan");
        car3.setPrice(25000);
        Car[] cars = new Car[] { car1, car2, car3 };


        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();

        person1.setName("Timur");
        person1.setAge(27);

        person2.setName("Sofia");
        person2.setAge(22);

        person3.setName("Antonio");
        person3.setAge(34);
        Person[] people = new Person[] { person1, person2, person3 };


        School school1 = new School();
        School school2 = new School();
        School school3 = new School();

        school1.setDirector("Gloria");
        school1.setNumber(48);

        school2.setDirector("Shrek");
        school2.setNumber(55);

        school3.setDirector("Sadyr");
        school3.setNumber(36);
        School[] schools = new School[] { school1, school2, school3 };

        University university1 = new University();
        University university2 = new University();
        University university3 = new University();

        university1.setDirector("Angelina");
        university1.setQuantityStudents(800);

        university2.setDirector("Fiona");
        university2.setQuantityStudents(1200);

        university3.setDirector("Nicolo");
        university3.setQuantityStudents(770);
        University[] universities = new University[] { university1, university2, university3 };

        car1.showAllInformation(cars);
        person1.showAllInformation(people);
        school3.showAllInfo(schools);
        university1.showAllInfo(universities);

    }
}

//University, School, Car жана Person деген класс тузунуз
//
//Алардын свойстваларын ойлоп табыныз
//
//Геттер сеттерлерди маани беруу жана алуу учун колдонуу керек
//
//Ар бир класска 3-4 тон объект тузуп жана аларга маанилерин бериниз
//
//Ар бир класстын объектилерин оз-озунчо массивке салып, аларды консольго чыгарыныз