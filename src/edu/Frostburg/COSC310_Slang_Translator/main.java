package edu.Frostburg.COSC310_Slang_Translator;
import java.util.*;

/**
 * 
 * @author aarondavis
 *
 */
public class main {

	public static void main(String[] args) {
		
		System.out.println("Please enter sentence below: ");
		
		String[] strArray = Translator.translate();
		Translator.print(strArray);
	}
}
