/**********************************************************************************
*MSUnit4Ch13.java
*Molina
*
*This program tracks investments for 2 person based on the input of an interest
rate. The initial balance is $2,000, and $4,000. The interest is added to the
balance and is output in table format.
***********************************************************************************/
import java.util.Scanner;

public class MSUnit4Ch13
{
	public static void main(String[] args)
	{
		MSUnit4Ch13Investor Investor1 = new MSUnit4Ch13Investor(1001, (double) 2000);
		//account number 1001 and initial balance of $2,000

		MSUnit4Ch13Investor Investor2 = new MSUnit4Ch13Investor(2001, (double) 4000);
		//account number 2001 and initial balance of $4,000

		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the APR in the form of .05 for 5%: ");
		double rate = scan.nextDouble(); //user input for interest rate

		Investor1.setRate(rate); //set interest rate
		Investor2.setRate(rate); //set interest rate

		System.out.println("Monthly balances for one year with "+ rate +" annual interest:\n");


		final String HEADING_FMT_STR = "%-7s%10s%10s%10s%10s\n";
		final String DATA_FMT_STR = "%5d%12d%10.2f%10d%10.2f\n";
		//format specifiers, way easier to make tables!

		System.out.printf(HEADING_FMT_STR, "Month", "Account #", "Balance", "Account#", "Balance"); //titles
		System.out.printf(HEADING_FMT_STR, "-----","---------", "-------", " -------", "-------");
		//titles

		for(int i = 1; i <= 15; i++) //for 15 months
		{
			if(i<=15) //up until 15 months, add interest each iteration
			{
				Investor1.addInterest();
				Investor2.addInterest();
			}

			System.out.printf(DATA_FMT_STR, i, Investor1.getNumber(), Investor1.getBalance(),
								Investor2.getNumber(), Investor2.getBalance());

		}

			System.out.printf("\n%18s%.2f%26s%.2f%1s\n", "Investor 1 earned : ",(Investor1.getBalance() - 2000),
									" interest in 15 months at ", rate*100, "%");

			System.out.printf("%18s%.2f%26s%.2f%1s\n", "Investor 2 earned : ",(Investor2.getBalance() - 4000),
									" interest in 15 months at ", rate*100, "%");

	} //end main
 } //end class
