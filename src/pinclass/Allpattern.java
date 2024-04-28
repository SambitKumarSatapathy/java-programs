package pinclass;

import java.util.Scanner;

public class Allpattern {
	public void star(){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j||i+j==n+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
	}
	public void sq() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||j==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
		
	}
	public void buttfly() {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	for(int i=1;i<=n;i++) {
		for(int j=1;j<=n;j++) {
			if(i==j||i+j==n+1||j==1||j==n) {
				System.out.print("*");
			}
			else System.out.print(" ");
		}
		System.out.println( );
	}
	}
	public void m() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1||j==n||i+j==n+1&&i<=n/2+1||i==j&&i<=2) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
	}
	public void starrrr(int n) {
		
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(i==j) {
					System.out.print(i);
				}
				else System.out.print("*");
			}
			System.out.println( );
		}
	}
public void starrrrsame(int n) {
		int o=5;
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=1;j--) {
				if(i==j) {
					System.out.print(o--);
				}
				else System.out.print("*");
			}
			System.out.println( );
		}
	}
	
	public void tri() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			 }
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
		 }
			System.out.println( );
		}
	}
	
	
	
	public void s() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||i==3||i==5||(i==4&&j==5)||(i==2&&j==1)) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
		}
	public void starpattpointingtoright() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			System.out.println( );
			}
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
					System.out.print("*");
				}
			System.out.println( );
			}
		}
	
	
	
	
	public void buttflyfillstar() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
			System.out.println( );
			}
		for(int i=1;i<=n;i++) {
			for(int j=n-1;j>=i;j--) {
					System.out.print("*");
				}
			System.out.println( );
			}
		}
	
	
	
	
	
	public void starpattpointingtoleft() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>i;j--) {
					System.out.print(" ");
				}
		for(int j=1;j<=i;j++) {
			
					System.out.print("*");
		}
				
			System.out.println( );
		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
					System.out.print(" ");
				}
		for(int j=n-1;j>=i;j--) {
			
					System.out.print("*");
		}
				
			System.out.println( );
		}
	}
	
	
	
	public void downdia() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				
			System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(i==n||j==2*i-1||j==1) {
				System.out.print("*");
				}
			else System.out.print(" ");
		}
			System.out.println( );
		}
	}
	public void downdiafillwithstar() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				
			System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				
				System.out.print("*");
				
			
		}
			System.out.println( );
		}
	}
	public void uppyr() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				
			System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(i==n||j==2*i-1||j==1) {
				System.out.print("*");
				}
			else System.out.print(" ");
		}
			System.out.println( );
		}
	}
	public void diamond() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void onlysidestardiamond() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1)
				System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println( );
		}
		for(int i=n-1;i>=1;i--) { 
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				if(j==1||j==2*i-1)
					System.out.print("*");
					else System.out.print(" ");
			}
			System.out.println();
		}
	}
	public void outsidestarprintindiamond() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*i-2;j++) {
				
				System.out.print(" ");
				
			}
			for(int j=1;j<=n-i+1;j++) {
				System.out.print("*");
			}
			System.out.println( );
		}
		for(int i=n-1;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			for(int j=1;j<=2*i-2;j++) {
		
					System.out.print(" ");
					
			}
			for(int j=i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void t() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==n/2+1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
		}
	public void pott() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=1;j--) {
				if(i>=j) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
		}
	public void star12345() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
		}
	public void d() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j<=n-1||j==1||i==n&&j<=n-1||i>=2&&i<=4&&j==n) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
		}
	public void g() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||i==n/2+1&&j>2||j==5&&i==n-1) {
					System.out.print("*");
				}
				else System.out.print(" ");
			}
			System.out.println( );
		}
		}
	public void snumpri() {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int p=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(i==3) {
					System.out.print(p++);
				}
				else System.out.print("*");
			}
			System.out.println( );
		}
	}
	
	public void Nnumprint() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+j+" ");
			
			}
			System.out.println();
		}
	}
	
	public void Nnumprint2() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+j+" ");
			
			}
			System.out.println();
		}
	}
	public void star1stspace() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star1sstspcthennum() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star23() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	public void star234() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star4() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star5() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star6() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=i;j>=1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public void star7() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star8() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	
	public void star9() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			
			for(int j=n;j>=i;j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star10() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=i;j<=n;j++) {
				
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star11() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void star12() {
		Scanner s =new Scanner (System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
//operator is use to perform some task.
	public static void main(String[] args) {
		Allpattern p=new Allpattern();
		//p.star();
		//p.starrrr(5);
		//p.sq();
		//p.buttfly();
		//p.downdia();
		//p.t();
		//p.pott();
		//p.star12345();
		//p.snumpri();
		//p.uppyr();
		//p.diamond();
		//p.onlysidestardiamond();
		//p.outsidestarprintindiamond();
		//p.downdiafillwithstar();
		//p.s();
		//p.d();
		//p.g();
		//p.m();
		//p.starpattpointingtoright();
		//p.starpattpointingtoleft();
		//p.tri();
		//p.Nnumprint();
	      //p.Nnumprint2();
		//p.starrrr(5);
		//p.starrrrsame(5);
		//p.star1stspace();
		//p.star1sstspcthennum();
		//p.star23();
		//p.star234();
		p.star4();
//		p.star5();
//		p.star6();
//		p.star7();
//		p.star8();
//		p.star9();
//		p.star10();
//		p.star11();
//		p.star12();
		//p.starpattpointingtoright();
		
	}

}
