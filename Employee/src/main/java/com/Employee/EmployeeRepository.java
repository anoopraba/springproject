package com.Employee;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	@Query(value = "select * from employee where name like ?", nativeQuery = true)
	public List<Employee> getName(String name);

	@Query(value = "select * from employee where gender like?", nativeQuery = true)
	public List<Employee> getGender(String gender);

	@Query(value = "select * from employee where age = ?", nativeQuery = true)
	public List<Employee> getAge(int age);

	@Query(value = "select * from employee where salary = ?", nativeQuery = true)
	public List<Employee> getSal(int salary);

	@Query(value = "select name from employee where salary = ?", nativeQuery = true)
	public List<String> getNameBySalary(int salary);

	@Query(value = "select * from employee order by name", nativeQuery = true)
	public List<Employee> sortAsc();

	@Query(value = "select * from employee order by name desc", nativeQuery = true)
	public List<Employee> sortDesc();

	@Query(value = "select * from employee where salary = (select max(salary) from employee)", nativeQuery = true)
	public List<Employee> getMax();

	@Query(value = "select * from employee where salary = (select min(salary) from employee)", nativeQuery = true)
	public List<Employee> getMin();

	@Query(value = "select * from employee where salary = (select max(salary) from employee where salary<(select max(salary) from employee));", nativeQuery = true)
	public List<Employee> getMaximum();

	@Query(value = "select * from employee where salary = (select min(salary) from employee where salary>(select min(salary) from employee));", nativeQuery = true)
	public List<Employee> getMinimum();

	@Query(value = "select * from employee where age = (select max(age) from employee)", nativeQuery = true)
	public List<Employee> maxAge();

	@Query(value = "select * from employee where age = (select min(age) from employee);", nativeQuery = true)
	public List<Employee> minAge();

	@Query(value = "select * from employee where salary > = ? and salary < =?", nativeQuery = true)
	public List<Employee> salary(int salary1, int salary2);

}
