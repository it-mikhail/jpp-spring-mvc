package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarService {

    CarDaoImpl carDao = new CarDaoImpl();

    public CarService() {}

    public List<Car> getCarList() {
        return carDao.getCarList();
    }

    public List<Car> getCarList(int limit) {
        if (limit > 0 && limit < 5) {
            return carDao.getCarList(limit);
        } else {
            return carDao.getCarList();
        }
    }

}
