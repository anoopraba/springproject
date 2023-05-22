package com.UseProducts;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;





@RestController
public class UseProductsController {
	@Autowired
	RestTemplate rt;
	
	@GetMapping(value="/getnetprice")
	public List<Integer> getTaxByHsn(){
		String url1="http://localhost:8081/addproduct";
		String url2="http://localhost:8082/gettaxbyhsn/ ";
		ResponseEntity <List<UseProducts>>response1=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<UseProducts>>(){});
		List<UseProducts> products=response1.getBody();
		List<Integer> netprice=new ArrayList<>();
		products.forEach(x->{
			ResponseEntity<Integer> tax=rt.exchange(url2+x.getHsn(),HttpMethod.GET,null,Integer.class);
			int t=tax.getBody();
			netprice.add(x.getPrice()+(x.getPrice()*t/100));
		});
		return netprice;
	}
	
	@GetMapping(value="/getObject")
	public List<UseProducts> getAllProduct(){
		String url1="http://localhost:8081/addproduct";
		String url2="http://localhost:8082/gettaxbyhsn/ ";
		ResponseEntity <List<UseProducts>>response1=rt.exchange(url1,HttpMethod.GET,null,new ParameterizedTypeReference<List<UseProducts>>(){});
		List<UseProducts> products=response1.getBody();
		
		products.forEach(x->{
			ResponseEntity<Integer> tax=rt.exchange(url2+x.getHsn(),HttpMethod.GET,null,Integer.class);
			int t=tax.getBody();
		x.setPrice(x.getPrice()+(x.getPrice()*t/100));
		});
		return products;
	}

}
