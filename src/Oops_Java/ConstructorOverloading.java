package Oops_Java;

class Book{
	
	int Price;
	int Weight;
	String Name;
	int Quantity;
	double Total;
	
 Book(int price,int weight){ //Contructor- class name and method name should be same
	 Price=price;
	 Weight=weight;
	 
	 System.out.println("Your book price is : "+price +" and weight: "+weight);
	 
 }
 
 Book(int price,int quantity,String name){
	 
	 Total =price*quantity;
	 
	 System.out.println("Book Name : "+name);
	 System.out.println("Total Value :" +Total);
	 
 }
 Book(int price,int quantity,int discount,String name){
	 
	 Total=price*quantity;
	 
	 double Discount=Total*(discount/100);
     double finaltotal=Total-Discount;
	 System.out.println("Book Name : "+name);
	 System.out.println("Total value : "+finaltotal);
	 System.out.println("You got a "+discount+"% discount on this purchase.");
	 
 }
 
	
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Book bk=new Book(100,3);
		Book bk2=new Book(10,3,"Java");
		Book bk3=new Book(1000,3,10,"Java Book");
		
		
		
	}

}
