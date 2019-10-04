package customExceptions;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException(){
        super("There is no such product on this machine!");
    }
}
