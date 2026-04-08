public class factrec {
    public static long fact(int n){
        if(n == 0){
            return 1;
        }
        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        int number = 45;
        long result = fact(number);
        System.out.println("The factorial of " + number + " is: " + result);
    }
}

