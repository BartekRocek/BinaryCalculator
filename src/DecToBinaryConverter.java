import java.util.ArrayList;
import java.util.Collections;

public class DecToBinaryConverter extends Converter {

    ArrayList<Integer> bits = new ArrayList<>();

    int index = 0;

    public void convert(int quotient) {
        do {
            if (quotient % 2 == 0) {
                bits.add(index, 0);
            } else {
                bits.add(index, 1);
            }
            index++;
            quotient /= 2;
        } while (quotient > 0);

        Collections.reverse(bits);

        for (Integer bit : bits) {
            System.out.print(bit + " ");
        }
    }
}
