package oops;

import java.util.Scanner;
public class Happynum{
	public static int happy(int n)
	{
		int sum=0,r=0;
		while(n>0)
		{
			r=n%10;
			sum+=r*r;
			n/=10;
			
		}
		n=sum;
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner u=new Scanner(System.in);
		int n=u.nextInt();
		int n1=u.nextInt();
		for(int i=n;i<=n1;i++)
		{
			int sum =i;
			while(sum!=1&&sum!=4)
			{
				sum=happy(sum);
			}
			if(sum==1)System.out.println("happy number"+i);
		}
	}
}