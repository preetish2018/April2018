package mytest;

import java.util.Arrays;

public class EqualityArray {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {1,2,3,4,5};
		/*for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
			}
						
		}

	}*/
		
		if(Arrays.equals(a, b)) {
			System.out.println("same");
		}
		else {
		System.out.println("notsame");
		}
}
	
}	

