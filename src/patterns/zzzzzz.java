package patterns;

import java.util.Scanner;

public class zzzzzz {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int count =0;
		for(int i=a;i>=b;i--)
		{
			boolean f=true;
			if(i<=1)System.out.println("nooooo");
			else
			{
				for(int j=2;j<=i/2;j++)
				{
					if(i%j==0)
					{
						f=false;
						break;
					}
					if(f)
					{
						count++;
						if(count==3)System.out.println("pn"+i);
						break;
					}
				}
			}
		}
	}

}
