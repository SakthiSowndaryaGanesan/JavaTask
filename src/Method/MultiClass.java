package Method;

class Multi_Class { //Sub Class

	int x,y;
	
	public void add() {
		int a=12;
		int b=23;
		int c=a+b;
		System.out.println("Addition Answer is : " +c);
	}
	public void sub() { 
		int a=12;
		int b=23;
		int c=b-a;
		System.out.println("Sub Answer is : " +c);
	}
}

   public class MultiClass {  //Main Class , This will work down to top
		
   public void sample_function() {
	   
		System.out.println("This is sample function");
	
   }
	public static void main(String[] args) {
		
		Multi_Class mm=new Multi_Class();
		mm.add();
		mm.sub();
		System.out.println(mm.x);
		
		MultiClass ss = new MultiClass();
		ss.sample_function();
		
		}
   }