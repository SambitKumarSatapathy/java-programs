package patterns;

import java.util.Scanner;

public class primeeee {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(isprime(i)==true)System.out.println("pn"+  i);
		}
	}
	public static boolean isprime(int n)
	{
		boolean b;
		if(n<=1)return false;
		else
		{
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					return false;
				}
			}
			return true;
		}
	}

}
