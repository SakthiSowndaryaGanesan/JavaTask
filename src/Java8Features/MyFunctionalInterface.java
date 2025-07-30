package Java8Features;

@FunctionalInterface  //Need to define with this annotations
public interface MyFunctionalInterface {
	
	void print(String msg); //only one abstract method
	
	default void m1() {
		System.out.println("Default method");
	}
	static void m2() {
		System.out.println("Static method");
	}
	
}
