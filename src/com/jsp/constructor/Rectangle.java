package com.jsp.constructor;
class E
{
	int length;
	int breadth;

	public void Initialization(int a,int b)
	{
		length =a;
		breadth =b;
		System.out.println(length);
		System.out.println(breadth);
	}
	public void displayarea()
	{
//		System.out.println(area);
		System.out.println(length);
		System.out.println(breadth);
  }
	public void calarea()
	{
//		System.out.println(l+" "+b);
		int area=length*breadth;
		System.out.println(area);
	}
}


public class Rectangle {

	public static void main(String[] args) {
	 
	    E e = new 	E();
	    e.displayarea();
	    e.Initialization(5,7);
		e.calarea();

	}

}
