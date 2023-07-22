package aula05.exceptions;

public class InvalidZeroValueException extends IllegalArgumentException{
    public InvalidZeroValueException() {
        super("Zero não é um valor válido para quantidade de itens.");
    }
}
