package vendingMachine;

import customExceptions.*;


public class VendingMachine {
    public void buy() throws ProductNotFoundException{
//        SoftDrinksCount = 0;
//        SaltySnacksCount = 0;
//        ChocolatesCount = 0;
    }
    public void addStock(Product product, int NewStock){

    }

    public void getStock(){

    }


    public static void main(String[] args) {
        try{
            throw new SoftDrinksOutOfStockException();

        }catch(ProductNotFoundException e) {
            e.printStackTrace();
        }
    }
}
