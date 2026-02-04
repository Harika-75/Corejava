package collections;
import java.util.*;

public class EmployeeSalaryDem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 List<Employee1> employees = new ArrayList<>();

	        employees.add(new Employee1("Harika", "IT", 50000));
	        employees.add(new Employee1("Anjali", "HR", 40000));
	        employees.add(new Employee1("Ravi", "IT", 60000));
	        employees.add(new Employee1("Suresh", "Finance", 55000));
	        employees.add(new Employee1("Meena", "HR", 45000));

	        // 2️⃣ Calculate total salary per department using Map
	        Map<String, Double> deptSalaryMap = new HashMap<>();

	        for (Employee1 e : employees) {
	            deptSalaryMap.put(
	                e.department,
	                deptSalaryMap.getOrDefault(e.department, 0.0) + e.salary
	            );
	        }

	        // 3️⃣ Display department-wise salary
	        System.out.println("Department-wise Total Salary:");
	        for (Map.Entry<String, Double> entry : deptSalaryMap.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }

	        // 4️⃣ Find department with highest total salary
	        String highestDept = null;
	        double maxSalary = 0.0;

	        for (Map.Entry<String, Double> entry : deptSalaryMap.entrySet()) {
	            if (entry.getValue() > maxSalary) {
	                maxSalary = entry.getValue();
	                highestDept = entry.getKey();
	            }
	        }

	        System.out.println("\nDepartment with Highest Total Salary:");
	        System.out.println(highestDept + " -> " + maxSalary);
	    }
	}

