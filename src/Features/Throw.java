package Features;

class OwnException extends Exception{ //Creating own exception by extending features from parent
	public OwnException(String string) {
		super(string); //If we are accepting the message we need to pass the message.
	}
}
public class Throw {

	public static void main(String[] args) {
		 
		int i=20;
		int j=0;
		
		try {
			j=18/i;
			
			if(j==0) {
				throw new OwnException("Can't divide by zero"); //Can pass the comment in constructor
			}
		}
			
			catch(OwnException e) {
				j=18/1;
			System.out.println("That's the default output"+e);
		}
			catch(Exception e) {
			System.out.println("Something went wrong" +e);
		}
		
		System.out.println(j);
		System.out.println("Execution done");
		
	}

}
