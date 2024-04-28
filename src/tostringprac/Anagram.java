package tostringprac;

public class Anagram {
			public static void main(String[] args) {
		         String s="abhcd";
		         String s2="dchba";
		        int count=0;
		        if(s.length()==s2.length())
		        {
		         for(int i=0;i<s.length();i++)
		         {
		        	 char ch=s.charAt(i);
		        	 System.out.println(ch);
		        	 for(int j=0;j<s2.length();j++)
			         {
			        	 char ch1=s2.charAt(j);
			        	 System.out.println(ch1);
			        	 if(ch==ch1)
			        	 {
			        		 count++;
			        	 }
			         }
		         }
		         System.out.println(count);
		         System.out.println(s.length());
		         System.out.println(s2.length());
		         if(count==s.length())
		         {
		        	 System.out.println("anagram");
		         }
		         else System.out.println("not");
			}
		        else System.out.println("length of string s and s2 must be same");

			}

	}


