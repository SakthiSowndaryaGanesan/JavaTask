package Java8Features;

import java.util.function.Function;

class FunctionImpl implements Function<String ,Integer>{

	@Override
	public Integer apply(String s) {
		
		return s.length();
	}
}

public class FunctionDemo {

	public static void main(String[] args) {
		
/*	Function<String ,Integer> obj=new FunctionImpl();
	int len=	obj.apply("Sakthi.Ganesan");
	System.out.println(len);  */     //Tranditioanl method
	
		Function<String ,Integer> fun = (String s) -> s.length();
		System.out.println((fun.apply("Sakthi")));

}
}
