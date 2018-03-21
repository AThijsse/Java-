package userinput;
import java.util.Scanner;

public class Player{
	int matches = 0;
	int computer;
	Nim c = new Nim();
	int score = c.count;
	
	
public void matches(int score) {	
	Scanner user_input = new Scanner ( System.in);

 		while (true) {
	 		if (user_input.hasNextInt()) {
	 			matches = user_input.nextInt();
	 			if (matches < 5) {
	 				if (matches <= score) {
	 				 	break;
	 				}
	 			}
	 		} else {
	 			user_input.next();
	 		}
	 		System.out.println("Invalid input. Please enter a valid number between 0 and 4");
	}
	
	 if (score <= 0) {
		user_input.close();	
	}
 		
	
}

public void computer(int score) {
	
	
		if (score > 6) {
 		computer = score - 6;
 		} else if (score < 6 && score > 1) {
 		computer =  score - 1;
 		} else { computer = 1; }
	
}

}

