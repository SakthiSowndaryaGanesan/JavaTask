package Practice_Program;

class Book{

String name;
int price;
int quantity;

 Book(String name){
this.name=name;
System.out.println("This book name is : " + name);

}
 Book(int price,int quantity){
this.price=price;
this.quantity=quantity;
double total = price*quantity;

System.out.println("The total value is : "+total);
}

public static void main (String args[]){

Book bk=new Book("Java Book");
Book bk1=new Book(300,3);

}
}