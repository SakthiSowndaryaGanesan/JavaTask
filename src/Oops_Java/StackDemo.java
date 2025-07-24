package Oops_Java;
//Implementation only
public class StackDemo {

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
