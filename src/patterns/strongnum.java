package patterns;

import java.util.Scanner;

public class strongnum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
	       System.out.println("num1");
	       int a =s.nextInt();
	       System.out.println("num2");
	       int b = s.nextInt();
	       for(int i=a;i<=b;i++)
	       {
	    	   int num =i;
	    	   int k=num;
	    	   int sum=0;
	    	   while(k>0)
	    	   {
	    		   int d=k%10;
	    		   int z=factorial(d);
	    		   sum+=z;
	    		   k/=10;
	    		   
	    	   }
	    	   if(sum==i)System.out.println("strong no"+i);
	       }

	}
	public static int factorial(int n) 
	{
		int fact=1;
		for(int i=1;i<=n;i++)fact*=i;
		return fact;
	}

}
