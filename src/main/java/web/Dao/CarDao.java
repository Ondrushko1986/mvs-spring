package web.Dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.Model.Car;
//import web.Model.Car;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class CarDao implements Dao {

//    @Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }


    @Override
    public void addCar(Car car) {
        getSession().save(car);
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Car> listCars() {
        Criteria criteria = getSession().createCriteria(Car.class);
        return (List<Car>) criteria.list();
    }

    @Override
    public void saveOrUpdate(Car car) {
        getSession().saveOrUpdate(car);
    }

    @Override
    public Car findCarById(int id) {
        Car car = getSession().get(Car.class, id);
        return car;
    }

    @Override
    public void deleteCar(int id) {
        Car car = getSession().get(Car.class, id);
        getSession().delete(car);
    }
}
