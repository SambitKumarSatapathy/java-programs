package mathods.pack1;
class demo{
	static int k;
	int j;
}
class memo{
	static int k=634;
}

public class Test1 {

	public static void main(String[] args) {
		demo d1=new demo();
		d1.j=27;
		System.out.println(d1.j);
		System.out.println(demo.k);
		System.out.println(memo.k);
		

	}

}
