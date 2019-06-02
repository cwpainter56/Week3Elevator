import java.util.Scanner;

public class Elevator {
	static Scanner select = new Scanner(System.in);
	static int position = 0, choice;

	public static void main(String args[]) {
		do {
			System.out.println("The elevator is now on floor " + 'B');
			System.out.print("Which floor are you at now (B-2 (0=Basement)): ");
			choice = select.nextInt();

			if (choice > 2) {
				System.out.println("Invalid entry, building only has three levels");
			}
		} while (choice > 2);

		if (position == choice && choice < 3) {
			System.out.println("Elevator door opening...");
		}

		if (position > choice && choice < 3) {
			goDown();
		}

		if (position < choice && choice < 3) {
			goUp();
		}

		System.out.println("To which floor do you want to go (B-2 (0=Basement))?");
		choice = select.nextInt();

		if (position > choice) {
			goDown();
		}

		if (position < choice) {
			goUp();
		}

		if (position == choice) {
			System.out.println("You have arrived.");
		}
		if (choice > 2) {
			do {
				System.out.println("Invalid entry, building only has three levels");
				System.out.println("You are now on floor " + position);
				System.out.print(" To which floor do you want to go (B-2 (0=Basement))? ");
				choice = select.nextInt();
				if (position > choice) {
					goDown();
				}

				if (position < choice) {
					goUp();
				}

				if (position == choice) {
					System.out.println("You have arrived.");
				}

			} while (choice > 2);
		}
	}

	public static void goUp() {

		if (choice >= position && choice < 3) {
			System.out.println("Elevator door closing...");
			System.out.println("The elevator going up...");
			do {

				position++;
				System.out.println("The elevator is now at level: " + position);
			} while (position < choice);
			;
			System.out.println("Elevator door opening...");
		}
	}

	public static void goDown() {
		if (choice <= position && choice < 3) {
			System.out.println("Elevator door closing...");
			System.out.println("The elevator is going down...");
			do {
				position--;
				System.out.println("The elevator in now at level: " + position);
			} while (position > choice);

			System.out.println("Elevator door opening...");
		}
	}
}

