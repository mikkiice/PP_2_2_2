package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    private List<Car> cars = new ArrayList<>();
    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("BMW", "blue" , 2021));
        cars.add(new Car("Audi", "red" , 2022));
        cars.add(new Car("Honda", "yellow" , 2023));
        cars.add(new Car("Mercedes", "green" , 2024));
        cars.add(new Car("Ford", "red" , 2025));
    }
    @Override
    public List<Car> getAllCars() {
        return cars;
    }

    @Override
    public List<Car> getCars(int count) {

        if (count > cars.size()) {
            count = cars.size();
        }

        return cars.subList(0, count);
    }
}
