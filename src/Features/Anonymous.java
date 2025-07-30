package Features;

class A{
	public void newMovie() {
		System.out.println("New movie will be released on 29-08-2025.");
	}
}

public class Anonymous {

	public static void main(String[] args) {

		A obj =new A() {  
			
			public void newMovie() { //No name for this class
				System.out.println("Movie already released yesterday.");
			}
		};
		
		obj.newMovie();
		
	}

}
