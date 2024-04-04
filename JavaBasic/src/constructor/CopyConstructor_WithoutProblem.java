package constructor;

public class CopyConstructor_WithoutProblem { //Problem Solution :: CopyConstructor
	int x;

	public CopyConstructor_WithoutProblem() {

	}

	public CopyConstructor_WithoutProblem(int i) {
		x = i;
	}

	public void display() {
		System.out.println("x value is : " + x);
	}

	public void methodCall() {
		// Problem is that if there is multiple object to call constructor then the
		// Constructor store only latest value not the previous value
		// (and we there is 100plus class object is created then its a problem)
		CopyConstructor_WithoutProblem copyConstructor_WithoutProblemOne = new CopyConstructor_WithoutProblem(11);
		copyConstructor_WithoutProblemOne.display();
		CopyConstructor_WithoutProblem 	copyConstructor_WithoutProblemTwo = new CopyConstructor_WithoutProblem(33);
		copyConstructor_WithoutProblemTwo.display();
	}

}
