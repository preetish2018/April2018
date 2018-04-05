package mytest;

public class DUPLICATESARRAYS {

	public static void main(String[] args) {
		
		int[]a= {1,2,2,3,4,5,6,6};
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
			if((a[i]==a[j])&& (i!=j)) {
				System.out.println("Dupliactes are :"+a[j]);
				
			}
				
				
			}
		}

	}

}
