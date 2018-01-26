/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvind
 */
public class Cookie extends DessertItem {
    // variables 
    private int numofCookies;
    private int pricePerDozen;
    
    // constructor implementation 
    public Cookie(String name, int number, int priceperDozen){
        super(name);
        this.numofCookies = number;
        this.pricePerDozen = pricePerDozen;
        
    }

    
    public String toString() 
    {
        //
        String outputCookie = numofCookies + " @ $" + DessertShoppe.cents2dollarsAndCents((int)pricePerDozen) + " /dz.";
        outputCookie += "\n";
        outputCookie += super.getName();
        
        
        //outputCookie += "\n" + this.getName(); (Commenting out *trying to fix formatting errors)
        
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - holder.length() - super.getName().length(); i++){
            outputCookie += " ";
        }
        outputCookie += holder;
        
        return outputCookie;
    }

    @Override
    // calculating the cost using the price per dozzen and the numeber of cookies
    public int getCost() {
        
        // OR return(int) Math.round(pricePerDozen / 12 * numofCookies) (Having problems formatting within the receipt);
       
        return (int) Math.round(pricePerDozen / 12 * numofCookies);
    }
    
}