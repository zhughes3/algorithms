package encoding;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Huffman {

	private static Scanner bR;

	public static void main(String[] args) throws IOException {
		bR = new Scanner(new InputStreamReader(System.in));
		System.out.print("Enter Any Text: ");
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char character;
		int totalCount = 0;
		while (bR.hasNextLine()) {
			
		
		String output = bR.nextLine();
		output = output.toLowerCase();

		int length = output.length();
		
	

		// we'll store each encountered character in this map, along with a
		// count of the number
		// of times encountered.
		

		// Loop over the output once, character by character
		for (int i = 0; i < length; i++) {
			character = output.charAt(i);
			totalCount++; // This is the total number of characters we've found
							// in the output

			Integer countForCharacter = 0;
			// check in map if we have a count for this character
			if (map.containsKey(character)) {
				// get the current count we have for this character
				countForCharacter = map.get(character);
				// increment
				countForCharacter++;
				// increment the count
			} else {
				countForCharacter = 1;
			}

			// Now put the up to date count into the map
			map.put(character, countForCharacter);
		}//end for

	
		}
		// Get the found characters as an array of Character
		Character[] charactersFound = map.keySet().toArray(new Character[0]);

		System.out.println("Letters\tFrequency\tCount");
		for (int k = 0; k < charactersFound.length; k++) {
			character = charactersFound[k];
			System.out.println(character + "\t" +
			// Following line gets the count for the character and divides by
			// totalCount,
			// making sure that the the result is a floating point
					(map.get(character) / ((float) totalCount)) + "\t" +
					// get the count for the character
					map.get(character));
		}

	}

}
