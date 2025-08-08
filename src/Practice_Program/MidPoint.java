package Practice_Program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MidPoint {
	 String name;
	 int age;
	
	public MidPoint(String name, int age) {
		this.name = name;
		this.age = age;
	}


//	@Override
//	public String toString() {
//		return "MidPoint [name=" + name + ", age=" + age + "]";
//	}


	public static void main(String[] args) {
		
		List<MidPoint> stds=new ArrayList<>(Arrays.asList(
				new MidPoint("Sakthi",30),
				new MidPoint("Sundar",28),
				new MidPoint("Prabha",20),
				new MidPoint("Kavin",25)));
		
		System.out.println(stds);
		
		stds.stream()
        .sorted(Comparator.comparingInt((MidPoint e) -> e.age).reversed()) // fix here
        .limit(1)
        .forEach(e -> System.out.println(e.name + " - " + e.age)); // fix here
		
	
					
	/*	List <Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,7));
		
		int size=numbers.size();
		
		
		Optional<Integer> midvalue = numbers.stream()
				.sorted()
				.skip(size/2)
				.findFirst();
		
		System.out.println("Middle value : " + midvalue);     */

	}

}
