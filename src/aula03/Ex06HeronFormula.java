package aula03;

public class Ex06HeronFormula {
    public static double calculateTriangleArea(int a, int b, int c) {
        /*boolean isTriangle = verifyIfIsTriangle(a, b, c);

        if (isTriangle) {
            double perimeter = (a + b + c) / 2.0;
            double calc = perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c);
            double area = Math.sqrt(calc);

            return area;
        }

        return 0.0;*/
        verifyIfIsTriangle(a, b, c);

        double perimeter = (a + b + c) / 2.0;
        double calc = perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c);
        double area = Math.sqrt(calc);

        return area;
    }

    public static boolean verifyIfIsTriangle(int a, int b, int c) {
        if (a > Math.abs(b - c) && a < b + c) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
        // return a > Math.abs(b - c) && a < b + c;
    }

    public static void main(String[] args) {
        try {
            double area01 = calculateTriangleArea(9, 7, 14);

            System.out.println("A área do tringulo 01 é " + area01);
        } catch (IllegalArgumentException e) {
            System.out.println("Lados fornecidos inválidos para um triângulo.");
        }

        try {
            double area02 = calculateTriangleArea(20, 15, 5);

            System.out.println("A área do tringulo 02 é " + area02);
        } catch (IllegalArgumentException e) {
            System.out.println("Lados fornecidos inválidos para um triângulo.");
        }
    }
}
