package aula05.exceptions;

public class InvalidNegativeValueException extends IllegalArgumentException {
    public InvalidNegativeValueException() {
        super("Valor negativo é inválido para quantidade de itens.");
    }
}
