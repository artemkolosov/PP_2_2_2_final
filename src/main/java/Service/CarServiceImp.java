package Service;

import Transport.Car;
import org.springframework.stereotype.Component;
import web.controller.CarController;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp {

    private static List<Car> car = new ArrayList<>();




    public static List <Car> showCars(Integer count){

        car.clear();

        car.add(new Car("Volga", "Red", "Ivanov"));
        car.add(new Car("BMV", "Blue", "Sidorov"));
        car.add(new Car("VAZ", "Pink", "Petrov"));
        car.add(new Car("Opel", "Orange", "Semenov"));
        car.add(new Car("Mercedes", "Brown", "Stepanov"));

        if (5 > count) {
            car.subList(count, 5).clear();
        }
        return car;

    }


}
