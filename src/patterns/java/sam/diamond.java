package patterns.java.sam;

import java.util.Scanner;

public class diamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n =s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.println("*");
			}
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.println(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				System.out.println("*");
			}
		}
	}

}
