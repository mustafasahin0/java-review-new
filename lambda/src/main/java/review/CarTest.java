package review;

import comparator.Apple;

import java.util.ArrayList;
import java.util.List;

public class CarTest {

    public static void main(String[] args) {

//        Car car = Car.builder().make("Toyota").topSpeed(150).year(2020).build();
//        System.out.println(car.toString());
//
//        Car car2 = Car.builder().topSpeed(150).year(2020).build();
//        System.out.println(car2.toString());

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", 140, 1998));
        carList.add(new Car("Audi", 200, 2008));
        carList.add(new Car("BMW", 210, 2020));
        carList.add(new Car("Nissan", 150, 2018));

//        System.out.println("Fast Cars: ");
//        System.out.println(filterFastCars(carList));
//
//        System.out.println("New Cars: ");
//        System.out.println(filterNewCars(carList));

        System.out.println("Fast Cars: ");
        System.out.println(filter(carList, new CarFastPredicate()));

        System.out.println("New Cars: ");
        System.out.println(filter(carList, new CarNewPredicate()));

        System.out.println("New Cars: ");
        System.out.println(filter(carList, car -> car.getYear() > 2015));


    }

//    private static List<Car> filterFastCars(List<Car> cars) {
//
//        List<Car> filteredCars = new ArrayList<>();
//        for (Car car : cars) {
//            if (car.getTopSpeed() > 160) {
//                filteredCars.add(car);
//            }
//        }
//
//        return filteredCars;
//    }
//
//    private static List<Car> filterNewCars(List<Car> cars) {
//
//        List<Car> filteredCars = new ArrayList<>();
//        for (Car car : cars) {
//            if (car.getYear() > 2015) {
//                filteredCars.add(car);
//            }
//        }
//
//        return filteredCars;
//    }

    private static List<Car> filter(List<Car> cars, CarPredicate carPredicate) {
        List<Car> filteredCars = new ArrayList<>();

        for (Car car : cars) {
            if (carPredicate.test(car)) {
                filteredCars.add(car);
            }
        }
        return filteredCars;
    }
}
