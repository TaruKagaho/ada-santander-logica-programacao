package aula03;

public class Fruits {
    public static double custoCompra(double input) {
        if (input > 10) {
            return input * 1.25;
        }

        return input * 1.45;
    }

    public static void main(String[] args) {
        System.out.println("O valor total da comprar é " + custoCompra(11));
    }
}
