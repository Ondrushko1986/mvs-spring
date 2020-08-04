package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {

    CarService carService;


    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }



    @GetMapping(value = "/cars")
    public String getPage(Model model, @RequestParam("locale") String locale) {
        if (locale.equals("ru")) {
            model.addAttribute("header", "МАШИНЫ");
            model.addAttribute("cars",getCarsList());
            return "cars";
        } else
            model.addAttribute("header", "CARS");
            model.addAttribute("cars",getCarsList());
            return "cars";
    }

    private Car getCar1() {
        Car car = new Car();
        car.setId(1);
        car.setColor("blue");
        car.setName("volga");
        car.setSpeed(250);
        return car;
    }

    private Car getCar2() {
        Car car = new Car();
        car.setId(2);
        car.setColor("black");
        car.setName("bmw");
        car.setSpeed(250);
        return car;
    }

    private Car getCar3() {
        Car car = new Car();
        car.setId(3);
        car.setColor("brown");
        car.setName("audi");
        car.setSpeed(250);
        return car;
    }

    public List<Car> getCarsList(){
        List<Car> list = new ArrayList<>();
        list.add(getCar1());
        list.add(getCar2());
        list.add(getCar3());
        return list;
    }


}
