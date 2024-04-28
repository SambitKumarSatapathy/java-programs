package com.jsp.oopspack;
     class Student{
    	 int sid;
    	 String name;
    	 int age;
    	 String gender;
    	 String phoneno;
    	 static String collegename;
    	 static String collegeaddress;
     public void addstudentdetails(int id,String sname,int sage,String gendr,String phone) {
    	 sid=id;
    	 name=sname;
    	 age=sage;
    	 gender=gendr;
    	 phoneno=phone;
     }
     public void displaystudentdetails() {
    	 System.out.println("student id:"+sid);
    	 System.out.println("student name:"+name);
    	 System.out.println("student age:"+age);
    	 System.out.println("student gender:"+gender);
    	 System.out.println("student phone no:"+phoneno);
    	 System.out.println("student collegename:"+collegename);
    	 System.out.println("student collegeaddress:"+collegeaddress);
    	 System.out.println("*******************************"); 
     }
     public static void changecollegename(String cname) {
    	collegename=cname; 
     }
     public static void changecollegeaddress(String caddress) {
    	 collegeaddress=caddress;
     }
     }
     

public class Studentinfo {

	public static void main(String[] args) {
		Student.collegename="jsp";
		Student.collegeaddress="OAR";
		Student s1=new Student();
		s1.addstudentdetails(1,"hacker phani",23,"male","7234873247");
		s1.displaystudentdetails();
		Student s2=new Student();
		s2.addstudentdetails(2,"hacker sheela",23,"female","387872357");
		s2.displaystudentdetails();
		Student.changecollegename("jsp dev unit");
		Student.changecollegeaddress("marathahalli");
		s1.displaystudentdetails();
		s2.displaystudentdetails();
		

	}

}
