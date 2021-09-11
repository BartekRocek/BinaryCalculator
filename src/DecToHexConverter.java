import java.util.ArrayList;
import java.util.Collections;

public class DecToHexConverter {

    ArrayList<String> bits = new ArrayList<>();

    int index = 0;

    public void convertDecimalToHex(int quotient) {
        do {
            switch (quotient % 16) {
                case 10 -> {
                    this.bits.add(this.index, "A");
                    this.index++;
                }
                case 11 -> {
                    this.bits.add(this.index, "B");
                    this.index++;
                }
                case 12 -> {
                    this.bits.add(this.index, "C");
                    this.index++;
                }
                case 13 -> {
                    this.bits.add(this.index, "D");
                    this.index++;
                }
                case 14 -> {
                    this.bits.add(this.index, "E");
                    this.index++;
                }
                case 15 -> {
                    this.bits.add(this.index, "F");
                    this.index++;
                }
                default -> {
                    this.bits.add(this.index, Integer.toString(quotient % 16));
                    this.index++;
                }
            }
            quotient /= 16;
        } while (quotient > 0);

        Collections.reverse(this.bits);

        System.out.print("0x");

        for (String bit : this.bits) {
            System.out.print(bit);
        }
    }
}