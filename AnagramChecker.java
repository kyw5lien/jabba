/**
 * 
 */
// package randomPackage;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author kyw5lien
 *	Checks if two word/strings are Anagrams.
 */
public class AnagramChecker {

	/**
	 * 	Attributes / Fields Declaration.
	 */
	private String firstString, secondString;
	private Boolean anagramCheck;
	
	/*
	 * 	Default Constructor.
	 */
	AnagramChecker() {
		this.firstString = null;
		this. secondString = null;
		this.anagramCheck = null;
	}
	
	/*
	 * 	Getter(s).
	 */
	public String getFirstCharArray() {
		return this.firstString;
	}
	
	public String getSecondString() {
		return this. secondString;
	}
	
	private Boolean getAnagramCheck() {
		return this.anagramCheck;
	}
	
	/*
	 * 	Setter(s).
	 */
	public void setFirstCharArray(String firstString) {
		this.firstString = firstString;
	}

	public void setSecondCharArray(String secondSstring) {
		this. secondString = secondSstring;
	}
	
	private void setAnagramCheck(Boolean anagramCheck) {
		this.anagramCheck = anagramCheck;
	}
	
	/*
	 * 	Method(s).
	 */
	public Boolean isAnagram() {
		char [] firstWord = getFirstCharArray().replaceAll("[\\s]", " ").toCharArray();
		char [] secondWord = getSecondString().replaceAll("[\\s]", " ").toCharArray();
		
		Arrays.sort(firstWord);
		Arrays.sort(secondWord);
		
		setAnagramCheck(Arrays.equals(firstWord, secondWord));
		
		return getAnagramCheck();
	}
	
	/**
	 * Main function: example of usage.
	 * @param args
	 */
	public static void main(String[] args) {
		AnagramChecker anagramChecker = new AnagramChecker();
		
		System.out.println(anagramChecker.getClass().getSimpleName());
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("\nEnter a first string:");
		anagramChecker.setFirstCharArray(scanner.nextLine());
		
		System.out.println("\nEnter another string:");
		anagramChecker.setSecondCharArray(scanner.nextLine());
		
		if(anagramChecker.isAnagram() == Boolean.TRUE)
			System.out.println("\n" +anagramChecker.getFirstCharArray()
					+" and " +anagramChecker.getSecondString()
					+" are Anagrams.");
		else
			System.out.println("\nThe Strings provided are not Anagrams.");
	}

}