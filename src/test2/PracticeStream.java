package test2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class PracticeStream {
	static List<Employee> employeeList = new ArrayList<Employee>();

	public static void main(String[] args) {

		employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));

//		method1();
//		method2();
//		method3();
//		method6();

//			System.out.println("\n");

//			method2();
//			System.out.println("\n");
//			// Query 3 : What is the average age of male and female employees?
//			method3();
//			System.out.println("\n");
//			// Query 4 : Get the details of highest paid employee in the organization?
//			method4();
//			System.out.println("\n");
//			
//		method5();
//			System.out.println("\n");
//			// Query 6 : Count the number of employees in each department?
//			method6();
//			System.out.println("\n");
//			// Query 7 : What is the average salary of each department?
//			method7();
//			System.out.println("\n");
//			// Query 8 : Get the details of youngest male employee in the product
//			// development department?
//			method8();
//			System.out.println("\n");
//			// Query 9 : Who has the most working experience in the organization?
//			method9();
//			System.out.println("\n");
//			// Query 10 : How many male and female employees are there in the sales and
//			// marketing team?
//			method10();
//			System.out.println("\n");
//			// Query 11 : What is the average salary of male and female employees?
//			method11();
//			System.out.println("\n");
//			// Query 12 : List down the names of all employees in each department?
		method12();
//			System.out.println("\n");
//			// Query 13 : What is the average salary and total salary of the whole
//			// organization?
//			method13();
//			System.out.println("\n");
//			// Query 14 : Separate the employees who are younger or equal to 25 years from
//			// those employees who are older than 25 years.
//			method14();
//			System.out.println("\n");
//			// Query 15 : Who is the oldest employee in the organization? What is his age
//			// and which department he belongs to?
//			method15();

	}

	// Query 1 : How many male and female employees are there in the organization?
	public static void method1() {
		Map<String, Long> map = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(map);

	}

//	// Query 2 : Print the name of all departments in the organization?

	public static void method2() {
		Set<String> e = employeeList.stream().map(Employee::getDepartment).collect(Collectors.toSet());
		System.out.println(e);

	}

//	 Query 3 : What is the average age of male and female employees?

	public static void method3() {
		LinkedHashMap<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender,
				LinkedHashMap::new, Collectors.averagingDouble(Employee::getAge)));
		System.out.println(collect);

	}

	// Query 4 : Get the details of highest paid employee in the organization?

	public static void method4() {

		Optional<Employee> findFirst = employeeList.stream().min(Comparator.comparing(Employee::getSalary));
		System.out.println(findFirst);
	}

	// Query 6 : Count the number of employees in each department?
	public static void method5() {
		TreeMap<String, Long> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, TreeMap::new, Collectors.counting()));
		System.out.println(collect);
	}

//	 What is the average salary of each department?
	public static void method6() {
		Map<String, Double> collect = employeeList.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect);

	}

	// Query 12 : List down the names of all employees in each department?
	public static void method12() {
		Map<String, Set<Employee>> collect = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.toSet()));
		System.out.println(collect);
		Set<String> keySet = collect.keySet();
		for (String se : keySet) {
			System.out.println(se + "Department");
			for (Employee e : collect.get(se)) {
				System.out.println(e.getName());
			}

		}

	}

}
