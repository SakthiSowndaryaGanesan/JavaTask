package Method;

class Box{
	int length;
	int breadth;
	int height;
}

public class ClassDemo {

	public static void main(String[] args) {

Box Blackbox=new Box();		//class obj = new class();
Blackbox.length=10;
Blackbox.breadth=8;

Box Woodenbox=new Box();
Woodenbox.length=20;
Woodenbox.height=30;
Woodenbox.breadth=30;

System.out.println(Blackbox.height);  // Height is not mentioned so output is 0
System.out.println(Woodenbox.height);

	}

}
