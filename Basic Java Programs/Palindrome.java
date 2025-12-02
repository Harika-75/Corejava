import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int org=n;
		int rev=0;
		while(n!=0){
		    int r=n%10;
		    rev=rev*10+r;
		    n=n/10;
		}
		if(org==rev){
		    System.out.println("Palindrome Number");
		}
		else System.out.println(" Not a Palindrome Number");
	}
}
