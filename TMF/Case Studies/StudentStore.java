package collections;
import java.util.*;

public class StudentStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> students = new ArrayList<>(
			    Arrays.asList(
			        new Student(1, "Harika", "Java"),
			        new Student(2, "Anjali", "Python"),
			        new Student(3, "Jayasree", "Java"),
			        new Student(4, "Lokesh", "C++"),
			        new Student(5, "Renuka", "Python")
			    )
			);
        System.out.println("All Students:");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("\nStudents enrolled in Java:");
        for (Student s : students) {
            if (s.course.equalsIgnoreCase("Java")) {
                System.out.println(s);
            }
        }
        Map<String, Integer> courseCount = new HashMap<>();

        for (Student s : students) {
            courseCount.put(
                s.course,
                courseCount.getOrDefault(s.course, 0) + 1
            );
        }

        System.out.println("\nStudent count per course:");
        for (Map.Entry<String, Integer> entry : courseCount.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }


	}

