package task_4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int route[] = roll();
		System.out.println("Input:\n" + Arrays.toString(route));

		int coins[] = new int[10];
		for (int i = 0; i < coins.length; i++)
			coins[i] = i + 1;

		int output[] = new int[10];
		for (int i = 0; i < output.length; i++) {
			int temp = findCoin(route[i], coins);
			int attempt = 0;
			while (temp == 0) {
				attempt++;
				temp = findCoin(route[i] + attempt, coins);
				if (route[i] + attempt > 10)
					break;
			}
			attempt = 0;
			while (temp == 0) {
				attempt++;
				temp = findCoin(route[i] - attempt, coins);
			}
			output[i] = temp;
		}

		System.out.println("Output:\n" + Arrays.toString(output));

	}

	// initialize array of random (1-10) integers with sum > 55
	private static int[] roll() {
		int sum = 0;
		int arr[] = new int[10];
		for (int i = 0; i < arr.length; i++) {
			int num = (int) Math.rint(Math.random() * 10);
			sum += num;
			arr[i] = num;
		}
		if (sum <= 55)
			return roll();
		return arr;
	}

	private static int findCoin(int nominal, int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == nominal) {
				int coin = arr[i];
				arr[i] = 0;
				return coin;
			}
		}
		return 0;
	}
}
