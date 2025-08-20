package Java17Features;

public class Patterninstanceof {

	static void printObject(Object obj) {
		if(obj instanceof String str) {
			System.out.println("String name :" + str);
			System.out.println(str.length());
			System.out.println(str.toUpperCase());
		}
		else if(obj instanceof Integer it) {
			System.out.println("Integer value : " +it);
			System.out.println("Square : "+ it*it);
		}
		else {
			System.out.println("Other type : " + obj );
		}
	}
	public static void main(String[] args) {
		printObject("Sakthi ganesan");
		printObject(4);
		printObject("ACE13007");
		printObject(234.98);

	}

}
