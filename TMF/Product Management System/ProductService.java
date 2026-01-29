package product;
import java.util.*;
import java.io.*;

public class ProductService {
	public List<Product> inventory ;
	ProductService(){
		inventory = new ArrayList<Product>();
	}
	public void display() {
		System.out.println(inventory);
	}
	void addProduct(Product p) {
	inventory.add(p);	
	}
	public boolean searchProduct(int id) {
		boolean found=false;
		for(Product p:inventory) {
			if(p.getPid()==id) {
				found =true;
				System.out.println("Product Found "+p);
				break;
			}
		}
		return found;
	}
	public void removeProduct(int id) {
	    Iterator<Product> it = inventory.iterator();
	    boolean found = false;
	    while (it.hasNext()) {
	        Product p = it.next();
	        if (p.getPid() == id) {
	            it.remove();
	            found = true;
	            System.out.println("Product removed successfully");
	            break;
	        }
	    }
	    if (!found) {
	        System.out.println("Product not found so cannot delete");
	    }
	}
	
	public void CheckLowInventory() {
		for(Product p: inventory) {
			if(p.getQuantity()<10) {
				System.out.println(p.getName()+p.getQuantity());
			}
		}
	}
	public int totalInventoryValue() {
		int totalvalue=0;
		for(Product p:inventory) {
			totalvalue+=p.getQuantity();	
		}
		return totalvalue;
	}

	public void toFileFormat() {
		 System.out.println("Inventory size before writing: " + inventory.size());
		try {
			FileWriter fw = new FileWriter("D:\\ProductM.S\\product.txt");
			BufferedWriter bw = new BufferedWriter(fw);
			for (Product p : inventory) {
				bw.write(p.getPid() + ", " + p.getName() + ", " + p.getPrice() + ", " + p.getQuantity());
				bw.newLine();
			}
			bw.close();
			System.out.println("Products added successfully into the file");
		} catch (IOException e) {
			System.out.println("Error writing to file");

		}

	}
	public void readFile() {
		try (BufferedReader br = new BufferedReader(new FileReader("D:\\ProductM.S\\product.txt"))) {
			String x;
			while((x=br.readLine())!=null) {
				String data[]=x.split(",");

	            int id = Integer.parseInt(data[0]);
	            String name = data[1];
	            double price = Double.parseDouble(data[2]);
	            int quantity = Integer.parseInt(data[3]);
	            

	            Product p = new Product();
	            p.setPid(id);
	            p.setName(name);
	            p.setPrice(price);
	            p.setQuantity(quantity);

	            inventory.add(p);
			}
			System.out.println("Products loaded from file successfully");
			display();
			
		}
		catch(IOException e) {
			System.out.println("File Not Found");
			
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
