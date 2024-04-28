package pinclass;

import java.util.Scanner;

public class altrpalindromnum {
	public static void main(String []args) {
		Scanner s =new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int count=0;
		for(int i=b;i>=a;i--) {
			int x=i;
			int m=0;
			
			while(x>0) {
				int d=x%10;
				m=m*10+d;
				x/=10;
			}
			if(m==i) count++;
			if(count==2&&m==i)System.out.println("2nd high pallin"+i);
			
		}
		}

}
