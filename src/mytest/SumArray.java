package mytest;

public class SumArray {
	public static int sumofArray() {
		int []a= {10,20,30,40};
		int sum=0;
		for(int arr:a) {
			sum=sum+arr;
			
		}
		
		
		return sum;
		
	}

	public static void main(String[] args) {
		SumArray a=new SumArray();
		System.out.println("Sum of Arrays :"+a.sumofArray());

	}

}
