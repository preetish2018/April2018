package practise;

import java.util.Scanner;

public class JavaIfELSE {
	public static void main (String []args) {
Scanner scan=new Scanner(System.in);
System.out.println("Enter a Digit to check it");
int input=scan.nextInt();
if(input>5) {
	System.out.println("x is closer to ten");
}
else {
	System.out.println("x is not closer");
	}

scan.close();
	}
}