package patterns;

import java.util.Scanner;

public class MagicNumbb {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		for(int i=a;i<=b;i++)
		{
			if(ismagic(i)==true)
			{
				System.out.println("magic number"+  i);
			}
		}

	}
	public static boolean ismagic(int n)
	{
		int sum =0;
		while(n>0)
		{
			int d=n%10;
			sum+=d;
			n/=10;
			
		}
		sum=n;
		if(sum==1)return true;
		return false;
	}

}
