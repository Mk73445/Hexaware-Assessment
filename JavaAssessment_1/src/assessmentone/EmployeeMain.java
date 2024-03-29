package assessmentone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		list.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		list.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		list.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		list.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		list.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		list.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		list.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		list.add(new Employee(277, "Anuj", 31, "Male", "Product Development", 2012, 35700.0));

		
		// Write java code to Count the number of employees in each department using java 8 streams?
		Map<String, Long> empByDept = list.stream().collect(Collectors.groupingBy(
				Employee::getDepartment, TreeMap::new, Collectors.counting()));
		System.out.println(empByDept);

		
		// Write java code to List down the names of all employees in each department using java 8 streams?
		Map<String, List<String>> nameByDept = new HashMap<>();
		List<String> names;
		for (Employee emp : list) {
			if (!nameByDept.containsKey(emp.getDepartment())) {
				names = new ArrayList<>();
				names.add(emp.getName());
				nameByDept.put(emp.getDepartment(), names);
			} else {
				List<String> name = nameByDept.get(emp.getDepartment());
				name.add(emp.getName());
				nameByDept.put(emp.getDepartment(), name);
			}
		}
		System.out.println(nameByDept);
	}

}
