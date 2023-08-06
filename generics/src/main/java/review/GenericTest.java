package review;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Mike", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Eric", 101));
        teacherList.add(new Teacher("David", 102));

        //write a method that takes a list of students and prints each student object and the total count of students

        studentInfo(studentList);
        printInfo(teacherList);
    }

    public static  void studentInfo(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student.toString());
        }

        System.out.println(studentList.size());
    }

    public static <T> void printInfo(List<T> personList) {

        for (T person : personList) {
            System.out.println(person);
        }

        System.out.println(personList.size());
    }

    // write a method that will take list of objects and returns the last element in the list
}
