package pinclass;
import java.util.Scanner;

public class neonno {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n=s.nextInt();
		int sq=n*n;
		int sum=0;
		
			while(sq>0) {
				sum+=sq%10;
				sq/=10;
			}
			
		if(n==sum)System.out.println("nnnnnnnn");
		else System.out.println("not");

	}

}
