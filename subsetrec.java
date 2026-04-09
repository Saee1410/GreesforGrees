public class subsetrec {
    public static void printSubsets(String str, int idx, String newString) {
        if (idx == str.length()){
            System.out.println("{" + newString + "}");
            return;
        }

        char currChar = str.charAt(idx);

        printSubsets(str, idx + 1, newString + currChar);

        printSubsets(str, idx + 1, newString);
    }

    public static void main(String[] args){
        String str = "abc";
        System.out.println("Subsets of " + str + "are:");
        printSubsets(str, 0, "");
    }
}
