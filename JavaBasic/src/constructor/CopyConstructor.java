package constructor;

public class CopyConstructor {

	int x;
	

	public CopyConstructor() {

	}

	public CopyConstructor(int i) {
		x = i;
	}

	public void display() {
		System.out.println("x value is : " + x);
	}
	
	// Copy Constructor (When we pass argument as class)
	public CopyConstructor(CopyConstructor copyConstructor) {
		System.out.println("Copy Constructor is call.....");
		x = copyConstructor.x;
	}

	public void methodCall() {

		CopyConstructor CopyConstructorOne = new CopyConstructor(11);
		CopyConstructorOne.display();
		
		//Copy Constructor is called => As many class you create it has same value
		CopyConstructor CopyConstructorTwo = new CopyConstructor(CopyConstructorOne);
		CopyConstructorTwo.display();
	}
}
