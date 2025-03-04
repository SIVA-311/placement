import java.util.*;

public class paline{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.println("String : " + Palindromestring(str));
        System.out.println("StringBuilder  " + Palindromestringbuilder(str));
        System.out.println("StringBuffer " + Palindromestringbuffer(str));
        System.out.println("Without  built-in  " + Palindromee(str));

        scanner.close();
    }

    public static boolean Palindromestring(String str) {
        String reversed = new String(new StringBuilder(str).reverse());  
        return str.equals(reversed);
    }

    public static boolean Palindromestringbuilder(String str) {
        StringBuilder sv = new StringBuilder(str);
        return str.equals(sv.reverse().toString());
    }

    public static boolean Palindromestringbuffer(String str) {
        StringBuffer sv = new StringBuffer(str);
        return str.equals(sv.reverse().toString());
    }

    public static boolean Palindromee(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; 
            }
            left++;
            right--;
        }
        return true;
    }
}

