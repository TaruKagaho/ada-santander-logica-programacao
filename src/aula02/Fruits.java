package aula02;

import java.util.Scanner;

public class Fruits {
    public static Double computeFruitValue(Integer quantity) {
        if (quantity >= 10) {
            return quantity * 1.25;
        }

        return quantity * 1.45;
    }
    public static void main(String[] args) {
        String[] fruitsInPromo =  {"maçã", "pêra", "laranja", "caqui", "tomate"};
        Double sum = 0.0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite a quantidade desejada de cada fruto.");

        for (String fruit: fruitsInPromo) {
            System.out.println("Quantidade de " + fruit + ":");

            Integer quantity = Integer.parseInt(sc.nextLine());

            sum += computeFruitValue(quantity);
        }
        sc.close();

        System.out.printf("Valor total a pagar: %.2f", sum);
    }
}
