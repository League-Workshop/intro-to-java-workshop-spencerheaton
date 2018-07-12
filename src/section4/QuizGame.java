package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
		String answer = JOptionPane.showInputDialog("What is the center peak or dip in a parabola called?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer.equalsIgnoreCase ("the vertex")) {
		score++;
		// 4.  if the user's answer is correct
		}
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog("What is the cause of a black hole's unlimited gravity");
		
		if(answer2.equalsIgnoreCase ("the singularity")) {
		score++;
		}
		
		String answer3 = JOptionPane.showInputDialog("what tense is this in? : Juan jugaras videojuegos este semana. (answer in english)");
		// 6.  After all the questions have been asked, print the user's score 
		if(answer3.equalsIgnoreCase ("the future tense")) {
			score++;
			}
	JOptionPane.showMessageDialog(null, "your score is..."+ score +"/3");
	}
}
