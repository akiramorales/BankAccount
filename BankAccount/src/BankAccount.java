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
	
	
	public BankAccount(String name, int accNum)
	{
		name = name;
		accNum = accNum;
		balance = 0;
	}
	
	public BankAccount(String name, int accNum, double balance)
	{
		name = name;
		accNum = accNum;
		balance = balance;
	}
	
	
	public double deposit(double amount)
	{
		return balance + amount;
	}
	
	public double withdrawal(double amount)
	{
		return balance - amount;
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
