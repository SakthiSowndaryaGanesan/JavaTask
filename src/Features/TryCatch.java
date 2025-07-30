package Features;

public class TryCatch {

	public static void main(String[] args) {
		
		int i=2;
		
		int j=0;
		
		int num[]=new int [5];
		
		String str=null;
		
		
		try {
			
			j=18/i;
			
			System.out.println(str.length());
			
			System.out.println(num[1]);
			System.out.println(num[5]);
			
		}
		catch (ArithmeticException e) {
			
			System.out.println("Can't divide by zero" +e); //if we put e that will mention what is the error.
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array limit is out of boundary.Stay in your limit");
		}
		catch (Exception e) {
			System.out.println("Something went wrong"+e);
		}
		
		System.out.println(j);
		System.out.println("Bye");
		
	}

}
