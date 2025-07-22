package Method;


 
public class MethodExample {
	
	//Without argument and without return, void indicated without return type.
	public void add(){
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Addition value is : " + c);
	}
	
	//Without argument and with return type. If we return some values that should be used in some places.
	public String StudentName(){
		
		return "Sakthi";
	}
	
	//With argument without return
	
	public void PrintSquare(int a) {
		
		int square = cal_sqr(a); //Here we are calling another method to perform in this method.
	}
	
	//With argument with return
	
	 public int cal_sqr(int x) {
		 
		 int sqr=x*x;
		 System.out.println("Square answer is : "+sqr);
		 return sqr;
	 }

	public static void main(String[] args) {

		MethodExample obj=new MethodExample();
		obj.add();
		String Sna = obj.StudentName();  //Return value is stored in the Sna variable now.
		System.out.println("Student Name is : " + Sna); //Now the Sna was printed here.
		obj.cal_sqr(3); //Passing the parameter
		obj.PrintSquare(4);
		
	}

}
