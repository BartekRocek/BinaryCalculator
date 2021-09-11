import java.util.ArrayList;
import java.util.Collections;

public class DecToOctalConverter extends Converter {
    ArrayList<Integer> bits = new ArrayList<>();

    int index = 0;

    public void convert(int quotient) {
        do {
            this.bits.add(this.index, quotient % 8);
            this.index++;
            quotient /= 8;
        } while (quotient > 0);

        Collections.reverse(this.bits);

        for (Integer bit : this.bits) {
            System.out.print(bit);
        }
    }
}