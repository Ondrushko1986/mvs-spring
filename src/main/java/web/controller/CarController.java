//package web.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//import web.Model.Car;
//import web.service.CarService;
//
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/cars")
//public class CarController {
//
//    CarService carService;
//
//    @Autowired
//    public CarController(CarService carService) {
//        this.carService = carService;
//    }
//
//    @RequestMapping("/")
//    public ModelAndView home() {
//        ModelAndView modelAndView = new ModelAndView("index");
//        modelAndView.addObject("message", "Hello from my Spring MVC");
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public ModelAndView list() {
//        ModelAndView modelAndView = new ModelAndView("cars/list");
//        List<Car> list = carService.ListCars();
//        modelAndView.addObject("list", list);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/add", method = RequestMethod.GET)
//    public ModelAndView add() {
//        ModelAndView modelAndView = new ModelAndView("cars/form");
//        Car car = new Car();
//        modelAndView.addObject("CarForm", car);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
//    public ModelAndView update(@PathVariable("id") int id) {
//        ModelAndView modelAndView = new ModelAndView("cars/form");
//        Car car = carService.findCarById(id);
//        modelAndView.addObject("CarForm", car);
//        return modelAndView;
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public ModelAndView save(@ModelAttribute("CarForm") Car car) {
//        carService.saveOrUpdate(car);
//        return new ModelAndView("redirect:/cars/list");
//    }
//
//
//}
