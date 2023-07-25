package aula06.enums;

public enum Estado {
    MG(0.07),
    RJ(0.15),
    SP(0.12);

    final double tax;

    Estado(double tax) {
        this.tax = tax;
    }

    public double getTax() {
        return tax;
    }
}
