package com.jsp.constructor;
class car
{
	String carname;
	String carcolor;
    int carno;
	static int i=1000;
	car()
	{
//		System.out.println("car number = "+  ++i);
		i++;
	}
	car(String i,String j)
	{
		carname = i;
		 carcolor = j;
	}

	public void display()
	{
		System.out.println("car number = "+i++);
		System.out.println("car name = "+carname+"  "+"car color = "+carcolor);
	}
	
	
}

public class CarDetails {

	public static void main(String[] args) {
		car c= new car("RR","BLACK");
		c.display();
		
		
car r= new car("BMW","BLUE");
	r.display();	
		
car g= new car("SWIFT","RED");
	g.display();	
		

	}

}
