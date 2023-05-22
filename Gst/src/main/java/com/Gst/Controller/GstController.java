package com.Gst.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Gst.Entity.Gst;
import com.Gst.Service.GstService;

@RestController
public class GstController {
	@Autowired
	GstService gSer;
	@PostMapping(value="/addgst")
	public String addGst(@RequestBody Gst g) {
		return gSer.addGst(g);
	}
	
	@PostMapping(value="/addallgst")
	public String addAllGst(@RequestBody List<Gst> g) {
		return gSer.addAllGst(g);
	}
	@DeleteMapping(value="/del/{id}")
	public String delGst(@PathVariable int id) {
		return gSer.delGst(id);
	}
	
	@GetMapping(value="/getbyid/{id}")
	public Gst getById(@PathVariable int id) {
		return gSer.getById(id);
	}
	
	@GetMapping(value="/getall")
	public List<Gst> getAll(){
		return gSer.getAll();
	}
	
		@GetMapping(value="/getbyhsn/{hsn}")
	public Gst getByHsn(@PathVariable int hsn){
		return gSer.getByHsn(hsn);
	}
	
		
	@GetMapping(value="/gettaxbyhsn/{hsn}")
	public int getTaxByHsn(@PathVariable int hsn) {
		return gSer.getTaxByHsn(hsn);
	}
	
	
	
	@GetMapping(value="/getdiscountbyhsn/{hsn}")
	public int getDiscountByHsn(@PathVariable int hsn) {
		return gSer.getDiscountByHsn(hsn);
	}
	
	@GetMapping(value="/sam")
	public String sample() {
		return "this is anoopraba gowrisankar";
	}
//	
//	@GetMapping(value="/gettaxbyhsn")
//	public int getTaxByHsn() {
//		return gSer.getTaxByHsn();
//	}
	
	
	

}
