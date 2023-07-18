package aula03;

public class HeronFormula {
    public static double calculateTriangleArea(int a, int b, int c) {
        boolean isTriangle = verifyIfIsTriangle(a, b, c);

        if (isTriangle) {
            double perimeter = (a + b + c) / 2.0;
            double calc = perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c);
            double area = Math.sqrt(calc);

            return area;
        }

        return 0.0;
    }

    public static boolean verifyIfIsTriangle(int a, int b, int c) {
        return a > Math.abs(b - c) && a < b + c;
    }

    public static void main(String[] args) {
        double area01 = calculateTriangleArea(9, 7, 14);
        double area02 = calculateTriangleArea(20, 15, 5);

        System.out.println("A área do tringulo 01 é " + area01);
        System.out.println("A área do tringulo 02 é " + area02);
    }
}
