//CISC 181 Lab 1
//Diep Nguyen, Quinn Wexler, Tobias Mazal 

package lab1;

import java.util.Scanner;

public class ritementcalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double YearsToWork, AnnualReturnBeforeWork, YearsRetired, AnnualReturnAfterWork;
		double RequiredIncome, MonthlySSI;  // define variables as doubles
	
	System.out.println("How many years are you planning to work? ");  // prompts users for years planning to work
	YearsToWork = input.nextDouble(); // user input set to variable
	
	System.out.println("What is your annual return (%) before work? "); 
	AnnualReturnBeforeWork = input.nextDouble();
	while (AnnualReturnBeforeWork<0 || AnnualReturnBeforeWork>20){   // keeps values within required range w/ while loop
			System.out.println("Please enter value between 0 and 20");
				AnnualReturnBeforeWork = input.nextDouble();}

	System.out.println("How many years are you planning to be retired? ");
	YearsRetired = input.nextDouble();
	
	System.out.println("What is your annual return (%) after work? ");
	AnnualReturnAfterWork = input.nextDouble();
	while (AnnualReturnAfterWork<0 || AnnualReturnAfterWork>3) {    // values kept within range 0-3%
	System.out.println("Please enter value between 0 and 3 ");
		AnnualReturnAfterWork = input.nextDouble();}
	
	System.out.println("What is your required monthly income? ");
	RequiredIncome = input.nextDouble();
	
	System.out.println("What is your Monthly SSI? ");
	MonthlySSI = input.nextDouble();
	
	double YouNeedSaved;
	YouNeedSaved = (RequiredIncome - MonthlySSI)*(1- (1/ Math.pow(1+(AnnualReturnAfterWork / 1200), YearsRetired*12)))/(AnnualReturnAfterWork/1200);  // formula for money needed to save for retirement
	YouNeedSaved = YouNeedSaved*100; // multiply by 100 in order to round to 2 decimal places
	YouNeedSaved = Math.round(YouNeedSaved); // rounds (value needed to be saved*100)
	YouNeedSaved = YouNeedSaved/100; // divides by 100 to complete the rounding
	System.out.println("The total amount you need saved is: $" + YouNeedSaved); 
	
	double SaveEachMonth = (AnnualReturnBeforeWork/1200 * YouNeedSaved)/(-1+ Math.pow((1+(AnnualReturnBeforeWork/1200)), (YearsToWork*12)));
	SaveEachMonth = SaveEachMonth*100;
	SaveEachMonth = Math.round(SaveEachMonth); // rounds to 2 decimal places
	SaveEachMonth = SaveEachMonth/100;
	System.out.println("The amount you to save each month is: $" + SaveEachMonth);	
	}
}
