package DesignInterview;

import java.util.Scanner;

public class My_Elevator {

	public static void main(String[] args) {
		My_Elevator e = new My_Elevator();
		e.ask();
	}

	// variables
	Scanner sc = new Scanner(System.in);
	final long maxFloor = 1000000000;
	final long minFloor = 1;
	long curFloor = 1;
	long desFloor = 0;

	// functions
	void display(Object o) {
		System.out.println(o);
	}

	void ask(Object o) {
		System.out.print(o);
	}

	void delay(int ms) {
		try {
			Thread.sleep(ms);
		} catch (Exception e) {
		}
	}

	void goUp() {
		while (curFloor++ < desFloor) {
			display("going up... current floor: " + curFloor + " | DF: " + desFloor);
			delay(500);
		}
		curFloor--;
	}

	void goDown() {
		while (curFloor-- > desFloor) {
			display("going down... current floor: " + curFloor + " | DF: " + desFloor);
			delay(500);
		}
		curFloor++;
	}

	void ask() {
		ask("Current Floor: " + curFloor + " | Enter destination floor: ");
		desFloor = sc.nextLong();
		if (desFloor < minFloor || desFloor > maxFloor || desFloor == curFloor) {
			display("error. floor out of range or you're selected floor is curFloor.");
			ask();
		} else {
			display("door closing...");
			delay(500);
			if (desFloor < curFloor) {
				goDown();
			} else if (desFloor > curFloor) {
				goUp();
			}
		}
		display("Welcome to your floor door is opening...");
		ask();
	}

}
