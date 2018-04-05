package mytest;

import org.python.apache.xerces.util.SynchronizedSymbolTable;

public class Showable {
public static void main (String[]args) {
	//1-while Loop-
	//disadvantages-we must declare incremental /decremental value othe wise we will get infinite loop
	//with incremental values
	int i=1;//initialization
	while(i<=10) {//conditional
		System.out.println(i);
		i++;//incremental
		
		}

	System.out.println("===============");
	
//with decremental values
int j=10;
while(j>=1) {
	System.out.println(j);
	j--;

	

}
//for loop for positive as well as negative values
System.out.println("==============");
for(int k=10;k>=-10;k--) {
	System.out.println(k);
	}

for(int x=1;x<=10;x++) {
	for(int y=1;y<=x;y++) {
		System.out.print(" "+0);
	}
System.out.println(" "+0);
}
}
}
