package Java17Features;

public class PatternMatchingDemo {
	
	   static void printValueType(Object obj) {
	        String message = switch (obj) {
	            case String s       -> "It's a String of length: " + s.length();
	            case Integer i      -> "It's an Integer, squared: " + (i * i);
	            case Double d       -> "It's a Double, rounded: " + Math.round(d);
	            case Boolean b      -> "It's a Boolean: " + b;
	            case null           -> "It's a null value!";
	            default             -> "Some other type: " + obj.getClass().getSimpleName();
	        };

	        System.out.println(message);
	    }

	public static void main(String[] args) {
		
		        printValueType("Hello");
		        printValueType(42);
		        printValueType(3.14);
		        printValueType(true);
		        printValueType(null);
		    }

		 
		

		}

	


