package coding;

public class Sum {
    public static void main(String[] args) {
        int N = 561;
        int result = digitSum(N);
        System.out.println("Output: " + result);
    }

    // Function to find the sum of digits of a number
    public static int digitSum(int num) {
        // Initialize sum to 0
        int sum = 0;

        // Loop until num becomes 0
        while (num != 0) {
            // Add the last digit to sum
            sum += num % 10;
            // Remove the last digit from num
            num /= 10;
        }

        // If the sum is greater than 9, repeat the process
        while (sum > 9) {
            sum = digitSum(sum);
        }

        return sum;
    }
}

