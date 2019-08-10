/**********************************************************************************
*MSUnit4Ch13Investor.java
*Molina
*
*This class implements an investor.
***********************************************************************************/

public class MSUnit4Ch13Investor
	{
		private static double interestRate; //class variable
		private final int ACCOUNT_NUMBER; //constant
		private double balance; //instance variable

//All variables should be declared private.


//********************************************************************************************
//Provide a class method that will be used to set the annual interest rate.
	public void setRate(double rate)
	{
		interestRate = rate;
	}

//********************************************************************************************
//Provide a two parameter constructor to initialize the constant account number and balance
	public MSUnit4Ch13Investor(int ACCOUNT_NUMBER, double balance)
	{
		this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
		this.balance = balance;
	}

//********************************************************************************************
//Provide an addInterest() method to update the balance based on the interestRate entered in the driver
	public void addInterest()
	{
		balance = balance + (balance*interestRate/12);
	}

//********************************************************************************************
	public int getNumber()
	{
		return ACCOUNT_NUMBER;
	}

//********************************************************************************************
	public double getBalance()
	{
		return balance;
	}

}//end Investor class
