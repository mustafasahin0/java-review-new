package review;

import java.util.List;

public class MyUtils<T extends Person> {

    public void printInfo(List<T> personList) {

        for (T person : personList) {
            System.out.println(person);
        }

        System.out.println(personList.size());
    }

    // write a method that will take list of objects and returns the last element in the list

    public T returnLastElement(List<T> personList) {
        return personList.get(personList.size() - 1);
    }

    //write a method that takes a list of object and prints everyone's names one by one

    public void printNames(List<T> personList) {
        for (T person : personList) {
            System.out.println(person.getName());
        }
    }

    public static void main(String[] args) {

        MyUtils<Student> myUtils = new MyUtils<>();

//        myUtils.printInfo();

    }
}
