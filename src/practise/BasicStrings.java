package practise;

public class BasicStrings {

	public static void main(String[] args) {
		String x="gudu";
		String y="saroj";
		int a=10;
		int b=20;
		
		double i=12.33;
		double j=13.22;
		System.out.println();
		System.out.println(x+y);
		System.out.println();

		System.out.println(a+b);
		System.out.println();
//String concatenates with integer behaves as a string if initial we assign string first
		System.out.println(x+y+a+b);
		System.out.println();
//integer concatenates with string behaves as first concatenation as integer and following string are string only
		
		System.out.println(a+b+x+y);
		System.out.println();
		System.out.println(a+b+x+y+i+j);

		System.out.println(i+j+a+b+x+y);
	/*O/p-
	gudusaroj

	30

	gudusaroj1020

	30gudusaroj

	30gudusaroj12.3313.22
	55.55gudusaroj
*/
	
	}

}
