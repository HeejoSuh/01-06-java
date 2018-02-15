/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Feb 2018
 * Created for: learning
 * 
 * Program that has a procedure called public static void RollDie(int maxValue) 
 Which will randomly generate a value between 1 and maxValue and then place the value in the console.
 *     
 *
 ****************************************************************************/



//have to import the following:
import java.util.Scanner;
import java.util.Random;

//****************************************************************************
public class DiceRoll {

	public static void RollDie(int maxValue) {
    	//Roll dice

    	Random rand = new Random();
    	int diceNumber= rand.nextInt(6) + 1;
    	//6 is the maximum and the 1 is the minimum 
    	System.out.println(diceNumber);
    	
    }//closing for RollDie
	
    public static void main(String[] args) {
    	//Roll the dice given the number of sides
    	
    	//set up a scanner to get the response from the user
    	Scanner scanner = new Scanner(System.in);
    	
    	//set variables to a default	
    	String input = null;
    	int inputNumber = 0;
    	
       	//----------------------------------------------------------------
        //while appropriate response has not been collected
       //use while-true functions to break out of
    	while (true) {
    		//keep asking for input
    		System.out.println("Input a number: ");
		
    		//Get input as a string value-----
    		input = scanner.nextLine();
    		//check if number
    		try {
       			//check if response if a number
    			inputNumber = Integer.parseInt(input);//Convert string to integer
       			RollDie(inputNumber);
       			break;
       		} catch (NumberFormatException stringInput) {
       			//if not number then
       			System.out.println("Try again with an integer!");
       		}
    	}//closing for while
    	
	    		
    			
    
    }//closing for main
}//closing for public class DiceRoll
