package product;
import java.util.*;
public class DividedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(10, 20, 30, 40,50,60,7,8));
		System.out.println(list);
		int mid=list.size()/2;
		List<Integer> list1=new ArrayList<>(list.subList(0,mid));
		System.out.println(list1);
		List<Integer> list2=new ArrayList<>(list.subList(mid,list.size()));
		System.out.println(list2);
	}

}
