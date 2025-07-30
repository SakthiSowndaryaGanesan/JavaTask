package Features;


enum Level{  //When we needs to give a group constant value that time we can use this enum.
	BIGINNER ("B") , INTERMEDIATE("I") , ADVANCED("A"); // For the constructor we created a obj here itself.
	
	//we can write a constructor also
	
	private String abbr;
	
	Level(String ab){
		abbr=ab;
	}
	
	public String getAbbr() {
		return abbr;
	}
}
public class Enum {

	public static void main(String[] args) {
		// We can use this by creating an obj
		
		Level l1=Level.ADVANCED;
		System.out.println(l1);
		
		System.out.println(l1.getAbbr()); //Encapsulation

	}

}
