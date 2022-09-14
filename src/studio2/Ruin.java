package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.print("Start Amount: ");
		double startAmount = in.nextDouble();

		System.out.print("Win Chance: %");
		double winChance = in.nextDouble();
		double rWinChance = winChance/100;

		System.out.print("Win Limit: ");
		double winLimit = in.nextDouble();
		
		double resetAmount = startAmount;
		int loopCount = 0;
		int rLoopCount = loopCount;
		//loop
		
		System.out.println("Number of days played: ");
		int totalSimulations = in.nextInt();
		for (int i = 1; i <= totalSimulations; i++) 
		{startAmount = resetAmount;
		loopCount = rLoopCount; 
			while(startAmount > 0 && startAmount != winLimit) { 
				loopCount++;
			if (Math.random()<= rWinChance) {
				startAmount = startAmount + 1;
			}
			else { 
				startAmount = startAmount - 1;
			}

		}
		if (startAmount == 0) {
			System.out.println("Day " + i + " RUIN! " + loopCount);
		}
		
	    if (startAmount == winLimit) {
			System.out.println("Day " + i + " SUCCESS! " + loopCount);
		}
	    
	    	
	    
		}
	}


}

