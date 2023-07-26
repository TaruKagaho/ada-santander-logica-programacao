package aula07;

import aula07.enums.Week02;

public class Ex01EnumWithArrayString {
    public static void main(String[] args) {
        System.out.println("O dia da semana é " + Week02.stringToEnum("Sábado") + ".");
        System.out.println("O dia da semana é " + Week02.stringToEnum("Sexta") + ".");

        System.out.println("O dia da semana é " + Week02.stringToEnum("Teste") + ".");
    }
}
