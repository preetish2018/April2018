package mytest;

import java.util.ArrayList;

public class ArraysInSquarebraces {

	public static void main(String[] args) {
		ArrayList al=new ArrayList(){
			{
				add("apple");
				add("orange");
				add("banana");
			}
		};
System.out.println(al);
	}

}
