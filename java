1. Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
Solution: 

public class Main
{
public static void shuffle(int nums[])
	{
		for (int i = nums.length - 1; i >= 1; i--)
		{
			Random rand = new Random();

			int j = rand.nextInt(i + 1);
      	int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		
		}
	}
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6 };
        System.out.println("Original Array: "+Arrays.toString(nums));
		shuffle(nums);
		System.out.println("Shuffle Array: "+Arrays.toString(nums));
	}
}

############################################################################################
2.Enter a Roman Number as input and convert it to an integer. (Example: IX = 9)
Solution:
public class Main
{
      public static int romanToInt(String s) {
        // Create a mapping of Roman numeral characters to their integer values
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;

        // Iterate through the Roman numeral characters from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

            // If the current value is less than the previous value, subtract it
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                // Otherwise, add it to the result
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        return result;
    }
    
	public static void main(String[] args) {
	  String romanNumeral = "IX";
     Scanner scanner = new Scanner(System.in);
      System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int result = romanToInt(romanNumeral);
        System.out.println("The integer value of " + romanNumeral + " is: " + result);
	}
}
############################################################################################################
3.Check if the input is pangram or not
 Solution:
public class Main
{
    public static boolean isPangram(String input) {
        String lowercaseInput = input.toLowerCase();
        boolean[] isLetterPresent = new boolean[26];

        for (char c : lowercaseInput.toCharArray()) {
            if (Character.isLetter(c)) {
                isLetterPresent[c - 'a'] = true;
            }
        }

        for (boolean isPresent : isLetterPresent) {
            if (!isPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }

    
	public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
else {
            System.out.println("The input is not a pangram.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
	}        } 
}
