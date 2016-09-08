
package lab1;

import java.util.Scanner;

public class ritementcalculator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double YearsToWork, AnnualReturnBeforeWork, YearsRetired, AnnualReturnAfterWork;
		double RequiredIncome, MonthlySSI;
	
	System.out.println("How many years are you planning to work? ");
	YearsToWork = input.nextDouble();
	
	System.out.println("What is your annual return before work? ");
	AnnualReturnBeforeWork = input.nextDouble();
	while (AnnualReturnBeforeWork<0 || AnnualReturnBeforeWork>20){
			System.out.println("Please enter value between 0 and 20");
				AnnualReturnBeforeWork = input.nextDouble();}

	System.out.println("How many years are you planning to retire? ");
	YearsRetired = input.nextDouble();
	
	System.out.println("What is your annual return after work? ");
	AnnualReturnAfterWork = input.nextDouble();
	while (AnnualReturnAfterWork<0 || AnnualReturnAfterWork>3) {
	System.out.println("Please enter value between 0 and 3 ");
		AnnualReturnAfterWork = input.nextDouble();}
	
	System.out.println("What is your required income? ");
	RequiredIncome = input.nextDouble();
	
	System.out.println("What is your Monthly SSI? ");
	MonthlySSI = input.nextDouble();
	
	double YouNeedSaved; 
	YouNeedSaved = (RequiredIncome - MonthlySSI)*(1- (1/ Math.pow(1+(AnnualReturnAfterWork / 1200), YearsRetired*12)))/(AnnualReturnAfterWork/1200);
	System.out.println("The amount you need saved is: " + YouNeedSaved); 
	
	double SaveEachMonth = (AnnualReturnBeforeWork/1200 * YouNeedSaved)/(-1+ Math.pow((1+(AnnualReturnBeforeWork/1200)), (YearsToWork*12)));
	System.out.println("The amount you save each month is:  " + SaveEachMonth);	
	}
}
