package edu.Frostburg.COSC310_Slang_Translator;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author aarondavis
 *
 */
public class Translator {
	
	/**
	 * Method for translating into 90s slang
	 * 
	 * @return the array filled with the strings
	 */
	public static String[] translate(){
		
		Scanner scan = new Scanner(System.in);
		String[] input = scan.nextLine().split(" ");
				
		int n = 0;
		while(n < input.length){
				
			//Conditional for words 3 letter or less and not "for"
			if(input[n].length() <= 3 && (!input[n].equals("for") || !input[n].equals("fly"))){
				//Do nothing!
			}
			
			else{
				
				//Makes correct replacesments throughout array
				if(input[n].equals("cool") || input[n].equals("fun")){
					input[n] = "fly";
				}
						
				else if(input[n].equals("for")){
					input[n] = "fo";
				}
							
				else{
					
					//Keeps first consonant and replaces rest of word with "izzle"
					char change = input[n].charAt(0);
					input[n] = change + "izzle";
				}
			}
			
			n++;
		}
		return input;
	}
		
	/**
	 * Method prints the array, satisfies condition if more or less than ten words
	 * Also satisfies 50/50 condition of print "Yo" at beginning of sentence
	 * @param array
	 */
	public static void print(String[] array){
		
		Random ran = new Random();
		int ranNum = ran.nextInt(2);
		
		//Choices between 1 and 0
		if(ranNum == 1){
			System.out.print("Yo, ");
		}
		
		for(int i = 0; i < array.length; i++){
			
			if(i > 10){
				System.out.print("yadda ");
			}
			else{
				System.out.print(array[i] + " ");
			}
		}
	}
}
