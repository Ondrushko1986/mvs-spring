package web.Dao;

import web.Model.Car;

import java.util.List;

public interface Dao {
    void addCar(Car car);

    List<Car> listCars();

    void saveOrUpdate(Car car);

    public Car findCarById (int id);

    public void deleteCar(int id);
}
