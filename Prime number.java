import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=1){
            System.out.println("Not a prime Number");
        }
        boolean Isprime=true;
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
            System.out.println("Not a prime Number");
            Isprime=false;
            break;
            }
        }
        if(Isprime) System.out.println("prime Number");
	}
}
