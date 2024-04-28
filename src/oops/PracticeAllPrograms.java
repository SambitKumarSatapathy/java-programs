package oops;

public class PracticeAllPrograms {

	public static int factorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)fact*=i;
		return fact;
      }
	public static int reverse(int num) {
		int rev=0;
		for(;num>0;num/=10)rev=rev*10+num%10;
		return rev;
	}
	public static int power(int a,int b) {
		int res=0;
		for(int i=1;i<=b;i++)res*=a;
		return res;
	}
	public static int length(int num) {
		int count=0;
		for(;num>0;num/=10) count++;
		return count;
	}
	public static int summation(int num) {
		int sum=0;
		for(;num>0;num/=10)sum+=num%10;
		return sum;
	}
	public static int armstrongNumber(int num) {
		int count =length(num);
		int res=0;
		for(;num>0;num/=10)res+=power(num%10,count);
		return res;
	}
	public static int strongnumber(int num) {
		int res=0;
		for(;num>0;num/=10) res +=factorial(num%10);
		return res;
	}
	
}
