
public class Tester {

	public static void main(String[] args) {
		BankAccount myAccount=new BankAccount(1000.0,"Adrian Kley");
		myAccount.deposit(505.22);
		System.out.println("$ "+ myAccount.seebalance());
		myAccount.withdraw(100);
		System.out.println("$ "+ myAccount.seebalance());

	}

}
