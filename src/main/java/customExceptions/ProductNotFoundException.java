package customExceptions;

public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String msg){
        super("Product not found");
    }

}

