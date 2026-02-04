package collections;
import java.util.*;

public class EmployeeDemo {

	public static void main(String[] args) {

		        Map<String, List<Employee>> deptMap = new HashMap<>();

		        
		        addEmployee(deptMap, new Employee(1, "Harika", "IT"));
		        addEmployee(deptMap, new Employee(2, "Anjali", "HR"));
		        addEmployee(deptMap, new Employee(3, "Ravi", "IT"));
		        addEmployee(deptMap, new Employee(4, "Suresh", "Finance"));
		        addEmployee(deptMap, new Employee(5, "Meena", "HR"));

		       
		        System.out.println("Employees Department-wise:");
		        for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
		            System.out.println("\nDepartment: " + entry.getKey());
		            for (Employee e : entry.getValue()) {
		                System.out.println(e);
		            }
		        }

		       
		        System.out.println("\nTotal Employees in each Department:");
		        for (Map.Entry<String, List<Employee>> entry : deptMap.entrySet()) {
		            System.out.println(entry.getKey() + " -> " + entry.getValue().size());
		        }
		    }

		    public static void addEmployee(Map<String, List<Employee>> map, Employee emp) {
		        map.computeIfAbsent(emp.dept, k -> new ArrayList<>()).add(emp);
		    }
		}
