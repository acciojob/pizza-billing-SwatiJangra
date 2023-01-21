package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAway;
    private boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.isExtraCheeseAdded=false;
        this.isExtraToppingsAdded=false;
        this.isTakeAway=false;
        this.isBillGenerated=false;
        this.bill="";

        if(isVeg) {
            this.price=300; // price of veg base
            this.toppingsPrice=70;
        } else {
            this.price=400; // price of non veg base
            this.toppingsPrice=120;
        }
        this.cheesePrice=80;

        this.bill+="Base Price Of The Pizza: "+this.price+"\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded) {
            this.price=this.price+cheesePrice;
            isExtraCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        if(!isExtraToppingsAdded) {
            this.price=this.price+toppingsPrice;
            isExtraToppingsAdded=true;
        }
    }

    public void addTakeaway(){
        if(!isTakeAway) {
            this.price=this.price+20;
            isTakeAway=true;
        }

    }

    public String getBill(){
        if(!isBillGenerated) {
            if(isExtraCheeseAdded) {
                this.bill+="Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isExtraToppingsAdded) {
                this.bill+="Extra Toppings Added:"+this.toppingsPrice+"\n";
            }
            if(isTakeAway) {
                this.bill+="Paperbag Added: 20"+"\n";
            }
            this.bill+="Total Price: "+this.price+"\n";

            isBillGenerated=true;
        }
        return this.bill;
    }
}
