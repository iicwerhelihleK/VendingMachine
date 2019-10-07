package custom_exceptions;

public class SoftDrinksOutOfStockException extends ProductNotFoundException {
    public SoftDrinksOutOfStockException() {
        super("Softdrink is not available!");
    }
}
