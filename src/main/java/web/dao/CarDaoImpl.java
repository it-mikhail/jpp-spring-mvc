package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    List<Car> carList = new ArrayList<>();

    public CarDaoImpl() {
        carList.add(new Car(1, "ford", "taurus", 1996));
        carList.add(new Car(2, "mazda", "323", 1997));
        carList.add(new Car(3, "toyota", "corolla", 1998));
        carList.add(new Car(4, "renault", "logan", 1999));
        carList.add(new Car(5, "peugeot", "306", 2000));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getCarList(int limit) {
        return carList.subList(0, limit);
    }
}
