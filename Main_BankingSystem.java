import java.util.Scanner;


class InsufficientFundsException extends Exception 
{
    public InsufficientFundsException(String msg) 
	{
        super(msg);
	}
}


class InvalidAccountNumberException extends Exception 
{
    public InvalidAccountNumberException(String msg) 
	{
        super(msg);
	}
}


class BankAcc
 
{
	private int acc_number;
	private double balance;

	public BankAcc(int acc_number, double initialBalance) 
	{
        	this.acc_number = acc_number;
        	this.balance = initialBalance;
	}
	

	
	public void deposit(double b) 
	{
 		balance= balance+b ;
 		System.out.println("Amount deposited: " +b);
 	}



	public void withdraw(double amount) throws InsufficientFundsException 
	{
        if (amount > balance) 
	{
            throw new InsufficientFundsException("Insufficient funds. Cannot withdraw $" + amount);
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount);
        System.out.println("Current Balance: $" + balance);
    	}


	withdraw(amount);
        System.out.println("Transaction in progress...");
    	}

    
    private boolean tran_auth) {
        
        return true;
    }

    
    private boolean Valid_acc() {
        
        return true;
    }
}
    
	public void performTransaction(double amount) throws InvalidAccountNumberException, InsufficientFundsException {
        
        if (tran_acc()!=="true") {
            throw new InsufficientFundsException("Unauthorized transaction. Cannot withdraw $" + amount);
        }

        
        if (Valid_acc()!=="true") {
            throw new InvalidAccountNumberException("Invalid account number: " + accountNumber);
        }

        
        


public class BankingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	try {
		System.out.print("Enter your account number: ");
            	String accountNumber = scanner.nextLine();

            
            	double initialBalance = 1000.0;

            	BankAccount account = new BankAccount(accountNumber, initialBalance);

            	System.out.print("Enter the amount to withdraw: $");
            	double amount = scanner.nextDouble();

            	account.performTransaction(amount);
		} 
		
		catch (InvalidAccountNumberException e) 
		{
            	System.out.println("Exception: " + e.getMessage());
            
        	}
		catch (InvalidAccountNumberException a)
		{
		System.out.println("Exception: " +a.getMessage());
		}
    }
}
