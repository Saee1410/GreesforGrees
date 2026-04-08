public class sumrec {
    public static int sumDigits(int n) {
        //base case 
        if (n == 0) {
            return 0;
        }

        //recursive case
        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {
        int number = 12345;
        int result = sumDigits(number);
        System.out.println("The sum of the digits in " + number + " is: " + result);
    }
}
