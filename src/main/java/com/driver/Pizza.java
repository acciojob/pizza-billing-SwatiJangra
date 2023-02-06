package com.driver;

public class Pizza {

    private int price;
    private final Boolean isVeg;
    private boolean isAddExtraCheese;
    private boolean isAddTakeAway;
    private boolean isAddExtraToppings;
    private final boolean isBillGenerated;
    private final int extraCheese;
    private final int extraToppings;
    private final int takeAwayCharge;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg){
            this.extraToppings = 70;
            //this.bill = "Base Price Of The Pizza: 300\n";
            this.price = 300;
        } else {
            this.extraToppings = 120;
            //this.bill = "Base Price Of The Pizza: 400\n";
            this.price = 400;
        }
        this.extraCheese = 80;
        this.takeAwayCharge = 20;

        isBillGenerated = false;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isAddExtraCheese||isAddExtraToppings){
            return;
        }
//        bill += "Extra Cheese Added: 80\n";
        price += extraCheese;
        isAddExtraCheese = true;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isAddExtraToppings){
            return;
        }
        price += extraToppings;
//        if(isVeg){
//            bill += "Extra Toppings Added: 70\n";
//            price += 70;
//        } else{
//            bill += "Extra Toppings Added: 120\n";
//            price += 120;
//        }
        isAddExtraToppings = true;
    }

    public void addTakeaway(){
        // your code goes here
        if(isAddTakeAway){
            return;
        }
//        bill += "Paperbag Added: 20\n";
        price += takeAwayCharge;
        isAddTakeAway = true;
    }

    public String getBill(){
        // your code goes here
        String bill = "";
        if(!isBillGenerated){
//            bill += "Total Price: "+price+"\n";
//            this.isBillGenerated = true;
//            return this.bill;
            if(isVeg)
                bill = "Base Price Of The Pizza: 300\n";
            else
                bill = "Base Price Of The Pizza: 400\n";

            if(isAddExtraCheese)
                bill += "Extra Cheese Added: 80\n";
            if(isAddExtraToppings)
                bill += "Extra Toppings Added: "+extraToppings+"\n";
            if(isAddTakeAway)
                bill += "Paperbag Added: 20\n";

            bill += "Total Price: "+price+"\n";
            return bill;

        }
        return bill;
    }
}
