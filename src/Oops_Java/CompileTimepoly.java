package Oops_Java;

//Billing system for grocery shop
//Method over loading - compile time poly
//Same method name but different parameters in same class

public class CompileTimepoly {
	
	//Method 1 - bill based no parameters
	void CalculateBill() { 
		System.out.println("No items are selected. Total bill is Rs.0.0");
	}
	
	//method 2- price, quantity. Parameter given
	void CalculateBill(double price,int quantity ) {
		
		double total=price*quantity;
		
		System.out.println("Total Bill : "+total);
		System.out.println("-------------");
	}
	
	//Method 3- price,quantity,discount
	void CalculateBill(double price,int quantity,double discountpercent) {
		
		double total=price*quantity;
		
		double discount=total*(discountpercent/100);
		
		double finalamount=total-discount;
		
		System.out.println("The bill after " +discountpercent+" discount % : Rs."+finalamount);
		System.out.println("You saved "+discount+" on this purchase");
		System.out.println("-------------");

	}
	
	//Method 4 name,price,quantity
	void CalculateBill(String itemname,double price,int quantity) {
		
		double total=price*quantity;
		
		System.out.println("Item name : "+itemname);
		System.out.println("Quantity : "+quantity);
		System.out.println("Total Bill : "+total);
		
	}


	public static void main(String[] args) {

		CompileTimepoly mol=new CompileTimepoly(); //Created a obj for the class
		
		mol.CalculateBill();
		mol.CalculateBill(250,3);
		mol.CalculateBill(300, 3 , 10);
		mol.CalculateBill("Sugar", 40, 5);
		
	}

}
