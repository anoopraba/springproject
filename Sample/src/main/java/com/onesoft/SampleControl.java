package com.onesoft;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/admin")
public class SampleControl {

	@GetMapping(value = "/hi")
	public String hi() {
		return "HelloWorld";
	}

	@GetMapping(value = "/myname")
	public String myname() {
		return "Anoopraba Gowrisankar";
	}

	@GetMapping(value = "/add/{a}/{b}")
	public int add(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(value = "/factorial/{a}")
	public int factorial(@PathVariable int a) {
		int val = 1;
		for (int i = 1; i <= a; i++) {
			val = val * i;
		}
		return val;
	}

	@GetMapping(value = "/odd/{a}")
	public int odd(@PathVariable int a) {
		if (a % 2 == 1) {
			return a * a;
		} else {
			return a * a * a;
		}

	}

	@GetMapping(value = "/nonvowels/{a}")
	public int nonvowels(@PathVariable String a) {
		int count = 0;
		for (int i = 0; i < a.length() - 1; i++) {
			if (a.charAt(i) != 'a' && a.charAt(i) != 'e' && a.charAt(i) != 'i' && a.charAt(i) != 'o'
					&& a.charAt(i) != 'u') {
				count = count + 1;
			}
		}
		return count;
	}

	@GetMapping(value = "/total/{a}")
	public int total(@PathVariable int a) {
		int num = 0;
		for (num = 0; a != 0; a = a / 10) {
			num = num + a % 10;
		}
		return num;
	}

	@GetMapping(value = "/series/{nums}")
	public List<Integer> series(@PathVariable int nums) {
		List<Integer> li = new ArrayList<>();
		for (int i = 0; i <= nums; i++) {
			li.add(i);
		}
		return li;
	}

	@GetMapping(value = "/square/{a}")
	public List<Integer> square(@PathVariable int a) {
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i <= a; i++) {
			l.add(i * i);
		}
		return l;
	}

	@GetMapping(value = "/fibonacci/{num}")
	public List<Integer> fibonacci(@PathVariable int num) {
		int a = 0;
		int b = 1;
		int c = 0;
		List<Integer> l = new ArrayList<>();
		for (int i = 0; i <= num; i++) {
			l.add(a);
			c = a + b;
			a = b;
			b = c;
		}
		return l;
	}

	@GetMapping(value = "/palindrome/{a}")
	public String palindrome(@PathVariable String a) {
		String b = "madam";
		for (int i = b.length() - 1; i >= 0; i--) {
			if (b.equals(a)) {
				return "Palindrome";
			} else {
				return "Not a Palindrome";
			}
		}
		return "Palindrome";

	}

	@GetMapping(value = "/getCar")
	public Car getCar(@RequestBody Car c) {
		return c;
	}

	@GetMapping("/getAllCar")
	public List<Car> getAllCar(@RequestBody List<Car> c) {
		return c;
	}

	@GetMapping(value = "/maxPrice")
	public int maxPrice(@RequestBody List<Car> c) {
		Car price = c.get(0);
		for (Car x : c) {
			if (x.getPrice() > price.getPrice()) {
				price = x;
			}
		}
		return price.getPrice();

	}

	@GetMapping(value = "/minPrice")
	public int minPrice(@RequestBody List<Car> c) {
		Car price = c.get(0);
		for (Car x : c) {
			if (x.getPrice() < price.getPrice()) {
				price = x;
			}
		}
		return price.getPrice();
	}

	@GetMapping(value = "/color/{a}")
	public List<Car> color(@RequestBody List<Car> cars, @PathVariable String a) {
		List<Car> val = new ArrayList<>();
		for (Car c : cars) {
			if (c.getColor().equals(a)) {
				val.add(c);
			}
		}
		return val;
	}

	@GetMapping(value = "/price/{a}")
	public List<Car> price(@RequestBody List<Car> cars, @PathVariable int a) {
		List<Car> num = new ArrayList<>();
		for (Car p : cars) {
			if (p.getPrice() > a) {
				num.add(p);
			}
		}
		return num;
	}

	@GetMapping(value = "getAllEmployee")
	public List<Employee> getAllEmployee(@RequestBody List<Employee> emp) {
		return emp;
	}

	@GetMapping(value = "/maxSalary")
	public Employee maxSalary(@RequestBody List<Employee> emp) {
		Employee salary = emp.get(0);
		for (Employee x : emp) {
			if (x.getSalary() > salary.getSalary()) {
				salary = x;
			}
		}
		return salary;

	}

	@GetMapping(value = "/minSalary")
	public Employee minSalary(@RequestBody List<Employee> emp) {
		Employee salary = emp.get(0);
		for (Employee x : emp) {
			if (x.getSalary() < salary.getSalary()) {
				salary = x;
			}
		}
		return salary;

	}

	@GetMapping(value = "/gender/{a}")
	public List<Employee> gender(@RequestBody List<Employee> emp, @PathVariable String a) {
		List<Employee> val = new ArrayList<>();
		for (Employee e : emp) {
			if (e.getGender().equals(a)) {
				val.add(e);
			}
		}
		return val;
	}

	@GetMapping(value = "/tax")
	public List<Employee> tax(@RequestBody List<Employee> emp) {
		for (Employee x : emp) {
			if (x.getSalary() < 35000 && x.getSalary() >= 25000) {
				x.setSalary(x.getSalary() + x.getSalary() + 20 / 100);
			} else if (x.getSalary() < 55000 && x.getSalary() >= 35000) {
				x.setSalary(x.getSalary() + x.getSalary() + 15 / 100);
			} else if (x.getSalary() <= 75000 && x.getSalary() >= 55000) {
				x.setSalary(x.getSalary() + x.getSalary() + 10 / 100);
			}
		}
		return emp;

	}

}
