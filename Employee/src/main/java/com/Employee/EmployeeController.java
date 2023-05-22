package com.Employee;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService empSer;
	
	@PostMapping(value = "/addEmp")
	public String addEmployee(@RequestBody Employee e) {
		return empSer.addEmployee(e);
	}

	@PostMapping(value = "/addAllEmp")
	public String addEmployee(@RequestBody List<Employee> e) {
		return empSer.addEmployee(e);
	}
	
	@GetMapping(value="/getById/{id}")
	public Employee getEmployeeById(@PathVariable int id) throws EmployeeNotFoundException {
		return empSer.getEmployeeById(id);
	}
	@GetMapping(value="/getAllById")
	public List<Employee> getAllEmployeeById(){
		return empSer.getAllEmployeeById();
	}
	
	@DeleteMapping(value="/del/{id}")
	public String delEmployee(@PathVariable int id) {
		return empSer.delEmployee(id);
	}
	
	@PutMapping(value="/updateEmp/{id}")
	public String updateEmployee(@RequestBody Employee id) {
		return empSer.updateEmployee(id);
	}
	@GetMapping(path="/getEmpByGender/{gender}")
	public List<Employee> getByGender(@PathVariable String gender){
		return empSer.getByGender(gender);
	}
	@GetMapping(path="/getempsal/{a}/{b}")
	public List<Employee> getBySalary(@PathVariable int a,@PathVariable int b){
		return empSer.getBySalary(a,b);
	}
	@GetMapping(path="/getempage/{age}")
	public List<Employee> getByAge(@PathVariable int age){
		return empSer.getByAge(age);
		}
	
	@GetMapping(path="/getempname/{name}")
	public List<Employee> getByName(@PathVariable String name){
		return empSer.getByName(name);
	}
//	
//	@GetMapping(path="/getbyname/{name}")
//	public List<Employee> getName(@PathVariable   String name){
//		return empSer.getName(name);
//	}
	
//	@GetMapping(path="/getbygender/{gender}")
//	public List<Employee> getGender(@PathVariable   String gender){
//		return empSer.getGender(gender);
//	}
	
//	@GetMapping(path="/getbyage/{age}")
//	public List<Employee> getAge(@PathVariable int age){
//		return empSer.getAge(age);
//	}
	
	
	
	@GetMapping(value = "/getEmployeeNameBySalary/{salary}")
	public List<String> getEmpNameBySalary(@PathVariable int salary){
		return empSer.getEmpNameBySalary(salary);
	}
	
	@GetMapping(value="/getsortasc")
	public List<Employee> sortAsc(){
		return empSer.sortAsc();
	}
	
	@GetMapping(value="/getsortdesc")
	public List<Employee> sortDesc(){
		return empSer.sortDesc();
	}
	
	@GetMapping(value="/getmax")
	public List<Employee> getMax(){
		return empSer.getMax();
	}
	
	@GetMapping(value="/getmin")
	public List<Employee> getMin(){
		return empSer.getMin();
	}
	
	@GetMapping(value="/getmaximum")
	public List<Employee> getMaximum(){
		return empSer.getMaximum();
	}
	
	@GetMapping(value="/getminimum")
	public List<Employee> getMinimum(){
		return empSer.getMinimum();
	}
	
	@GetMapping(value="/maxage")
	public List<Employee> maxAge(){
		return empSer.maxAge();
	}

	@GetMapping(value="/minage")
	public List<Employee> minAge(){
		return empSer.minAge();
	}
	
	@GetMapping(value="/salary/{salary1}/{salary2}")
	public List<Employee> salary(@PathVariable int salary1,@PathVariable int salary2){
		return empSer.salary(salary1,salary2);
	}
	
	@GetMapping(value="/getsalary/{salary1}/{salary2}")
	public List<Employee> getSalary(@PathVariable int salary1,@PathVariable int salary2){
		return empSer.getSalary(salary1,salary2);
	}
	

//	@GetMapping(path="/getbyname/{name}")
//	public List<Employee> getName(@PathVariable   String name) throws EmployeeNameNotFoundException{
//		return empSer.getName(name);
//	}
//	
//	@GetMapping(path="/getbyage/{age}")
//	public List<Employee> getAge(@PathVariable int age) throws AgeNotFoundException{
//		return empSer.getAge(age);
//	}
	
	@GetMapping(path="/getbyname/{name}")
	public List<Employee> getName(@PathVariable   String name) throws EmployeeNameNotFoundException{
		return empSer.getName(name);
	}
	
	@GetMapping(path="/getbysal/{salary}")
	public List<Employee> getSal(@PathVariable int salary) throws SalaryNotFoundException{
		return empSer.getSal(salary);
	}
	
	@GetMapping(path="/getbygender/{gender}")
	public List<Employee> getGender(@PathVariable   String gender) throws GenderNotFoundException{
		return empSer.getGender(gender);
	}
//	@PostMapping(path="/getbyage")
//	public List<Employee> getAge(@RequestBody Employee e) throws AgeNotFoundException{
//		return empSer.getAge(e);
//	}
	
	

}

