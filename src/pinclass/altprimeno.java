package pinclass;

import java.util.Scanner;

public class altprimeno {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int count=0;
		
		for(int i=a;i<=b;i++) {
			boolean z=true;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					z=false;
					break;
				}
			}
				if(z==true)count++;
				if(count%2!=0 && z==true) System.out.println(i);
			
		}
	}
}

					
					
					
					
	