package practise;

public class Vowels {

	public static void main(String[] args) {
		//java always takes current variable values from a class
		int k=10;
		k=50;
		System.out.println(k);
		String s= "preetish";
//		char ch;
		for(int i=0 ;i<s.length();i++) {
		char ch1=s.charAt(i);
			if(ch1=='a'||ch1=='e'|| ch1=='i'|| ch1=='o'|| ch1=='u') {
		     System.out.print(" "+ch1);
			}	
		}
		

	}

}
