public class stairsrec {
    public static int stairs(int n ){
        if(n == 0){
            return 1;
        } else if (n < 0){
            return 0;
        }
        return stairs(n - 1) + stairs(n - 2);
    }
    public static void main(String[] args) {
        int number = 5;
        int result = stairs(number);
        System.out.println("The number of ways to climb " + number + " stairs is: " + result);
    }
}
