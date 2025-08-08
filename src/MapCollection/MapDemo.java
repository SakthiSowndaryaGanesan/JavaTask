package MapCollection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String args[]) {
		
   Map<Integer,String> map=new HashMap<>();
   
   map.put(1, "One");
   map.put(2, "two");
   map.put(3, "Three");
   map.put(4, "Four");
   map.put(5, "Five");
   map.put(2, "Two"); //If the same key repeats then value will be updated
   
   map.putIfAbsent(6, "Six"); //new value will be added 
   map.putIfAbsent(2, "Twoo"); //Since already 2 is there the value won't be replaced.
  
   Map<Integer,String>map2=new HashMap();
   
   map2.put(7, "Seven");
   map2.put(8, "Eight");
   map2.put(9, "Ninen");
   

   map.putAll(map2);
   
   System.out.println(" Map contens " + map2);
   
   System.out.println("Key =3 having value : " + map.get(3)); //get method will used to return the value
   
   System.out.println(map.keySet()); //All the key will be printed
   System.out.println(map.values()); //All the values will be printed
   
	} 
   
}
