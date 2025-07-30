package Java8Features;

import java.util.function.Consumer;

//class ConsumerImp implements Consumer<String>{
//
//	@Override
//	public void accept(String input) {
//       System.out.println(input);		
//	}
//}

public class ConsumerDemo {
	public static void main(String[] args) {
		
//    Consumer<String> cx=new ConsumerImp();
//    cx.accept("Sakthi");
    
    
    
    Consumer<String> cx1= (String input)-> System.out.println(input);
    cx1.accept("Sakthi Ganesan");
		
	}

}
