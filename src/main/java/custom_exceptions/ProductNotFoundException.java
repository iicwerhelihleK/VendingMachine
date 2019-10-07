package custom_exceptions;


public class ProductNotFoundException extends Exception{
    public ProductNotFoundException(String msg){
        super("Product not found");
    }

}

