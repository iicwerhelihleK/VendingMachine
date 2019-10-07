package vending_machine;

import custom_exceptions.*;
import vending_machine.product_type.Chocolate;
import vending_machine.product_type.SaltySnack;
import vending_machine.product_type.SoftDrink;


public class VendingMachine {
    public int SoftDrinksCount = 0;
    public int SaltySnacksCount = 0;
    public int ChocolatesCount = 0;

    public void buy(Product product, int amount) throws ProductNotFoundException{
        if(product instanceof Chocolate){
            ChocolatesCount -= amount;
            throw new ChocolatesAllGoneException();

        }else if(product instanceof SoftDrink){
            SoftDrinksCount -= amount;
            throw new SoftDrinksOutOfStockException();

        }else if(product instanceof SaltySnack){
            SaltySnacksCount -= amount;
            throw new SaltyCracksAllEatenException();

        }else{
            throw new InvalidProductException("Invalid product");
        }

    }
    public void addStock(Product product, int NewStock){
//        boolean condition = false;
//        if(!condition) {
//            throw new InvalidProductException("Invalid product");
//        };
        if (product instanceof Chocolate){
            NewStock += ChocolatesCount;

        }else if(product instanceof SoftDrink){
            NewStock += SoftDrinksCount;
        }else{
            NewStock += SaltySnacksCount;
        }

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
