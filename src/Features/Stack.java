package Features;

//Working structure of Stuck

public class Stack {
	
	int s[]=new int [10];
	int tos ;
	
	Stack() {
		tos = -1;
	}
	void push(int item){
		
		if(tos==9) {
			System.out.println("Stack is Full");
		}
		else {
		
		s[++tos]=item;
		}
	
	}
	
	int pop() {
		if(tos>=0) {
		
		return s[tos--];
		}
		else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
		
//Implementation here
	public static void main(String[] args) {

		
		Stack s1=new Stack();
	      
	      s1.push(5);
	      s1.push(6);
	      s1.push(8);
	      
	      System.out.println(s1.pop());
	      
	      
	      Stack s2=new Stack();
	      s2.push(11);
	      s2.push(22);
	      s2.push(33);
	      s2.push(44);
	      s2.push(55);
	      
	      System.out.println(s2.pop());
		
		
	}

}
