package selection;

import java.util.Random;

public class Selection {
	
	static Random rand = new Random();

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			int[] randomArray = createRandomArray(10, 100);
			printArray(randomArray);
			minMax(randomArray);
		}
	}
	
	public static void minMax(int[] input) {
		int min = input[0], max = input[0], comparisons = 0;
		for(int i = 1; i < input.length; i = i+2)
		{
			int next;
			if(i+1 < input.length)
			{
				next = input[i+1];
				if(input[i] < next)
				{
					comparisons++;
					if(input[i] < min)
					{
						comparisons++;
						min = input[i];
					}
					
					if(next > max)
					{
						comparisons++;
						max = next;
					}
				}
				
				else if(input[i] > next)
				{
					comparisons++;
					if(input[i] > max)
					{
						comparisons++;
						max = input[i];
					}
					
					if(next < min)
					{
						comparisons++;
						min = next;
					}
				}
				
				else
				{
					comparisons++;
					if(input[i] > max)
					{
						comparisons++;
						max = input[i];
					}
					
					else if(input[i] < min)
					{
						comparisons++;
						min = input[i];
					}
				}
			}
			
			else
			{
				comparisons++;
				if(input[i] < min)
				{
					comparisons++;
					min = input[i];
				}
					
				else if(input[i] > max)
				{
					comparisons++;
					max = input[i];
				}
			}			
		}
		double maxComparisons = 1.5 * input.length;
		String output = ("Max: " + max + ", min: " + min + ", comparisons: " + comparisons + ", 3n/2=" + maxComparisons);
		System.out.println(output + "\n");
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
