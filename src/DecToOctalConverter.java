import java.util.ArrayList;
import java.util.Collections;

public class DecToOctalConverter extends Converter {
    ArrayList<Integer> bits = new ArrayList<>();

    int index = 0;

    public void convert(int quotient) {
        do {
            switch (quotient % 8) {
                case 0 -> {
                    this.bits.add(this.index, 0);
                    this.index++;
                }
                case 1 -> {
                    this.bits.add(index, 1);
                    this.index++;
                }
                default -> throw new IllegalStateException("Unexpected value: " + quotient % 8);
            }
            quotient /= 2;
        } while (quotient > 0);

        Collections.reverse(this.bits);

        for (Integer bit : this.bits) {
            System.out.print(bit + " ");
        }
    }
}
