package task_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		char temperatureType = input.charAt(input.length() - 1);
		int degrees = Integer.parseInt(input.substring(0, input.length() - 1));
		String output = "";
		if(temperatureType == 'C')
			output = itIsCelsius(degrees);
		else if(temperatureType == 'K')
			output = itIsKelvin(degrees);
		else 
			output = itIsFahrenheit(degrees);
		
		System.out.println(output);
		
	}

	private static String itIsCelsius(int C) {
		int K = C + 273;
		int F =  C * 9 / 5 + 32;
		return toJson("K", K, "F", F);
	};
	
	private static String itIsKelvin(int K) {
		int C = K - 273;
		int F = C * 9 / 5 + 32;
		return toJson("C", C, "F", F);
	};
	
	private static String itIsFahrenheit(int F) {
		int C = (F - 32) * 5 / 9;
		int K = C + 273;
		return toJson("C", C, "K", K);
	};
	
	private static String toJson (String type1, int temp1, String type2, int temp2) {
		return new String("{\"" + type1 + ": \"" + temp1 + "\", \"" + type2 + "\": \"" + temp2 + "\"}");
	}
	
}
