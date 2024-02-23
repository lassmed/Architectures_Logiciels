package com.directi.training.srp.exercise_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.List;

public class Best_Car {

    List<Car> _carsDb = Car_DB.GetAllCars();

    public Car getBestCar()
    {
        Car bestCar = null;
        for (Car car : _carsDb) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
