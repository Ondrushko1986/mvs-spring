package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Model.Car;
import web.service.CarService;

@Controller

public class CarController {

    CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public Model getPage(Model model) {
//        ModelAndView modelAndView = new ModelAndView("cars/list");
//        List<Car> list = carService.listCars();
//        modelAndView.addObject("list", list);
        model.addAttribute("car1", getCar1());
        model.addAttribute("car2", getCar2());
        model.addAttribute("car3", getCar3());
        return model;
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


}
