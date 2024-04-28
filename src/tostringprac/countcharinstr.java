package tostringprac;

public class countcharinstr {

	public static void main(String[] args) {
		String s ="apple";
		int count = 0;
		for(int i=0;i<s.length();i++)
	    {
			while(true) {
				char ch = s.charAt(i);
				if(s.charAt(i)==ch)
					{
					
					count++;
					}
	    
				
				System.out.println(ch+" "+count);
	    }
	}
	}
}
