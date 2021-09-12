import java.util.ArrayList;
import java.util.Collections;

public class DecToHexConverter extends Converter {

    ArrayList<String> bits = new ArrayList<>();

    int index = 0;

    public void convert(int quotient) {
        do {
            switch (quotient % 16) {
                case 10 -> this.bits.add(this.index, "A");
                case 11 -> this.bits.add(this.index, "B");
                case 12 -> this.bits.add(this.index, "C");
                case 13 -> this.bits.add(this.index, "D");
                case 14 -> this.bits.add(this.index, "E");
                case 15 -> this.bits.add(this.index, "F");
                default -> this.bits.add(this.index, Integer.toString(quotient % 16));
            }
            this.index++;
            quotient /= 16;
        } while (quotient > 0);

        Collections.reverse(this.bits);

        System.out.print("0x");

        for (String bit : this.bits) {
            System.out.print(bit);
        }
    }
}