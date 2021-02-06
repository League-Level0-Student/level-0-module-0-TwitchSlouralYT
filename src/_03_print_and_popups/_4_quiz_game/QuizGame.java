package _03_print_and_popups._4_quiz_game;

import javax.swing.JOptionPane;

public class QuizGame {
	public static void main(String[] args) {

		// Create a variable to hold the user's score. Set it equal to zero.
		int score = 0;
		// ASK A QUESTION AND CHECK THE ANSWER

		// 2. Ask the user a question
		String answer = JOptionPane.showInputDialog(null, "What is 7 x 7?");
		// 3. Use an if statement to check if their answer is correct
		if (answer.equals("49")) {
			score = score + 1;
			// 4. if the user's answer was correct, add one to their score
		}
		// MAKE MORE QUESTIONS. Ask more questions by repeating the above
		// Option: Subtract a point from their score for a wrong answer
		String question = JOptionPane.showInputDialog(null, "What is the largest continent?");
		if (question.equalsIgnoreCase("asia")) {
			score = score + 1;

		} else {
			score = score - 1;
		}
		// After all the questions have been asked, tell the user their final score
		String bruh = JOptionPane.showInputDialog(null, "What has 4 legs, but only one foot?");
		if (bruh.equalsIgnoreCase("bed")) {
			score = score + 1;
		} else
			score = score - 1;

		String colour = JOptionPane.showInputDialog(null, "What colour do you get if red and blue are mixed?");

		if (colour.equalsIgnoreCase("purple")) {
			score = score + 1;
		} else
			score = score - 1;

		String owo = JOptionPane.showInputDialog(null, "What is the notation for a derivative?");
		if (owo.equalsIgnoreCase("d/dx")) {
			score = score + 1;
		} else
			score = score - 1;
		JOptionPane.showMessageDialog(null, "Your score is "+score);
	}

}


























