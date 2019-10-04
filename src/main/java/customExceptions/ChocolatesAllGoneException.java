package customExceptions;

public class ChocolatesAllGoneException extends ProductNotFoundException{
    public ChocolatesAllGoneException(){
        super("Sorry, but there are no chocolates available!");
    }
}
