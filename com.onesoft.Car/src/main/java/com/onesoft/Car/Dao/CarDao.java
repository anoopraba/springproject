package com.onesoft.Car.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.Car.Entity.Car;
import com.onesoft.Car.Repository.CarRepository;

@Repository
public class CarDao {
	@Autowired
	CarRepository carRepo;
	public String addCar(Car c) {
		carRepo.save(c);
		return "Successfully saved";
	}
	public String addCar(List<Car> c) {
		carRepo.saveAll(c);
		return "Successfully saved";
	}
	
	public Car getCarById(int id) {
		return carRepo.findById(id).get();
	}
	
	public List<Car> getAllCarById(){
		return carRepo.findAll();
	}
	public String delcar(int id) {
		carRepo.deleteById(id);
		return "Deleted successfully";
	}

	public String updatecar(Car id) {
		carRepo.save(id);
		return "updated Successfully";
	}
	

}
