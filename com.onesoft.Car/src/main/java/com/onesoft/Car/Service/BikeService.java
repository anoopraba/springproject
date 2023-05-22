package com.onesoft.Car.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onesoft.Car.Dao.BikeDao;
import com.onesoft.Car.Entity.Bike;
import com.onesoft.Car.Entity.Car;



@Service
public class BikeService {

	@Autowired
	BikeDao bikeDao;
	public String addBike(Bike b) {
		return bikeDao.addBike(b);
	}
	
	public String addBike(List<Bike> b) {
		return bikeDao.addBike(b);
	}
	
	public Bike getBikeById(int id) {
		return bikeDao.getBikeById(id);
	}
	
	public List<Bike> getAllById(){
		return bikeDao.getAllById();
	}
	
	public String delbike(int id) {
		return bikeDao.delbike(id);
	}
	
	public String updatebike(Bike id) {
		return bikeDao.updatebike(id);
	}
	
	public List<Bike> getByBrand(String brand){
		List<Bike> allbike=bikeDao.getAllById();
		return allbike.stream().filter(x->x.getBrand().equals(brand)).collect(Collectors.toList());
	}
	
	public List<Bike> getByColor(String color){
		List<Bike> allbike=bikeDao.getAllById();
		return allbike.stream().filter(x->x.getColor().equals(color)).collect(Collectors.toList());
	}
	public List<Bike> getByCc(){
		List<Bike> bikes=bikeDao.getAllById();
		for (Bike x : bikes) {
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
		return bikes;
	}
	
	public List<Bike> getByPrice(int price){
		List<Bike> allbike=bikeDao.getAllById();
		return allbike.stream().filter(x->x.getPrice()==price).collect(Collectors.toList());
	}
	
	public List<String> getBrand(int price){
		List<Bike> allbike=bikeDao.getAllById();
		return allbike.stream().filter(x->x.getPrice()==price).map(y->y.getBrand()).collect(Collectors.toList());
	}
	
	public List<Integer> price(String brand){
		List<Bike> allbike=bikeDao.getAllById();
		return allbike.stream().filter(x->x.getBrand().equals(brand)).map(y->y.getPrice()).collect(Collectors.toList());
	}
	
	}
