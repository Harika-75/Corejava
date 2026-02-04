package collections;
import java.util.*;
public class Product {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        // 1️⃣ Map<Product, Price>
		        Map<String, Integer> productPriceMap = new HashMap<>();

		        productPriceMap.put("Mobile", 15000);
		        productPriceMap.put("Headphones", 1200);
		        productPriceMap.put("Keyboard", 700);
		        productPriceMap.put("Mouse", 400);
		        productPriceMap.put("Charger", 600);

		        // 2️⃣ Print products costing more than 500
		        System.out.println("Products costing more than 500:");
		        for (Map.Entry<String, Integer> entry : productPriceMap.entrySet()) {
		            if (entry.getValue() > 500) {
		                System.out.println(entry.getKey() + " -> " + entry.getValue());
		            }
		        }

		        // 3️⃣ Find highest priced product
		        String highestProduct = null;
		        int highestPrice = Integer.MIN_VALUE;

		        for (Map.Entry<String, Integer> entry : productPriceMap.entrySet()) {
		            if (entry.getValue() > highestPrice) {
		                highestPrice = entry.getValue();
		                highestProduct = entry.getKey();
		            }
		        }

		        System.out.println("\nHighest priced product:");
		        System.out.println(highestProduct + " -> " + highestPrice);

		        // 4️⃣ Update price of an existing product
		        String productToUpdate = "Mouse";
		        int newPrice = 550;

		        if (productPriceMap.containsKey(productToUpdate)) {
		            productPriceMap.put(productToUpdate, newPrice);
		            System.out.println("\nUpdated price of " + productToUpdate +
		                    " -> " + productPriceMap.get(productToUpdate));
		        } else {
		            System.out.println("\nProduct not found!");
		        }
		    }
		}
