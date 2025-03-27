package Interface.task2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        EducationCenter college = new College("Ala-Too" , "Kyrgyzstan", LocalDate.of(2015, 2,24));
        EducationCenter university = new University("Garvard", "USA", LocalDate.of(2002, 5,12));
        EducationCenter school = new School("Nanaev" , "Kyrgyzstan", LocalDate.of(1948, 11,25));

        Student student1 = new Student("Bakai", "Bakirovich", "Male", LocalDate.of(2022, 3,3) ,university);
        Student student2 = new Student("Cholpon", "Ataiova", "Female", LocalDate.of(2021, 3,3) ,college);
        Student student3 = new Student("Urmat", "Sharipovich", "Male", LocalDate.of(2013, 3,3) ,school);
        Student student4 = new Student("Symbat", "Beknazarov", "Male", LocalDate.of(2023, 3,3) ,college);
        Student student5 = new Student("Aibyike", "Azimzhanova", "Female", LocalDate.of(2022, 3,3) ,college);
        Student student6 = new Student("Nurik", "Purik", "Male", LocalDate.of(2022, 3,3) ,university);
        Student student7 = new Student("Beka", "Faricov", "Male", LocalDate.of(2013, 3,3) ,school);
        Student student8 = new Student("Ermek", "Eraliev", "Male", LocalDate.of(2020, 3,3) ,college);
        Student student9 = new Student("Aiperi", "Jusupova", "Female", LocalDate.of(2023, 3,3) ,university);
        Student student10 = new Student("Sadyk", "Muratovich", "Male", LocalDate.of(2022, 3,3) ,college);

        Student[] students = new Student[] { student1, student2, student3, student4, student5, student6, student7, student8, student9, student10 };
        getStudentInfo(students, college);
    }
    public static void getStudentInfo (Student[] students, EducationCenter educationCenter){
        int c=1;
        for (Student student : students) {
            System.out.println("_______________________________");
            System.out.println("Student " + c++ +"-");
            System.out.println(student.getName());
            System.out.println(student.getSurName());
            System.out.println(student.getGender());
            System.out.println(student.getDateOfStart());
            System.out.println("Education info: ");
            System.out.println(student.getEducationCenter().getName());
            System.out.println(student.educationCenter.getLocatedCountry());
            System.out.println(student.getEducationCenter().getFoundationYear());
        }
    }
}

//    EducationCenter деген абстракт класс тузунуз. Полелери: name, locatedCountry, LocalDate foundationYear;
//    Абстракт класска School , University, College деген саб класстарды тузунуз.
//    Study деген интерфейс тузуп, ичине void getStudentsEducationCenter(), void getStudentsStudyingYear()  деген 2 метод тузунуз.
//    Student деген класс тузунуз. Полелери: name, surname, Gender gender,  LocalDate dateOfStart()(студент кайсыл жылы окуп баштаганы), EducationCenter educationCenter;
//    Main класста студенттердин массивин тузуп ичине 10 студент салыныз. Студенттер ар кандай окуу жайда окусун.
//    Main класста 1 метод тузунуз.
//    1 - метод бардык студенттер жонундо маалыматты, кайсыл студент кайсы окуу жайда окуганы тууралу маалыматты жана окуганыны канча жыл болгону тууралу маалыматты чыгарып берсин.