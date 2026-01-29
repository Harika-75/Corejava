package product;
import java.util.*;
public class MainInventory {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService ps = new ProductService();
		//ps.display();
		Scanner sc = new Scanner(System.in);
		int n;
		int choice;
		do {
			System.out.println("\nProducts details");
			System.out.println("1. Add Product");
			System.out.println("2. Remove Product");
			System.out.println("3. Search Products");
			System.out.println("4. Show All Products");
			System.out.println("5. Check Low Inventory Value ");
			System.out.println("6. Check total Inventory value");
			System.out.println("7. Save Products to File ");
			System.out.println("8. Load Products From Files");
			System.out.println("9. Exit");
			System.out.println("Enter Your Choice :");
			choice= sc.nextInt();	
			
			switch (choice) {
			case 1:
				System.out.print("Enter number of products to add: ");
				n = sc.nextInt();
				for (int i = 1; i <= n; i++) {
					System.out.println("\nEnter details of product " + i);
					Product p = new Product();
					System.out.print("Enter PID: ");
					p.setPid(sc.nextInt());
					System.out.print("Enter Name: ");
					p.setName(sc.next());
					System.out.print("Enter Price: ");
					p.setPrice(sc.nextDouble());
					System.out.print("Enter Quantity: ");
					p.setQuantity(sc.nextInt());
					ps.addProduct(p);
				}
				break;
			case 2:
				System.out.print("Enter product ID to remove: ");
				ps.removeProduct(sc.nextInt());
				break;
			case 3:
				System.out.print("Enter product ID to search: ");
				ps.searchProduct(sc.nextInt());
				break;
			case 4:
				ps.display();
				break;
			case 5:
				ps.CheckLowInventory();
				break;
			case 6:
				System.out.println("Total Inventory Value: " + ps.totalInventoryValue());
				break;
			case 7:
				ps.toFileFormat();
				break;
			case 8:
				ps.readFile();
				break;
			case 9:
				System.out.println("Exiting...");
				break;
			default:
				System.out.println("Invalid choice");
			}
		} while (choice != 9);
		
		sc.close();

	}
}
