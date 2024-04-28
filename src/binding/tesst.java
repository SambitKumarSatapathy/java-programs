package binding;
class A
{
	static void m1()
	{
		System.out.println("im  in a");
	}
}
class 	B extends A
{
	static void m1()
	{
		System.out.println("im  in b");
	}
}
public class tesst {

	public static void main(String[] args) {
		A.m1();
		B.m1();
		A a;
		a=new A();
		a.m1();
		a=new B();
		a.m1();

	}

}
