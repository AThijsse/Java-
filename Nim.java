package userinput;
import java.util.Scanner;


public class Nim{
Player p1;
Player p2;
Player p3;
int gameChoice;
int count = 11;


public void game() { 
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();
	int matchesp1;
	int matchesp2;
	int matchesp3;
	int round = 1;
	
	
	

		System.out.println("Do you want to play a one (press 1) or a two (press 2) player game?");
		Scanner user_input = new Scanner ( System.in);
		gameChoice = user_input.nextInt();

		
switch (gameChoice) {

		
case 1:		while (count > 1) {
	
			System.out.println("");
			System.out.println("There are "+ count +" matches");
			System.out.print("How many matches does Player one want to take?");
			p1.matches(count);
			matchesp1 = p1.matches;
			System.out.print(matchesp1);
			count = count - matchesp1; 
			round++;
	
			
			System.out.println("");
			System.out.println("There are "+ count +" matches");
			p3.computer(count);
			matchesp3 = p3.computer;
			System.out.println("The computer takes "+ matchesp3+" matches");
			count = count - matchesp3;
			round++;     
			        }
		
		

		
		if (count == 1 && round % 2 == 0) {
			System.out.println("");
			System.out.println("There is "+ count +" match");
			System.out.print("How many matches does Player two want to take?");
			p3.computer(count);
			matchesp3 = p3.computer;
			System.out.println(matchesp3);
			count = count - matchesp3;
			System.out.println("Player two took the last match.");
			System.out.println("Player two lost!");
			
				
		}
		else if (count == 1 && round % 2 != 0) {
			System.out.println("");
			System.out.println("There is "+ count +" match");
			System.out.print("How many matches does Player one want to take?");
			p1.matches(count);
			matchesp1 = p1.matches;
			System.out.println(matchesp1);
			count = count - matchesp1;
			System.out.println("Player one took the last match.");
			System.out.println("Player one lost!");
				} else {  break;}
		 
	

case 2:		while (count > 1) {
	
	System.out.println("");
	System.out.println("There are "+ count +" matches");
	System.out.print("How many matches does Player one want to take?");
	p1.matches(count);
	matchesp1 = p1.matches;
	System.out.print(matchesp1);
	count = count - matchesp1; 
	round++;

	
	System.out.println("");
	System.out.println("There are "+ count +" matches");
    System.out.print("How many matches does Player two want to take?");
	p2.matches(count);
	matchesp2 = p2.matches;
	System.out.print(matchesp2);
	count = count - matchesp2;
	round++; 
	        }




if (count == 1 && round % 2 == 0) {
	System.out.println("");
	System.out.println("There is "+ count +" match");
	System.out.print("How many matches does Player two want to take?");
	p2.matches(count);
	matchesp2 = p2.matches;
	System.out.println(matchesp2);
	count = count - matchesp2;
	System.out.println("Player two took the last match.");
	System.out.println("Player two lost!");
	
		
}
else if (count == 1 && round % 2 != 0) {
	System.out.println("");
	System.out.println("There is "+ count +" match");
	System.out.print("How many matches does Player one want to take?");
	p1.matches(count);
	matchesp1 = p1.matches;
	System.out.println(matchesp1);
	count = count - matchesp1;
	System.out.println("Player one took the last match.");
	System.out.println("Player one lost!");
		} else {  break;}
}
	
	
if (count <= 0) {
user_input.close();
		
	}
}
	
	}

 	
