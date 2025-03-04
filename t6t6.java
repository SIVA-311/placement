import java.util.*;
//letter prints by number
public class t6t6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder output = new StringBuilder();
           
        
        for (int i = 0; i < input.length(); i++) {
            char val = input.charAt(i);
            if (Character.isDigit(val)) {
                int repeat = Character.getNumericValue(val);
                if (i + 1 < input.length()) {
                    char nextChar = input.charAt(i + 1);
                    output.append(String.valueOf(nextChar).repeat(repeat));
                }
            }
        }

        System.out.println("Output: " + output.toString());
    }
}

