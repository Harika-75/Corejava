package collections;
import java.util.*;
public class Contacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Map<String, String> map =new LinkedHashMap<>();
		
		System.out.println("Enter the number of contacts");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Name:");
			String name=sc.nextLine();
			
			System.out.println("Enter Phone Number");
			String phone=sc.nextLine();
			
			map.put(name, phone);
		}
		 System.out.println("Enter a name for search");
		 String name=sc.nextLine();
		 if(map.containsKey(name)) {
			 System.out.println("Phone Number: "+map.get(name));
		 }
		 else {
			 System.out.println("Contact not found");
		 }
		 System.out.print("Enter name to update: ");
         name = sc.nextLine();
         if(map.containsKey(name)) {
        	 System.out.println("Enter Phone Number to update");
        	 String phone=sc.nextLine();
        	 System.out.println("Phone Number updated successfully");
         }else System.out.println("Contact not found");
         
         System.out.println("Enter a name to delete");
         String name1=sc.nextLine();
         if(map.containsKey(name1)) {
        	 map.remove(name1);
         }else System.out.println("Contact not found");
         
		sc.close();

	}

}
