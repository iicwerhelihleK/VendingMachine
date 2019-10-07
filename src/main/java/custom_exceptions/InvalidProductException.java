package custom_exceptions;

public class InvalidProductException extends RuntimeException {
    public InvalidProductException(String invalid_product){
        super("There is no such product on this machine!");
    }
}
