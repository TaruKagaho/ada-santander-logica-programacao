package aula07;

public class Ex02Factorial {
    public static int factorialWithFor(int limite) {
        int multiplication = 1;

        if (limite == 0) {
            return 1;
        }

        for (int i = 1; i <= limite; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public static int factorialRecursive(int limite) {
        if (limite == 0) {
            return 1;
        }

        return limite * factorialRecursive(limite - 1);
    }

    public static void main(String[] args) {
        int limite = 5;

        System.out.println(
                "Resultado factorialWithFor de " +
                        limite + " é " +
                        factorialWithFor(limite) +
                        "."
        );

        System.out.println(
                "Resultado factorialRecursive de " +
                        limite + " é " +
                        factorialRecursive(limite) +
                        "."
        );
    }
}
