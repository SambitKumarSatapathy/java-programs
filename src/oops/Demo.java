package oops;
class A
{
	int i;
	static int j;
	public void initialize()
	{
		i++;
		j++;
	}
	public void display()
	{
		System.out.println(i+" "+j);
	}
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       A a1=new A();
       A a2=new A();
       A a3 =new A();
       
       a1.initialize();
       a1.display();
       
       a2.initialize();
       a2.display();
       
       a3.initialize();
       a3.display();
    		   
       a1.initialize();
       a2.initialize();
       a3.initialize();
       
       a1.display();
       a2.display();
       a3.display();
       
       a1.initialize();
       a2.initialize();
       a3.initialize();
       
       a1.display();
       a2.display();
       a3.display();
       
	}

}
