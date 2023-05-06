import java.util.Random;
import java.util.Scanner;

public class Guess{
	public static void main(String[] args ) {
		// input system
		Scanner scan = new Scanner(System.in);
		
		// generating random numeber
		Random rand = new Random();
        int randomNumber = rand.nextInt(100)+1;
       
		// System.out.println("rand "+ randomNumber); uncomment this to display the random number and test the code
		
		// User input
		System.out.print("Enter your guess between 1- 100-");
        
		// this count the number of tries
        int tryCount = 0;
		
		// While loop so user can keep guessing
        while(true){
			int guessed = scan.nextInt();
			tryCount++;
		    if (guessed<randomNumber){
			System.out.println("Go Higher");
		}
        	else if (guessed>randomNumber){
			System.out.println("GO Lower");
		}
			else if (guessed==randomNumber){
			System.out.println("WON");
			System.out.println("It took you" + tryCount +"tries");
			break;
		}
		}
	scan.close();
	}
}
