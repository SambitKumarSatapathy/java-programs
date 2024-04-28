package oops;
import java.util.Scanner;
class AAA{
	public static int length(int num) {
		int count=0;
		for(;num>0;num/=10) count++;
		System.out.println(count);
		return count;
	}
	
	public static int armstrongNumber(int num) {
		int count =length(num);
		int res=0;
		
		for(;num>0;num/=10)
			{
			int d=num%10;
			AAA.power(d,count);
			res+=power(num%10,count);
			}
		return res;
	}
	public static int power(int a,int b) {
		int res=0;
		for(int i=1;i<=b;i++)res*=a;
		return res;
	}
}
	

public class ArmStrongno {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("armStrong number");
		System.out.println("enter the number");
		int num=s.nextInt();
		if(num<0)System.out.println("no negetive");
		else
		{
			int res1=AAA.armstrongNumber(num);
			System.out.println(res1);
			if(num==res1)System.out.println("im armstrong :"+res1);
			else System.out.println("im not armstrong");
	    }
	}
		

}
