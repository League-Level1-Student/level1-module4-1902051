package _07_fortune_teller;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.util.Random;

import javax.swing.JOptionPane;

import _06_book_of_illusions.BookOfIllusions;

public class Magic8Ball {
	public static void main(String[] args) {

		// 1. Make a main method that includes all the steps below….

		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int rand = new Random().nextInt(4);

		// 3. Print out this variable
		System.out.println("Random");
		// 4. Get the user to enter a question for the 8 ball
		JOptionPane.showInputDialog(
				"Enter a question and it will be answered by the great mind reading future seeker multi-brian Milan");
// 5. If the random number is 0
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "YAAAAS");

		}
		// -- tell the user "Yes"

		// 6. If the random number is 1
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "NOOOOOOOOO");
		}
		// -- tell the user "No"

		// 7. If the random number is 2
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "ASK THE GOOOOGLE");
		}
		// -- tell the user "Maybe you should ask Google?"

		// 8. If the random number is 3
		if (rand == 3) {
			JOptionPane.showMessageDialog(null, "");
		}
	}
}
// -- write your own answer
