package Practice_Program;

abstract class ATM{
	abstract void authendicateUser();
	abstract void withdrawMoney(); 
	
	void showMsg() {
		System.out.println("Welcome to ATM");
	}
	
}
class BankAtm extends ATM{

	@Override
	void authendicateUser() {
System.out.println("Authendicated the User by PIN.");		
	}

	@Override
	void withdrawMoney() {
System.out.println("Money successsully withdrawn.");		
	}
	
}

public class Apps {

	public static void main(String[] args) {

		ATM atm=new BankAtm();
		
		atm.showMsg();
		atm.authendicateUser();
		atm.withdrawMoney();
	}

}
