package task_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter start chanse pls:");
		double inputChanse = sc.nextDouble();
		System.out.println("Enter your order (1 or 2):");
		int order = sc.nextInt();
		sc.close();
		
		double chanseFirst = inputChanse; 
		double chanseSecond = inputChanse; 
		
		double stepPrice = (1 - inputChanse) / 20;
		int step;
		int stepFirstPlayer = 0;
		int stepSecondPlayer = 0;
		for(step = 1; step <= 20; step++) {
			if(step % 2 == 1) {
				stepFirstPlayer++;
			} else {
				stepSecondPlayer++;
			}
			chanseFirst += stepPrice;
			chanseSecond += stepPrice;
			if(order == 1 && chanseFirst > 0.5 - stepPrice/2) {
				System.out.println("You should fire at " + stepFirstPlayer + "-th step.");
				break;
			}
			if(order == 2 && chanseSecond > 0.5 -stepPrice/2) {
				System.out.println("You should fire at " + stepSecondPlayer + "-th step.");
				break;
			}
		}
	}

}
