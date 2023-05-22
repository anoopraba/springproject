package com.onesoft.Car.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.onesoft.Car.Entity.Bike;
import com.onesoft.Car.Repository.BikeRepository;

@Repository
public class BikeDao {
	@Autowired
	BikeRepository bikeRepo;
	public String addBike(Bike b) {
		bikeRepo.save(b);
		return "Successfully saved";
	}
	
	public String addBike(List<Bike> b) {
		bikeRepo.saveAll(b);
		return "Successfully saved";
	}
	
	public Bike getBikeById(int id) {
		return bikeRepo.findById(id).get();
	}
	
	public List<Bike> getAllById(){
		return bikeRepo.findAll();
	}
	
	public String delbike(int id) {
		bikeRepo.deleteById(id);
		return "deleted successfully";
	}
	
	public String updatebike(Bike id) {
		bikeRepo.save(id);
		return "updated successfully";
	}

}
