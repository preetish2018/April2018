package mytest;

import java.util.Scanner;

public class CalculateDistanceBetweenTwoPoints {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter value for x1 co-ordinate :");
		double x1=scan.nextDouble();
		
		
		System.out.println("Enter value for y1 co-ordinate :");
		double y1=scan.nextDouble();

		System.out.println("Enter value for x2 co-ordinate :");
		double x2=scan.nextDouble();
	
		System.out.println("Enter value for y2 co-ordinate :");
		double y2=scan.nextDouble();
	
	double distance=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	
	System.out.println("Generated Distance : "+distance);
	}

}
