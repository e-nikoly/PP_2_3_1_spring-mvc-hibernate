package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private static int CAR_COUNT;
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(++CAR_COUNT, "mercedes", "black"));
        cars.add(new Car(++CAR_COUNT, "honda", "white"));
        cars.add(new Car(++CAR_COUNT, "toyota", "red"));
        cars.add(new Car(++CAR_COUNT, "nissan", "blue"));
        cars.add(new Car(++CAR_COUNT, "audi", "green"));

    }

    @Override
    public List<Car> listCars() {
        return cars;
    }
    @Override
    public List<Car> getCarSubList(Integer count) {
        return count > 0 && count < cars.size() ? cars.subList(0, count) : cars;
    }
}
