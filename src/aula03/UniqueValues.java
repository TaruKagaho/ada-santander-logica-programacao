package aula03;

public class UniqueValues {
    public static boolean elementosRepetidos(double[] input) {
        int count = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[j] == input[i]) {
                    count++;
                }
            }
        }

        return count > 0;
    }

    public static void main(String[] args) {
        double[] values01 = {2.5, 3.2, 4.5, 5, 6};
        double[] values02 = {2, 2, 3.1, 4, 4.1, 4.1};

        System.out.println("Possue valores repetidos?");
        System.out.println("Vetor values01: " + elementosRepetidos(values01));
        System.out.println("Vetor values02: " + elementosRepetidos(values02));
    }
}
