package product;
import java.util.*;
public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		list.addAll(Arrays.asList(30,20,50,10,80,3,96,100,1,13));
		System.out.println("Before Sorting List: "+list);
		Collections.sort(list);
		System.out.println("After Sorting List:  "+list);
	

	}

}
