// Thomas Campbell, 8-18-2024, Chapter 1 Web Assist Assignment 1: Random number generator

import javax.swing.JOptionPane;

public class randomNumber {

	public static void main(String[] args) {
		System.out.println("Pick a random number between 1-10...");
		
		JOptionPane.showMessageDialog(null,"The number is "+
		(1 + (int)(Math.random() * 10)));
		
		System.out.println("...were you correct?");
	}

}
