package com.Product.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Product.Entity.Products;

import com.Product.Service.ProductsService;

@RestController
public class ProductsController {
	@Autowired
	ProductsService prodSer;
	@PostMapping(value="/addprod")
	public String addProd(@RequestBody Products p) {
		return prodSer.addProd(p);
	}
	
	@PostMapping(value="/addallprod")
	public String addAllProd(@RequestBody List<Products> p) {
		return prodSer.addAllProd(p);
	}
	
	@GetMapping(value="/addproduct")
	public List<Products> addpro(){
		return prodSer.addpro();
	}

}
