package com.Gst.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Gst.Dao.GstDao;
import com.Gst.Entity.Gst;

@Service
public class GstService {
	@Autowired 
	GstDao gDao;
	
	public String addGst(Gst g) {
		return gDao.addGst(g);
	}
	
	public String addAllGst(List<Gst> g) {
		return gDao.addAllGst(g);
	}
	
	public String delGst(int id) {
		return gDao.delGst(id);
	}
	
	public Gst getById(int id) {
		return gDao.getById(id);
	}
	
	public List<Gst> getAll(){
		return gDao.getAll();
	}
	public Gst getByHsn(int hsn){
		return gDao.getByHsn(hsn);
	}
	public int getTaxByHsn(int hsn) {
		return gDao.getTaxByHsn(hsn);
	}
	
	public int getDiscountByHsn(int hsn) {
		return gDao.getDiscountByHsn(hsn);
	}

//	
//	public int getTaxByHsn() {
//		return gDao.getTaxByHsn();
//	}
}
