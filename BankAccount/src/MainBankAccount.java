
public class MainBankAccount
{

	public static void main(String[] args)
	{
		BankAccount balance = new BankAccount("Akira", 215498723);
		
		System.out.print(balance.deposit(10));
		System.out.println(balance);
	}
}
