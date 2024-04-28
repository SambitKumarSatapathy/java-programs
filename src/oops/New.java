package oops;
import java.util.Scanner;
 class Sam {
	 public static int strongnumber(int num) {
			int fact=PracticeAllPrograms.factorial(num);
			int res=0;
			for(;num>0;num/=10) res +=fact;
			return res;
      }
 }

public class New {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		int num = s.nextInt();
		
		if(num<0)System.out.println("Don't enter any negetive number");
		else
		{
			int res=PracticeAllPrograms.strongnumber(num);
			if(num==res)System.out.println("Strong number");
		}

	}

}
