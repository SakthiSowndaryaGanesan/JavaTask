package ListCollections;

import java.util.LinkedList;

//add() , add(4) ,element(),
//get(),getFirst(),getLast(),
//addFirst(),addLast() - Comes under dequeue interface.

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> stdName=new LinkedList<>();
		
		stdName.add("Sakthi");
		stdName.add("Sowndarya");
		stdName.add("Veera");
		stdName.add("Ganesh");
		System.out.println(stdName);
		
		//Added the elements to the middle.
		stdName.add(2, null); //Null accepted
		stdName.add(0, "Mercy"); //Adding the element to the index.
		System.out.println(stdName);
		
		//Adding an element at the beginning of the linkedlist - it's in the dequeue interface
		stdName.addFirst("Panda");
		stdName.addFirst(null);
		System.out.println(stdName);
		
		//Adding e=an element at the end
		stdName.addLast("Krish");
		stdName.addLast("Veni");
		System.out.println(stdName);
		
		//Retrieve the details
		System.out.println(stdName.getFirst()); 		//Getting first element
		System.out.println(stdName.get(2));      //Getting indexed element
		System.out.println(stdName.getLast());   //Getting last element
		
		//Using for each method to print all the elements
		for (String str : stdName) {
			//System.out.println(str);
		}
		
		//Remove the elements
		String el=stdName.removeFirst(); //First element removed
		System.out.print("First Element :"+el);
		System.out.println(stdName);

		stdName.removeLast(); //Last element removed
		System.out.println(stdName);
		
		stdName.remove(null);
		stdName.remove("Panda");
		stdName.remove(2);
		System.out.println(stdName);
		
		stdName.clear();
		System.out.println(stdName);
	}

}