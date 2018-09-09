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

public class Logs {
	public static void main(String args[]) {
		Scanner UserInput = new Scanner(System.in);
		
		//Variables
		int TruckCapacity;
		int RegLog;
		double LogWeight;
		double LogNumber;
		double HalfLog;
		double QuarterLog;
		double LogSize;
		
		TruckCapacity = 1100;
		RegLog = 1;
		HalfLog = 0.5;
		QuarterLog = 0.25;
		
		System.out.print("Enter log size (options: 0.25, 0.5, 1): "); 
		
		LogSize = UserInput.nextDouble();
		
		LogWeight = LogSize * 20;
		
		LogNumber = TruckCapacity/LogWeight;
		
		System.out.print("The truck can carry " + LogNumber + " logs of " + LogSize + "m.");
		
	}

}