package pinclass;

import java.util.Scanner;

public class perfectNumInRange {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int add=0;
		
		for(int i=a;i<=b;i++)
		{
			
			int sum=0;
			int n=i;
			for(int j=1;j<=n/2;j++) {
				if(n%j==0) {
					sum+=j;
				}
				
			}
			if(sum==i) {
				System.out.println("perfect num"+i);
				
				add+=i;
				System.out.println("addition"+add);
			}
			
		}
	}

}
