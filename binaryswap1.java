import java.util.Scanner;

public class binaryswap1 {
    public static int swapBits(int num, int i, int j) {
        int bit1 = (num >> i) & 1; 
        int bit2 = (num >> j) & 1; 
        if (bit1 != bit2) {
            int mask = (1 << i) | (1 << j);
            num = num ^ mask; 
        }
        
        return num;
    }
    public static String toBinaryString(int num) {
        return String.format("%32s", Integer.toBinaryString(num)).replace(' ', '0');
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 32-bit integer: ");
        int num = scanner.nextInt();
        System.out.print("i: ");
        int i = scanner.nextInt();
        System.out.print("j: ");
        int j = scanner.nextInt();
        System.out.println("before swap: " + toBinaryString(num));
        int result = swapBits(num, i, j);
        System.out.println("after swap:  " + toBinaryString(result));
    }
}
