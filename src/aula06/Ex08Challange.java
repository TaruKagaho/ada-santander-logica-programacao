package aula06;

import aula06.enums.Week;

public class Ex08Challange {
    public static void main(String[] args) {
        System.out.println("O dia da semana é " + Week.stringToEnum("Sábado") + ".");

        System.out.println("O dia da semana é " + Week.stringToEnum("Teste") + ".");
    }
}
