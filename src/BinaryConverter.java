import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> bits = new ArrayList<>();

        System.out.println("Enter a decimal number to convert it to a binary form");
        int decimalNumber = scanner.nextInt();
        int quotient = decimalNumber;
        int index = 0;

        do {
            switch (quotient % 2) {
                case 0 -> {
                    bits.add(index, 0);
                    index++;
                }
                case 1 -> {
                    bits.add(index, 1);
                    index++;
                }
                default -> throw new IllegalStateException("Unexpected value: " + decimalNumber % 2);
            }
                quotient /= 2;
        } while (quotient > 0);

        Collections.reverse(bits);

        for (Integer bit : bits) {
            System.out.print(bit + " ");
        }
    }
}