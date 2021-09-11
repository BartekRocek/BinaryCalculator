import java.util.Scanner;

public class NumericSystemConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a decimal number to convert it to other numerical systems");
        int decimalNumber = scanner.nextInt();


        DecToHexConverter hexNumber = new DecToHexConverter();
        System.out.print("The hexadecimal form of " + decimalNumber + " is: ");
        hexNumber.convert(decimalNumber);
        System.out.print("\n");

        DecToBinaryConverter binNumber = new DecToBinaryConverter();
        System.out.print("The binary form of " + decimalNumber + " is: ");
        binNumber.convert(decimalNumber);
        System.out.print("\n");

    }
}