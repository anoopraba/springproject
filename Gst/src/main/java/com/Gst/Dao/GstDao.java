package com.Gst.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Gst.Entity.Gst;
import com.Gst.Repository.GstRepository;

@Repository
public class GstDao {
	@Autowired
	GstRepository gRepo;
	
	public String addGst(Gst g) {
		gRepo.save(g);
		return "gst saved";
	}
	
	public String addAllGst(List<Gst> g) {
		gRepo.saveAll(g);
		return "all gst value saved";
	}
	
	public String delGst(int id) {
		gRepo.deleteById(id);
		return "deleted";
	}
	
	public Gst getById(int id) {
		return gRepo.findById(id).get();
	}
	
	public List<Gst> getAll(){
		return gRepo.findAll();
	}
	
	
	public Gst getByHsn(int hsn){
		return gRepo.getByHsn(hsn);
	}
	
    public int getTaxByHsn(int hsn) {
		return gRepo.getTaxByHsn(hsn);
	}
	
	public int getDiscountByHsn(int hsn) {
		return gRepo.getDiscountByHsn(hsn);
	}
	
//	public int getTaxByHsn() {
//		return gRepo.getTaxByHsn();
//	}
}
