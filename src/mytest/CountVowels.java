package mytest;

public class CountVowels {

	public static void main(String[] args) {
		int countvowels=0;
		String str="Nikhil Singhal";
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				System.out.print(" "+ch);
				countvowels++;
				
				
			}
		}
	System.out.println();
	System.out.println("Totalno Vowels:"+countvowels);
	}

}
