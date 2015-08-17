import java.util.Scanner;

public class DotComApp {
	int mHit = 0;
	int mMiss = 0;
	int guessCount = 0;
	boolean winGame = false;
	String [][] mBoard = new String [7][7];
	
	public void promptForGuess(){
		System.out.println ("Welcome to the Sink the Dot.Coms game!"
			+ "\n"+"You will be prompted to make a guess based off "
			+ "\ncoordinates from a 7 x 7 grid (ex. A1 to A6 all the way to F1 to F6"
			+ "\n\n"+"Each time you pick a coordinate where a Dot.Com is, you will execute an attack or a 'hit'"
			+ "\n"+"When you get three hits on one Dot.Com, it sinks. If you get "
			+ "\n"+"three hits on the three Dot.Coms, you win the game!"
			+ "\n"
			+ "\n"+"Please make a guess (ex. B2):");
	
	mBoard[1][1] = "A1"; //I wanted to make each array element equal to the strings in quotes but I had a hard time referencing them afterwards.
	mBoard[1][2] = "A2";
	mBoard[1][3] = "A3";
	mBoard[3][4] = "C4";
	mBoard[4][4] = "D4";
	mBoard[5][4] = "E4";
	mBoard[6][4] = "F4";
	mBoard[6][5] = "F5";
	mBoard[6][6] = "F6";
	}
	
	public void compareGuess (){
		Scanner yourGuess = new Scanner (System.in);
		do{
			String guess1 = yourGuess.next();
		
			switch (guess1) {
			case "A1": 
				if (guess1.equals(mBoard[1][1])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[1][1] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			case "A2": 
				if (guess1.equals(mBoard[1][2])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[1][2] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			case "A3": 
				if (guess1.equals(mBoard[1][3])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[1][3] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			case "C4": 
				if (guess1.equals(mBoard[3][4])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[3][4] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			case "D4": 
				if (guess1.equals(mBoard[4][4])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[4][4] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			case "E4": 
				if (guess1.equals(mBoard[5][4])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[5][4] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			case "F4": 
				if (guess1.equals(mBoard[6][4])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[6][4] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;	
			
			case "F5": 
				if (guess1.equals(mBoard[6][5])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[6][5] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			case "F6": 
				if (guess1.equals(mBoard[6][6])){
					System.out.println ("Wow! Your guess was correct! Please guess again.");
					mHit++;		
					guessCount++;
					mBoard[6][6] = "Z";
					guess1=yourGuess.nextLine();
					}
			break;
			
			default:
				System.out.println ("Aw shucks! Your guess was incorrect. Try again!");
				mMiss++;
				guessCount++;
				guess1=yourGuess.nextLine();
			}
		}

		while (mHit<3); 
	} 
	
	public void winGame(){
		boolean askMe = true;
		boolean pets = true;
		boolean go2 = true;
		
		if (mBoard[6][4]=="Z" && mBoard[6][5]=="Z" && mBoard[6][6] == "Z"){
			System.out.println ("Congratulations! You just sunk AskMe.com!");
			mBoard[6][4]="F";
			mBoard[6][5]="F"; 
			mBoard[6][6] = "F";
			}
		
		if (mBoard[1][1] =="Z"&& mBoard[1][2]=="Z" && mBoard[1][3] == "Z"){
			System.out.println ("Congratulations! You just sunk Pets.com!");
			mBoard[1][1]="F";
			mBoard[1][2]="F"; 
			mBoard[1][3] = "F";
			}
		
		if (mBoard[3][4] =="Z"&& mBoard[4][4]=="Z" && mBoard[5][4] == "Z"){
			System.out.println ("Congratulations! You just sunk Go2.com!");
			mBoard[3][4]="F";
			mBoard[4][4]="F"; 
			mBoard[5][4] = "F";
			}
		
		if (mBoard[6][4]=="F" && mBoard[6][5]=="F" && mBoard[6][6] == "F" &&
				mBoard[1][1] =="F"&& mBoard[1][2]=="F" && mBoard[1][3] == "F" &&
				mBoard[3][4] =="F"&& mBoard[4][4]=="F" && mBoard[5][4] == "F") {
			System.out.println ("You've sunk all of the dot.coms - congratulations!"
				+" It took you " + guessCount +" guesses to beat the game.");
			winGame = true;
			
			if (guessCount < 15){
				System.out.println("\nRating: Cruiser - you must've known the coordinates in advance :-)");
			}
			else if (guessCount <= 15 || guessCount > 30){
				System.out.println("\nRating: Motor boat - it took you a while, but you got it");
			}
			
			else if (guessCount >= 30){
				System.out.println("\nRating: Sailboat - daaang. It took you forever, but at least you made it :-)");
			}
		}
	}
		
	public static void main(String[] args) {
		DotComApp game = new DotComApp();
		game.promptForGuess();
		do{
			game.compareGuess();
			game.winGame();
		}while (!game.winGame);
		
		}
	}