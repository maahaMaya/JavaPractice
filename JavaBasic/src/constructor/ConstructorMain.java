package constructor;

public class ConstructorMain {

	public static void main(String[] args) {

		// Implict Constructor call
		ImplictConstructor implictConstructor = new ImplictConstructor();

		// Default Constructor without parameter
		DeafultConstructor deafultConstructor = new DeafultConstructor();

		// Parameterized Constructor(Error because there is only one Constructor and
		// which require parameter)
		// ParameterizedConstructor parameterizedConstructor = new
		// ParameterizedConstructor(); => Error

		// Parameterized Constructor
		ParameterizedConstructor parameterizedConstructorOne = new ParameterizedConstructor(10);
		ParameterizedConstructor parameterizedConstructorTwo = new ParameterizedConstructor(20);
		
		CopyConstructor_WithoutProblem constructor_WithoutProblem = new CopyConstructor_WithoutProblem();
		constructor_WithoutProblem.methodCall();
		
		CopyConstructor copyConstructor = new CopyConstructor();
		copyConstructor.methodCall();
		
		StaticConstructor staticConstructor = new StaticConstructor();

	}
}
