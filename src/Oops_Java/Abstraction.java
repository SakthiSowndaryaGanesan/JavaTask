package Oops_Java;

// Abstract Parent Class
abstract class Car {
    public abstract void Drive();
    public abstract void Fly();

    public void playMusic() {
        System.out.println("Yes! You can play the music.");
    }
}

abstract class Bmw extends Car {
	
    public void Drive() {
        System.out.println("Yes! Driving...");
    }

	@Override
	public void Fly() {
System.out.println("Flying.........");		
	}
}

//Concrete Child Class - We can create an obj for this to access the abstrcat class
class updatedBmw extends Bmw {
	
	@Override
	public void Fly() {
System.out.println("Flying.........");		
	}

}

// Main Class
//We can't creat an obj for the abstract class.
//For the concrete class we can create a obj to access the abstract method.
public class Abstraction {
    public static void main(String[] args) {
        Car obj = new updatedBmw(); // Polymorphism
        obj.Drive();
        obj.playMusic();
        obj.Fly();
    }
}
