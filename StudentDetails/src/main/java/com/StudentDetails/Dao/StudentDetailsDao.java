package com.StudentDetails.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentDetails.Entity.StudentDetails;
import com.StudentDetails.Exceptions.StudentAgeIsBelow18;
import com.StudentDetails.Repository.StudentDetailsRepository;

@Repository
public class StudentDetailsDao {
	
	@Autowired
	StudentDetailsRepository studRepo;
	
	public String addStudentDetails(StudentDetails sd) {
		studRepo.save(sd);
		return "Student details added successfully";
	}
	public String addStudentListDetails(List<StudentDetails> sd){
		studRepo.saveAll(sd);
		return "Student details list added successfully";
	}
	public String updateStudentDetails(StudentDetails id) {
		studRepo.save(id);
		return "updated successfully";
	}
	
	public StudentDetails getById(int id) {
		return studRepo.findById(id).get();
	}
	
	public List<StudentDetails> getAllById() {
		return studRepo.findAll();
	}
	

	public String setStudent(List<StudentDetails> det) throws StudentAgeIsBelow18 {
		studRepo.saveAll(det);
		return "Save Succesfully";
	
	}
	

}
