package practise;

import java.util.Scanner;

public class JavaSwitch {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your Colour");
		String color=scan.nextLine();
		
		switch(color) {
		case "violet":
			System.out.println("this is violet");
		break;
		case "black":
			System.out.println("this is black");
			break;
		
		case "red":
			System.out.println("this is red and its my favourite");
			break;
			
		case "grey":
			System.out.println("this is grey");
		break;
		
		case "white":
			System.out.println("this is white");
		break;
		
		case "blue":
			System.out.println("this is blue");
		break;
		
		case "pink":
			System.out.println("this is pink");
		break;
		
		default:
				System.out.println("which color is this");
		
				scan.close();
		
		
		}

	}

}
