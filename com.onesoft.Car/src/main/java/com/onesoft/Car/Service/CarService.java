package com.onesoft.Car.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onesoft.Car.Dao.CarDao;
import com.onesoft.Car.Entity.Car;

@Service
public class CarService {
	@Autowired
	CarDao carDao;
	public String addCar(Car c) {
		return carDao.addCar(c);
	}
	
	public String addCar(List<Car> c) {
		return carDao.addCar(c);
	}
	
	public Car getCarById(int id) {
		return carDao.getCarById(id);
	}

	public List<Car> getAllCarById(){
		return carDao.getAllCarById();
	}
	
	public String delcar(int id) {
		return carDao.delcar(id);
	}
	
	public String updatecar(Car id) {
		return carDao.updatecar(id);
	}
	
	public List<Car> getByBrand(String brand){
		List<Car> allCar=carDao.getAllCarById();
		return allCar.stream().filter(x->x.getBrand().equals(brand)).collect(Collectors.toList());
	}
	
	public List<Car> getByColor(String color){
		List<Car> allCar=carDao.getAllCarById();
		return allCar.stream().filter(x->x.getColor().equals(color)).collect(Collectors.toList());
	}
	
	public List<Car> getByCc(){
			List<Car> cars = carDao.getAllCarById();

			for (Car x : cars) {
				if (x.getCc() > 150 && x.getCc() < 300) {
					x.setPrice(x.getPrice() + x.getPrice() * 5/ 100);
				}
				else if (x.getCc()> 300 && x.getCc()<500) {
					x.setPrice(x.getPrice() + x.getPrice() * 10/100);
				
				}
				else if (x.getCc() > 500 ) {
					x.setPrice(x.getPrice() +x.getPrice()*15/100);
				}
				

			}
			return cars;
	}
	

}
