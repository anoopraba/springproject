package com.Gst.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Gst.Entity.Gst;

public interface GstRepository extends JpaRepository<Gst,Integer> {
	@Query(value="select * from products.gst where hsn = ?",nativeQuery=true)
	public Gst getByHsn(int hsn);
	
	@Query(value="select tax from products.gst where hsn = ?",nativeQuery=true)
	public int getTaxByHsn(int hsn);
	
	@Query(value="select discount from products.gst where hsn = ?",nativeQuery=true)
	public int getDiscountByHsn(int hsn);
	
//	@Query(value="select tax from products.gst where hsn = ?",nativeQuery=true)
//	public int getTaxByHsn();
	

}
