package com.directi.training.srp.exercise_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.List;

public class Car_DB {

    public static List<Car>  GetAllCars(){
        // Code pour recuperer la liste des voitures de la base de donnees
        return null;
    }
    List<Car> _carsDb = GetAllCars();

    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }
}
