package tostringprac;

public class numstr {

	public static void main(String[] args) {
         String s="abc12de3f5ghi345";
         String s2="";
         String s3="";
         for(int i=0;i<s.length();i++)
         {
        	 char ch=s.charAt(i);
        	 System.out.println(ch);
        	 if(ch>='a'||ch>='z')
        	 {
        		 s2+=(char)ch;
        		 
        	
        	 }
        	 else if(ch>='0'&&ch<='9')
        	 {
        		 s3+=ch;
        	 }
        	 else
        	 {
        		 
        	 }
         }
         System.out.println(s2+s3);
	}

}
