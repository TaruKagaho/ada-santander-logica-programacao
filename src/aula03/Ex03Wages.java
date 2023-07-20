package aula03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex03Wages {
    public static double calculoSalario( double[] input) {
        double income = 0;

        if (input[0] >= 1 && input[0] < 5) {
            income = (1 + (input[1] / 100) + 0.01) * input[2];
        } else if (input[0] >= 5 && input[0] < 10) {
            income = (1 + (input[1] / 100) + 0.015) * input[2];
        } else if (input[0] >= 10) {
            income = (1 + (input[1] / 100) + 0.02) * input[2];
        }

        // return income;
        return new BigDecimal(income)
                .setScale(3, RoundingMode.DOWN)
                .setScale(2, RoundingMode.HALF_DOWN)
                .doubleValue();
    }

    public static void main(String[] args) {
        double[] infoJob01 = {11, 4.5, 2500.00};
        double[] infoJob02 = {1, 5.0, 2000.00};
        double[] infoJob03 = {5.1, 6.7, 4500.00};
        double[] infoJob04 = {1, 5.7, 4800.00};

        System.out.println("Novo salário 01 é " + calculoSalario(infoJob01));
        System.out.println("Novo salário 02 é " + calculoSalario(infoJob02));
        System.out.println("Novo salário 03 é " + calculoSalario(infoJob03));
        System.out.println("Novo salário 04 é " + calculoSalario(infoJob04));
    }
}
