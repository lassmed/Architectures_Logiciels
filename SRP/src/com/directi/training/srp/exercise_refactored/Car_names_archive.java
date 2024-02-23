package com.directi.training.srp.exercise_refactored;

import com.directi.training.srp.exercise.Car;

import java.util.Arrays;
import java.util.List;

public class Car_names_archive {

    List<Car> _carsDb = Car_DB.GetAllCars();

    public String getCarsNames()
    {
        StringBuilder sb = new StringBuilder();
        for (Car car : _carsDb) {
            sb.append(car.getBrand());
            sb.append(" ");
            sb.append(car.getModel());
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}
