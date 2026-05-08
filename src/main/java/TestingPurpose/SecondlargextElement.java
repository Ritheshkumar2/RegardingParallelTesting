package TestingPurpose;

import org.testng.annotations.Test;

public class SecondlargextElement {

	@Test
	public void test() {
		
		int[] numbers = {10, 20, 5, 30, 25, 30};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            }else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest number found.");
        } else {
            System.out.println("Second largest number is: " + secondLargest);
        }
    }
}

