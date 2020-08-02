package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.Dao.CarDao;
import web.Model.Car;


import javax.transaction.Transactional;
import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class CarService implements Service {

    private CarDao carDao;

    public CarService(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public void addCar(Car car) {
        carDao.addCar(car);
    }

    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }


    @Override
    public void saveOrUpdate(Car car) {
        carDao.saveOrUpdate(car);
    }

    @Override
    public Car findCarById(int id) {
        return carDao.findCarById(id);
    }

    @Override
    public void deleteCar(int id) {
        carDao.deleteCar(id);
    }
}
