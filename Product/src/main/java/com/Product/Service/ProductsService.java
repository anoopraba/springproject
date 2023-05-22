package com.Product.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.Product.Dao.ProductsDao;
import com.Product.Entity.Products;

@Service
public class ProductsService {
	@Autowired
	ProductsDao prodDao;
	public String addProd(Products p) {
		return prodDao.addProd(p);
	}
	
	public String addAllProd(List<Products> p) {
		return prodDao.addAllProd(p);
	}
	
	public List<Products> addpro(){
		return prodDao.addpro();
	}

}
