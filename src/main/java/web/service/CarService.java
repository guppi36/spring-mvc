package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    private List<Car> carsList;

    public CarService(List<Car> carsList) {
        this.carsList = carsList;
    }

    public List<Car> getCarsList(int value) {
        if(value >= 5) return carsList;
        List<Car> cars = new ArrayList<>();
        for (int i = 0; i < value; i++) {
            cars.add(carsList.get(i));
        }
        return cars;
    }

}
