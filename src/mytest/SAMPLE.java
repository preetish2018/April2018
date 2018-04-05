package mytest;

import java.util.ArrayList;
import java.util.Iterator;

public class SAMPLE {
int number;
String name;
String author;
float price;
int quantity;

	public SAMPLE(int number,String name,String author,float price,int quantity) {
		this.number=number;
		this.name=name;
		this.author=author;
		this.price=price;
		this.quantity=quantity;
		
	}
public static void main (String args[]) {
	
SAMPLE b1=new SAMPLE(101,"C++","KANITHKAR",500,2);
SAMPLE b2=new SAMPLE(102,"JAVA","BALAGURUSWAMY",700,1);
 ArrayList<SAMPLE>al=new ArrayList<SAMPLE>();
 al.add(b1);
 al.add(b2);
 for(SAMPLE b:al) {
 System.out.println(b.number+"    "+ b.name+"   "+ b.author+"   "+ b.price+"    "+  b.quantity);


 }
}
	
	
	
	
	
	

}
