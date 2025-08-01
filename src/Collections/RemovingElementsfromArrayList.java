package Collections;

import java.util.ArrayList;
import java.util.List;

//remove() , removeAll() , clear()
public class RemovingElementsfromArrayList {

	public static void main(String[] args) {
		
		List<String> studentsName = new ArrayList<>();
		studentsName.add("Sakthi");
		studentsName.add("Prabha");
		studentsName.add("vishnu");
		studentsName.add("Kavya");
		studentsName.add("Sundar");
		
		System.out.println(studentsName);
		
		studentsName.remove(0);
		System.out.println(studentsName); //0 index removed
		
		studentsName.remove("Sundar"); 
		System.out.println(studentsName); //Prabha element removed
		
		
		studentsName.add("Sundar");
		studentsName.add("Sundar");
		studentsName.add("Sundar"); //Added

		System.out.println(studentsName);
		//studentsName.removeAll(studentsName);
		System.out.println(studentsName);
		
		//creating new students list and added the details
		List<String> studentsName2 = new ArrayList<>(studentsName);
		
		studentsName2.add("Survesh");
		studentsName2.add("Akilesh");
		studentsName2.add("Gugan");
		studentsName2.add("Ram");
		studentsName2.add("Prasath");
		
		studentsName2.removeAll(studentsName); //Wants to remove bulk elements of list use removeAll()
		System.out.println("Final List : "+studentsName2);
		
		
		studentsName2.clear(); //Use clear to empty the list
		System.out.println(studentsName2);

	}

}
