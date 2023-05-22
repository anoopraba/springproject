package com.onesoft.Car.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.onesoft.Car.Entity.Bike;
import com.onesoft.Car.Service.BikeService;

@RestController
@RequestMapping(value="/bike")
public class BikeController {
	@Autowired
	BikeService bikeSer;
	@PostMapping(value="/addBike")
	public String addBike(@RequestBody Bike b) {
		return bikeSer.addBike(b);
	}

	@PostMapping(value="/addAllBike")
	public String addBike(@RequestBody List<Bike> b) {
		return bikeSer.addBike(b);
	}
	
	@RequestMapping(value="/getById/{id}")
	public Bike getBikeById(@PathVariable int id) {
		return bikeSer.getBikeById(id);
	}
	
	@GetMapping(value="/getAllById")
	public List<Bike> getAllById(){
		return bikeSer.getAllById();
	}
	
	@DeleteMapping(value="/del/{id}")
	public String delbike(@PathVariable int id) {
		return bikeSer.delbike(id);
	}
	
     
	@PutMapping(value="/updatebike/{id}")
	public String updatebike(@PathVariable Bike id) {
		return bikeSer.updatebike(id);
	}
	
	@GetMapping(path="/getbrand/{brand}")
    public List<Bike> getByBrand(@PathVariable String brand){
   	 return bikeSer.getByBrand(brand);
    }
	
	@GetMapping(path="/getcolor/{color}")
	public List<Bike> getByColor(@PathVariable String color){
		return bikeSer.getByColor(color);
	}
	
	@GetMapping(path="/getcc")
	public List<Bike> getByCc(){
		return bikeSer.getByCc();
	}
	
	@GetMapping(path="/getprice/{price}")
	public List<Bike> getByPrice(@PathVariable int price){
		return bikeSer.getByPrice(price);
	}
	
	@GetMapping(path="/brand/{price}")
	public List<String> getBrand(@PathVariable int price){
		return bikeSer.getBrand(price);
	}
	
	@GetMapping(path="/price/{brand}")
	public List<Integer> price(@PathVariable String brand){
		return bikeSer.price(brand);
	}
}

