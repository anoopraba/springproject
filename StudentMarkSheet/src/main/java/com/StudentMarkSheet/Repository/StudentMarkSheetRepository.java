package com.StudentMarkSheet.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.StudentMarkSheet.Entity.StudentMarkSheet;

public interface StudentMarkSheetRepository extends JpaRepository<StudentMarkSheet,Integer> {
	@Query(value="select * from students.mark_sheet where roll_number= ?",nativeQuery=true)
	public List<StudentMarkSheet> getMarkSheetDetailByRoll(int rollNumber);

}
