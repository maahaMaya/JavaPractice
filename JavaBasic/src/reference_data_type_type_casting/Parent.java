package reference_data_type_type_casting;

class A {

}

class B extends A {

}

class C extends B {

}

class D {

}

public class Parent {

	public static void main(String[] args) {
		Object object = new Object();
		Object object1 = new A();
		Object object2 = new B();
		Object object3 = new C();
		Object object4 = new D();

		A a = new A();
		A a1 = new B();
		A a2 = new C();
		// A a3 = new D(); Error
		// A a4 = new Object(); Error

		B b = new B();
		// B b1 = new A(); Error
		B b2 = new C();
		// B b3 = new D(); Error
		// B b = new Object(); Error

	}
}
