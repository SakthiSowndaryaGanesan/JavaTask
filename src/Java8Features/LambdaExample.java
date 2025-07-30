package Java8Features;

interface Shape{
	void draw();
}
public class LambdaExample {
	
	private static void print(Shape shape) {
		shape.draw();
	}

	public static void main(String[] args) {
		
		
		Shape Rectangle=	()->System.out.println("This is rectangular shape");		
		//Rectangle.draw();

		Shape Circle=	()->System.out.println("This is Circle shape");		
		Circle.draw();
		
		Shape Square=()-> System.out.println("This is Square share");
		Square.draw();
		
		print(Rectangle); //Passing the parameter in lambda

	}
	

}
