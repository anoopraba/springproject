package com.Employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository empRepo;
	public String addEmployee(Employee e) {
		empRepo.save(e);
		return "Successfully Saved";
	}
	
	public String addEmployee(List<Employee> e) {
		empRepo.saveAll(e);
		return "Successfully Saved";
	}
	
//	public Employee getEmployeeById(int id) {
//		return empRepo.findById(id).get();
//	}
//	
	public List<Employee>  getAllEmployeeById(){
		return empRepo.findAll();
	}
	
	public String delEmployee(int id) {
		empRepo.deleteById(id);
		return "Deleted successfully";
	}
	
	public String updateEmployee(Employee id) {
		empRepo.save(id);
		return "updated Successfully";
	}
//	public List<Employee> getName(String name){
//		return empRepo.getName(name);
//	}
	
//	public List<Employee> getGender(String gender){
//		return empRepo.getGender(gender);
//	}
//	
//	public List<Employee> getAge(int age){
//		return empRepo.getAge(age);
//	}
	
//	public List<Employee> getSal(int salary){
//		return empRepo.getSal(salary);
//	}
	
	public List<String> getEmpNameBySalary(int salary) {
		
		return empRepo.getNameBySalary(salary);

	}
	
	public List<Employee> sortAsc(){
		return empRepo.sortAsc();
	}
	
	public List<Employee> sortDesc(){
		return empRepo.sortDesc();
	}
	
	public List<Employee> getMax(){
		return empRepo.getMax();
	}
	
	public List<Employee> getMin(){
		return empRepo.getMin();
	}
	
	public List<Employee> getMaximum(){
		return empRepo.getMaximum();
	}
	
	public List<Employee> getMinimum(){
		return empRepo.getMinimum();
	}
	
	public List<Employee> maxAge(){
		return empRepo.maxAge();
	}
	
	public List<Employee> minAge(){
		return empRepo.minAge();
	}
	
	public List<Employee> salary(int salary1,int salary2){
		return empRepo.salary(salary1,salary2);
	}
	
	public Employee getEmployeeById(int id) throws EmployeeNotFoundException {
		return empRepo.findById(id).orElseThrow(()-> new EmployeeNotFoundException());
	}
//	
//	public List<Employee> getName(String name) throws EmployeeNameNotFoundException {
//	if(empRepo.getName(name).isEmpty()==true) {
//		throw new EmployeeNameNotFoundException();
//	}else {
//		return empRepo.getName(name);
//		}
//	}
	

//	public List<Employee> getAge(int age) throws AgeNotFoundException{
//		if(empRepo.getAge(age).isEmpty()==true){
//	        throw new AgeNotFoundException();
//		}else {
//			return empRepo.getAge(age);
//		}
//	
//	}
	
	public List<Employee> getName(String name){
    	return empRepo.getName(name);
    }
	
	public List<Employee> getAge(int age){
		return empRepo.getAge(age);
	}
	
	public List<Employee> getSal(int salary) throws SalaryNotFoundException{
		if(empRepo.getSal(salary).isEmpty()==true) {
			throw new SalaryNotFoundException();
		}else {
			return empRepo.getSal(salary);
			}
	}
	
	public List<Employee> getGender(String gender) throws GenderNotFoundException{
		if(empRepo.getGender(gender).isEmpty()==true) {
			throw new GenderNotFoundException();
		}else {
			return empRepo.getGender(gender);
		}
	}
	
	


}
