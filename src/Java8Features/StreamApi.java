package Java8Features;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(4,7,8,9,10,2,5,3,1,10,8,4,8,12,13,14,16,18);
		
		List<Integer> even = numbers.stream() //Depends upon the value we need according to that we need to use.
				
				.filter(n->n%2==0)
				.sorted()//Natural order.
				.sorted(Comparator.reverseOrder()) //By using comparator we can change the sorting.
				.distinct() //To remove duplicates
				//.limit(2) //First 2 elements will be printed.
			//	.skip(1) //First element will be skiped
		        
				.collect(Collectors.toList()); //Since we are using List to get a output so we need to use the collect to store the value.
   
		
		System.out.println(even);
		
		//Wants to print only - we can use forEach. Needs to store then use collect.
		
     //data.forEach(n -> System.out.println(n)); //Use the stream only one.
	//	data.forEach(n -> System.out.println(n)); //Stream has already operatoed. 

		
			 
	}

}
