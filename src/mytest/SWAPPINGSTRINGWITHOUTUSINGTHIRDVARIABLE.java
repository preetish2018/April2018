package mytest;

import java.util.Scanner;

public class SWAPPINGSTRINGWITHOUTUSINGTHIRDVARIABLE {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String :");
		String input1=scan.nextLine();
		System.out.println("Enter a String :");
        String input2=scan.nextLine();
        System.out.println("Before swap: " + input1 + " " + input2);
        input1=input1+input2;
        input2=input1.substring(0, input1.length()-input2.length());
        input1=input1.substring(input2.length());
        System.out.println("After swap: " + input1 + " " + input2);  

	}

}
