package com.StudentDetails.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.StudentDetails.Entity.StudentDetails;
import com.StudentDetails.Exceptions.StudentAgeIsBelow18;
import com.StudentDetails.Service.StudentDetailsService;

@RestController
public class StudentDetailsController {
	@Autowired
	StudentDetailsService studSer;
	
	@PostMapping(value = "/addStudentDetails")
	public String addStudentDetails(@RequestBody StudentDetails sd) {
		return studSer.addStudentDetails(sd);
	}

	@PostMapping(value = "/addStudentListDetails")
	public String addStudentListDetails(@RequestBody List<StudentDetails> sd) {
		return studSer.addStudentListDetails(sd);
	}

	@PutMapping(value = "/updateStudentDetails/{id}")
	public String updateStudentDetails(@RequestBody StudentDetails id) {
		return studSer.updateStudentDetails(id);
	}
	
	@GetMapping(value="/getbyid/{id}")
	public StudentDetails getById(@PathVariable int id) {
			return studSer.getById(id);
		}
	
	@GetMapping(value="/getallbyid")
	public List<StudentDetails> getAllById() {
			return studSer.getAllById();
		}
	
	@PostMapping(value ="/setStudentDetails/{det}")
	public String setStudent(@RequestBody List<StudentDetails> det) throws StudentAgeIsBelow18 {
		return studSer.setStudent(det);
	
	
	

}
}
