package aula06;

import aula06.enums.Estado;
import aula06.exceptions.EstadoInvalidoException;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Ex07Exception {
    public static double valorProdutoFinal(double valorProduto, String estado) throws EstadoInvalidoException {
        try {
            Estado.valueOf(estado);
        } catch (IllegalArgumentException e) {
            throw new EstadoInvalidoException();
        }

        return arredondar(valorProduto * (1 + Estado.valueOf(estado).getTax()));
    }

    public static double arredondar(double numero) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimalFormat = new DecimalFormat("#.####", symbols);

        return Double.parseDouble(decimalFormat.format(numero));
    }

    public static void main(String[] args) throws EstadoInvalidoException {
        System.out.println(valorProdutoFinal(250.10, "MG") == 267.607);
        System.out.println(valorProdutoFinal(250.10, "RJ") == 287.615);
        System.out.println(valorProdutoFinal(250.10, "SP") == 280.112);

        try {
            valorProdutoFinal(250.10, "DF");
        } catch (EstadoInvalidoException e) {
            System.out.println("Estado inválido");
        }
    }
}
