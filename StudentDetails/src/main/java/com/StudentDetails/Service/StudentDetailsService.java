package com.StudentDetails.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentDetails.Dao.StudentDetailsDao;
import com.StudentDetails.Entity.StudentDetails;
import com.StudentDetails.Exceptions.StudentAgeIsBelow18;

@Service
public class StudentDetailsService {
	
	@Autowired
	StudentDetailsDao studDao;
	
	public String addStudentDetails(StudentDetails sd) {
		return studDao.addStudentDetails(sd);
	}

	public String addStudentListDetails(List<StudentDetails> sd) {
		return studDao.addStudentListDetails(sd);
	}

	public String updateStudentDetails(StudentDetails id) {
		return studDao.updateStudentDetails(id);
	}
	
	public StudentDetails getById(int id) {
		return studDao.getById(id);
	}
	
	public List<StudentDetails> getAllById() {
		return studDao.getAllById();
	}


	

	public String setStudent(List<StudentDetails> det) throws StudentAgeIsBelow18 {
	
		
		List<StudentDetails> below18Age=det.stream().filter(x->x.getAge()<18).collect(Collectors.toList());
		
		if(below18Age.isEmpty()) {
			return studDao.setStudent(det);
		}
		else {
			throw new StudentAgeIsBelow18("error");
		}
		
		

	}

	
	
}
