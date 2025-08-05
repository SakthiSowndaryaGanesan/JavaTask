package SetCollection;

import java.util.EnumSet;
import java.util.Iterator;

enum Size{
	SMALL , MEDIUM , LARGE , EXTRALARGE
}

public class EnumSetDemo {
	
	public static void main(String[] args) {

		EnumSet <Size> eset = EnumSet.allOf(Size.class);
		System.out.println("enum set content : "+ eset);
		
		EnumSet <Size> eset1 = EnumSet.noneOf(Size.class);
		System.out.println(eset1);
	
		EnumSet <Size> eset2 = EnumSet.range(Size.MEDIUM,Size.EXTRALARGE); //From to to
	    System.out.println(eset2);
	
	     EnumSet <Size> eset3 = EnumSet.of(Size.SMALL,Size.LARGE);
      	System.out.println(eset3); //Need specfic elelement.
		
		//Adding
		
		eset.add(Size.EXTRALARGE);
		System.out.println(eset);
		
		Iterator<Size> it= eset.iterator();
		while (it.hasNext()) {
			Size s = (Size) it.next();
			System.out.print( s + ", ");
		}

		
		

	}

}


