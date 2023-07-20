package aula03;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Ex02Costs {
    public static double[] custosCarro( double[] input) {
        double[] costs = new double[2];

        double costDistributor = (input[1] / input[0]) * 100;
        double costTax = (input[2] / input[0]) * 100;

        // costs[0] = (double) Math.round(costDistributor * 100) / 100;
        // costs[1] = (double) Math.round(costTax * 100) / 100;

        /*costs[0] = new BigDecimal((costDistributor * 100) / 100)
                .setScale(3, RoundingMode.DOWN)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();*/
        costs[0] = BigDecimal.valueOf((costDistributor * 100) / 100)
                .setScale(3, RoundingMode.DOWN)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();
        costs[1] = BigDecimal.valueOf((costTax * 100) / 100)
                .setScale(3, RoundingMode.DOWN)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();

        return costs;
    }

    public static void main(String[] args) {
        double[] costsCar = {100000.00, 12000.00, 20000.00};

        System.out.println("O valor total da comprar é " + Arrays.toString(custosCarro(costsCar)));
    }
}
