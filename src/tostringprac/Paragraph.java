package tostringprac;

public class Paragraph {

	public static void main(String[] args) {
		String s="abcde";
		boolean f=true;
		System.out.println(s.length());
		for(int i=0;i<s.length();i++)
		{
			char ch =s.charAt(i);
			System.out.println(ch);
			if(ch>='a'&&ch<='z')
			{
				
			}
			else
			{
				f=false;
				
			}
		}
		if(f) System.out.println("paragraph");
		else System.out.println("not");
	}

}
//					)||(ch>='A'&&ch<='Z')