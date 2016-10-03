
public class BankAccount {
	
	private double balance;
	private String name;

public BankAccount(double b, String n)
{
	balance=b;
	name=n;
}
public void deposit(double depositamount)
{
	balance +=depositamount;
}
public void withdraw(double withdrawalamount)
{
	balance-=withdrawalamount;
}
public double seebalance()
{
	
	return balance;
}
}
