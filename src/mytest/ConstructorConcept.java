package mytest;

public class ConstructorConcept {
	public ConstructorConcept() {
		System.out.println("This is my default constructor");
	}

	public ConstructorConcept(int i) {
		System.out.println("This is my  single parameter constructor");
		System.out.println("the value of i  " + i);
	}

	public ConstructorConcept(int i, int j) {
		System.out.println("This is my two parameters constructor");
		System.out.println("the value of i " + i);
		System.out.println("the value of j " + j);
	}

	public static void main(String[] args) {

		ConstructorConcept c = new ConstructorConcept();
		ConstructorConcept c1 = new ConstructorConcept(10);
		ConstructorConcept c2 = new ConstructorConcept(10, 20);
	}

    }
