/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Sept 2018
 * Created for: ICS4U
 * This program calculates the number of logs that will fit on a truck,
 *     if you know their length
 *
 ****************************************************************************/
import java.util.Scanner;

public class LogCompany {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		
		//Variables
		int truckCapacity;
		int regLog;
		double logWeight;
		double logNumber;
		double halfLog;
		double quarterLog;
		double logSize;
		
		truckCapacity = 1100;
		regLog = 1;
		halfLog = 0.5;
		quarterLog = 0.25;
		
		System.out.print("Enter log size (options: 0.25, 0.5, 1): "); 
		
		logSize = userInput.nextDouble();
		
		logWeight = logSize * 20;
		
		logNumber = truckCapacity/logWeight;
		
		System.out.print("The truck can carry " + logNumber + " logs of " + logSize + "m.");
		
	}

}
