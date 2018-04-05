package mytest;

import java.util.Scanner;

import org.testng.Assert;

public class ASEERTIONVALUES {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Age: ");
		int input=scan.nextInt();
		int my_original_age=27;
		Assert.assertEquals(input, my_original_age);
		System.out.println("My Age is :"+my_original_age);
		
		

	}

}
