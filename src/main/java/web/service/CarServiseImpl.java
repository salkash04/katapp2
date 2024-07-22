package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiseImpl implements CarService {

    @Override
    public List<Car> carCount(List<Car> list, int count) {
        int maxCount = Math.min(count, 5);

        return list.subList(0, maxCount);
    }


    @Override
    public List<Car> createCar() {
        List<Car> create = new ArrayList<>();
        create.add(new Car("Vesta", 1010));
        create.add(new Car("Lada", 2109));
        create.add(new Car("Largus", 999));
        create.add(new Car("Granta", 777));
        create.add(new Car("Kalina", 111));
        return create;
    }

}
