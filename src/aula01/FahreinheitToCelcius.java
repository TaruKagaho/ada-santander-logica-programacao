package aula01;

import java.util.Scanner;

public class FahreinheitToCelcius {
    public static String convertFahreinheitToCelcius(String fahreinheit) {
        double fahreinheitDouble = Double.parseDouble(fahreinheit);
        double celcius = 5 * ((fahreinheitDouble - 32) / 9);
        String result = String.format("%.2f", celcius);

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor de temperatura em Fahrenheit:");

        String temperature = sc.nextLine();
        sc.close();

        System.out.println(
                "O valor da temperatura em Celcius: " +
                        convertFahreinheitToCelcius(temperature)
        );
    }
}