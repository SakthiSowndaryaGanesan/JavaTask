package Method;

class students
{
	int age; //global- if the global value has 
	
	public void getAge(int age) { //here the global value and the local parameter are the same. this key will helps to differ both.
		this.age=age;
		
	//	age=12; //This is local so this value can't be taken.
	}
	
	public void printAge() {
		this.getAge(23); // This will give the o/p as 23 coz in this method it is called.
		System.out.println("Print Age : "+ age);
	}
}


public class ThisKey {

	public static void main(String[] args) {
students st=new students();

st.getAge(14); //This won't be run coz already 23 parameter was given in this pointer.
st.printAge();
	
	}

}
