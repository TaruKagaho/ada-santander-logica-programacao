package aula05;

import aula05.exceptions.InvalidNegativeValueException;
import aula05.exceptions.InvalidZeroValueException;

public class Ex01Fruits {
    public static double calculateItemsValue(double quantity) {
        if (quantity < 0) {
            throw new InvalidNegativeValueException();
        } else if (quantity == 0) {
            throw new InvalidZeroValueException();
        } else if (quantity > 10) {
            return quantity * 1.25;
        }

        return quantity * 1.45;
    }

    public static void main(String[] args) {
        System.out.println(
                "O valor total da comprar é " +
                        calculateItemsValue(11)
        );
        /*System.out.println(
                "O valor total da comprar é " +
                        calculateItemsValue(-1)
        );*/
        System.out.println(
                "O valor total da comprar é " +
                        calculateItemsValue(0)
        );
    }
}
