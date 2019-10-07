package custom_exceptions;

public class SaltyCracksAllEatenException extends ProductNotFoundException {
    public SaltyCracksAllEatenException(){
        super("Salty snacks are out of stock!");

    }

}
