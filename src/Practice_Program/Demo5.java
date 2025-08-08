package Practice_Program;

class Book1{

	String name;
	int price;
	int quantity;

	Book1(String name){
	this.name=name;
	System.out.println("This book name is : " + name);

	}
	Book1(int price,int quantity){
	this.price=price;
	this.quantity=quantity;
	double total = price*quantity;

	System.out.println("The total value is : "+total);
	}
	}
public class Demo5 {
	public static void main (String args[]){
	

	Book1 bk=new Book1("Java Book");
	Book1 bk1=new Book1(300,3);

	}
}
