/**
 * 
 * @author Akira Morales
 * Bank Account
 */
public class BankAccount
{

	private String name;
	private int accNum;
	private double balance;
	
	
	public BankAccount(String n, int aN)
	{
		name = n;
		accNum = aN;
		balance = 0;
	}
	
	public BankAccount(String n, int aN, double b)
	{
		name = n;
		accNum = aN;
		balance = b;
	}
	
	
	public void deposit(double amount)
	{
		balance += amount;
	}
	
	public void withdrawal(double amount)
	{
		balance -= amount;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public String toString()
	{
		return "Balance: " + balance;
	}
}
