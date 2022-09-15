package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCar(Model model, @RequestParam(value = "count", required = false, defaultValue = "0") Integer count) {
        List<Car> carList;
        if (count == null) {
            carList = carService.listCars();
        } else {
            carList = carService.getCarSubList(count);
        }
        model.addAttribute("cars", carList);
        return "cars";
    }
}
