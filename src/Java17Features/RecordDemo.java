package Java17Features;


 record Person (String name , int age) {}

public class RecordDemo {

	public static void main(String args []) {
		
		Person p1 = new Person("Sakthi" , 23);
		Person p2= new Person("Kavya" , 23);
		Person p3 = new Person("Prabha" , 23);
		Person p4 = new Person("Sundar" , 23);
		Person p5 = new Person("Sudhan" , 23);
		
		System.out.println(p1.age());
		System.out.println(p1.name());

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);


	}
}
