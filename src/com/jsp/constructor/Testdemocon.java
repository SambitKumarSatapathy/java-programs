package com.jsp.constructor;

class S
{
  static int i;
	S()
	{
		i++;
	}

}


public class Testdemocon {

	public static void main(String[] args) {
	          S g = new S();
	          new S();
	          new S();
	          new S();
	          new S();
	          new S();

	          new S();

	          new S();


			System.out.println(S.i);
		}

	}
