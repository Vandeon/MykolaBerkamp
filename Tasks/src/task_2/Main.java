package task_2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of blocks:");
		int n = sc.nextInt();
		sc.close();

		solve(n, "slot_a", "slot_b", "slot_c");

	}

	public static void solve(int n, String startTruck, String auxiliary, String endTruck) {
		if (n == 1) {
			System.out.println("#" + n + " " + startTruck + " -> " + endTruck);
		} else {
			solve(n - 1, startTruck, endTruck, auxiliary);
			System.out.println("#" + n + " " + startTruck + " -> " + endTruck);
			solve(n - 1, auxiliary, startTruck, endTruck);
		}
	}

}
