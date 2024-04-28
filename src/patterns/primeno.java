package patterns;

import java.util.Scanner;

public class primeno {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	       System.out.println("num1");
	       int a =s.nextInt();
	       System.out.println("num2");
	       int b = s.nextInt();
	       for(int i=a;i<=b;i++)
	       {
	    	   if(isprime(i))System.out.println("prime no  "+i);
	       }

	}
	public static boolean isprime(int n)
	{
		boolean b =true;
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
