public class missing {
    public int missingNumber(int[] A) {
        int n = A.length + 1; // Since one number is missing
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        return totalSum - sum; // The missing number
    }
    public static void main(String[] args) {
        missing sol = new missing();
        int[] arr = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println("Missing number is: " + sol.missingNumber(arr)); // Output: 5
    }
}
