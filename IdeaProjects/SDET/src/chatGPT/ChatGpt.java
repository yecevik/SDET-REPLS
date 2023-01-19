package chatGPT;

public class ChatGpt {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

// Initialize maximum number with first element of array
        int max = numbers[0];

// Loop through array starting from second element
        for (int i = 1; i < numbers.length; i++) {
            // If current element is greater than max, update max
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

// Print maximum number
        System.out.println("Maximum number: " + max);
    }
}
