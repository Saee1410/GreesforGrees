public class fibrec {
    public static int fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacci( n - 1) + fibonacci(n - 2);
    }
    public static void main(String[] args) {
        int number = 10;
        int result = fibonacci(number);
        System.out.println("The " + number + "th Fibonacci number is: " + result);
    }
}
