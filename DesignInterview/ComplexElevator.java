package DesignInterview;

import java.util.ArrayList;
import java.util.Scanner;

public class ComplexElevator {

	public static void main(String[] args) {
		ComplexElevator e = new ComplexElevator();
		e.askPassenger();
	}

	// Variables
	Scanner intel = new Scanner(System.in);
	ArrayList<Integer> listOfFloors;

	boolean isDoorOpen = false;

	final int maxP = 20;
	final int maxF = 20000000;
	final int minP = 1;
	final int minF = 1;

	int curF = 1;
	int desF = 0;
	int passFloor = 0;
	int numOfPass = 0;

	int[] destination_lists = new int[maxF];

	void askPassenger() {
		isDoorOpen = false;
		println("Elevator opening...");
		delay(500);
		isDoorOpen = true;
		print(curF + "F | How many passengers: ");
		numOfPass = intel.nextInt();
		if (numOfPass < minP || numOfPass > maxP) {
			println("Error. Valid number of passengers [1-20].");
			askPassenger();
		} else {
			listOfFloors = new ArrayList<>();
			for (int a = 0; a < numOfPass; a++) {
				int floor = askPassengerFloor(a);
				if (!listOfFloors.contains(floor))
					listOfFloors.add(floor);
			}
		}
		// for(int a: destination_lists) println("All destinations: "+ a);
		// for(int a = 0; a < listOfFloors.size(); a ++) {
		// println("Displaying unique destinations: " + listOfFloors.get(a));
		// }
		println("Elevator closing...");
		delay(500);
		isDoorOpen = false;
		initialize_elevator();
	}

	int askPassengerFloor(int id) {
		boolean isValidEntry = false;
		int floor = 0;
		while (!isValidEntry) {
			print("Passenger #" + (id + 1) + " enter your floor: ");
			floor = intel.nextInt();
			if (floor < minF || floor > maxF) {
				println("Error. You have entered out of range floor. Valid [1-20]");
			} else if (floor == curF) {
				println("You are already in the " + curF + "F.");
			} else {
				destination_lists[floor - 1]++;
				isValidEntry = true;
			}
		}
		return floor;
	}

	void initialize_elevator() {
		for (int a = 0; a < listOfFloors.size(); a++) {
			int shortest = findShortest();
			println("Next destination: " + shortest + "F Passenger amount (" + destination_lists[shortest - 1] + ")");
			delay(500);
			while (curF < shortest) {
				up();
			}
			while (curF > shortest) {
				down();
			}
			while (destination_lists[shortest - 1] > 0) {
				println("Unloading passenger (" + destination_lists[shortest - 1]-- + ") at " + curF + "F");
				delay(500);
			}
		}
		askPassenger();
	}

	void up() {
		println(curF++ + "F | Going up...");
	}

	void down() {
		println(curF-- + "F | Going down...");
	}

	void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
		}
	}

	void println(Object o) {
		System.out.println(o);
	}

	void print(Object o) {
		System.out.print(o);
	}

	int findShortest() {
		int shortest = Math.abs(curF - listOfFloors.get(0));
		int id = 0;
		for (int a = 1; a < listOfFloors.size(); a++) {
			if (shortest > Math.abs(curF - listOfFloors.get(a))) {
				shortest = Math.abs(curF - listOfFloors.get(a));
				id = a;
			}
		}
		shortest = listOfFloors.get(id);
		listOfFloors.set(id, 100);
		return shortest;

	}

}
