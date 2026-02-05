package collections;
import java.util.*;
import java.util.Scanner;
public class StudentMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> submap=new LinkedHashMap<>();
		System.out.println("Enter Number of Subjects:");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter subject name:");
			String name=sc.nextLine();
			System.out.println("Enter subject marks:");
			int marks=sc.nextInt();
			sc.nextLine();
			submap.put(name, marks);	
		}
		double totalmarks=0;
		System.out.println("calculating total marks");
		for(Map.Entry<String, Integer> entry:submap.entrySet()) {
			 totalmarks += entry.getValue();
		}
		System.out.println("Total Marks: "+totalmarks);
		
		String highestscore=null;
		int maxmarks=0;
		for(Map.Entry<String, Integer> entry:submap.entrySet()) {
			if(entry.getValue()>maxmarks) {
				maxmarks=entry.getValue();
				highestscore=entry.getKey();			}
		}
		System.out.println("Highest scoring subject: "+highestscore+" Marks: "+maxmarks);
		sc.close();
	}
	

}
