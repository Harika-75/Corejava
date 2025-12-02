import java.util.*;
public class ArmStrong {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    int num=sc.nextInt();
    int org=num;
    int digits = String.valueOf(num).length();
    int sum=0;
    while(num!=0){
        int rem=num%10;
         sum+=Math.pow(rem,digits);
        num/=10;
    }
    if(org==sum) System.out.println("ArmStrong Number");
    else System.out.println("Not an ArmStrong Number");
}
}
