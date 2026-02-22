public class keypad {
    public String convertToNumeric(String input) {
        String[] keypad = {
            "2", "22", "222"  ,  //a b c
            "3", "33", "333",   //d e f
            "4", "44", "444" ,  //g h i
            "5", "55", "555"  , //j k l  
            "6", "66", "666"  , //m n o
            "7", "77", "777", "7777", //p q r s
            "8", "88", "888"  , //t u v
            "9", "99", "999", "9999"  //w x y z

        };

        StringBuilder output = new StringBuilder();

        for(int i =0; i< input.length(); i++){
            char ch = input.charAt(i);

            if(ch == ' ') {
                output.append("0");
            }else {
                //ASCII
                int position = ch - 'A';
                output.append(keypad[position]);
            }
        }
        return output.toString();
    }
    public static void main(String[] args) {
        keypad keypad = new keypad();
        String input = "SAEESUNNYLOVE";
        String result = keypad.convertToNumeric(input);
        System.out.println(result); // Output: 777722337777866668668533
    }
}
