package oops;
import java.util.Scanner;

public class MainClassOfPracticeAllPrograms {

	public static void main(String[] args) {
		System.out.println("welcome to my program");
		System.out.println("Software Developer Sam");
		System.out.println("1. factorial\n"
			+"2. reverse of a number\n"
			+"3. power of a number\n"
			+"4. length of a number\n"
			+"5. summation of number\n"
			+"6. check armstrong number\n"
			+"7. check strong number\n"
			+"8. range of armstrong number\n"
			+"9. range of strong number");
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter  your choice");
		int choice = s.nextInt();
		if(choice==1)
		{
			System.out.println("factorial of a number");
			System.out.println("enter the number:");
			int num = s.nextInt();
			
			if(num<0)System.out.println("Don't enter any negetive number");
			else
			{
				int res=PracticeAllPrograms.factorial(num);
				System.out.println(num+"!="+res);
			}
		}
		else if(choice==2)
		{
			System.out.println("reverse of a number:");
			System.out.println("Enter the number:");
			
			int num=s.nextInt();
			if(num<0)System.out.println("no nagetive");
			else
			{
				int res =PracticeAllPrograms.reverse(num);
				System.out.println(num+" reverse is "+res);
				
			}		
		}
		else if(choice ==3)
		{
			System.out.println("power of number");
			System.out.println("Enter a number");
			int a=s.nextInt();
			System.out.println("enter b number");
			int b=s.nextInt();
			int res = PracticeAllPrograms.power(a, b);
			System.out.println("power of the number is:"+ res);
		}
		else if(choice==4)
		{
			System.out.println("length of a number");
			System.out.println("enter a number");
			int num =s.nextInt();
			if(num<0)System.out.println("no negetive");
			else
			{
				int res =PracticeAllPrograms.length(num);
				System.out.println("length is:"+res);
			}
	    }
		else if(choice==5)
		{
			System.out.println("summation of a number");
			System.out.println("enter the number");
			int num=s.nextInt();
			if(num<0)System.out.println("no negetive");
			else
			{
				int res=PracticeAllPrograms.summation(num);
				System.out.println("the sum is :"+res);
			}

		}
		else if(choice==6)
		{
			System.out.println("armStrong number");
			System.out.println("enter the number");
			int num=s.nextInt();
			if(num<0)System.out.println("no negetive");
			else
			{
				int res=PracticeAllPrograms.armstrongNumber(num);
				if(num==res)System.out.println("im armstrong :"+res);
				else System.out.println("im not armstrong");
		    }
		}
		else if(choice==7)
		{
			System.out.println("Strong number");
			System.out.println("enter the number");
			int num=s.nextInt();
			if(num<0)System.out.println("no negetive");
			else
			{
				int res=PracticeAllPrograms.strongnumber(num);
				if(num==res)System.out.println("im strong :"+res);
				else System.out.println("im not strong");
			}
		}
		else if(choice==8)
		{
			System.out.println(" range of armStrong number");
			System.out.println("enter the range");
			int range =s.nextInt();
			for(int i=1;i<range;i++)
				{
				if(i==PracticeAllPrograms.armstrongNumber(i))
				System.out.println(i);
				}
		}
		else if(choice==9)
		{
			System.out.println("Range of Strong number");
			System.out.println("enter the number");
			int range=s.nextInt();
			for(int i=1;i<=range;i++)
			{
				if(i==PracticeAllPrograms.strongnumber(i))
					System.out.println(i);
				
			}
		}
		else
		{
			System.out.println("SIR/MAM Its Ok.");
			System.out.println("you commited a mistake giving wronge choice.");
			System.out.println("Try Again");
		}
		System.out.println("Do You Want To Continue: Y/y");
		char ch=s.next().charAt(0);
		if(ch=='Y'||ch=='y')
			;//System.out.println("continue");
		else
		{
			System.out.println("SIR/MAM Thank You For Using My Software");
			System.out.println("Have a great day,Visite Again");
		
		}
     }
  }
	  

		
