package selection;

import java.util.Random;

public class Selection {
	
	static Random rand = new Random();

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int[] randomArray = createRandomArray(10, 100);
			printArray(randomArray);
			minMax(randomArray);
		}
		
	}
	
	public static void minMax(int[] input) {
		int min = Integer.MAX_VALUE, max = -1, comparisons = 0;
		int i = 0;
		while (i < input.length) {
			//if current is last value of the array, wrap around and consider i+1 to equal 0
			int next = (i == input.length - 1) ? input[0]: input[i+1];
			
			if (input[i] > next) {
				comparisons++;
				if (input[i] > max) {
					max = input[i];
					
				}
				comparisons++;
				
				if (next < min) {
					min = next;
					
				}
				comparisons++;
				
			} else {
				comparisons++;
			}
			i = i + 2;
		}
		int maxComparisons = 3 * (input.length / 2);
		String output = ("Max: " + max + ", min: " + min + ", comparisons: " + comparisons + ", 3n/2=" + maxComparisons);
		System.out.println(output);
		
	}
	
	public static int[] createRandomArray(int size, int maxValue) {
		int[] randomArray = new int[size];
		for (int i=0; i < size; i++) {
			int randomNumber = getRandomNumber(maxValue, 1);
			randomArray[i] = randomNumber;
		}
		return randomArray;
	}
	
	public static int getRandomNumber(int max, int min) {
		return rand.nextInt(max) + 1;
	}
	
	public static void printArray(int[] array) {
		String output = "[ ";
		for (int i : array) {
			output += i + ", ";
		}
		output += " ]";
		System.out.println(output);
	}

}
