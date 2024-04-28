package pinclass;

import java.util.Scanner;

public class automorphic {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int n= s.nextInt();
		int m=n;
		int i=1;
		
		while(m>0) {
			i*=10;
			m/=10;
		}
		int sq=n*n;
		if(sq%i==n)System.out.println("autonum");
		else System.out.println("not");

	}

}
