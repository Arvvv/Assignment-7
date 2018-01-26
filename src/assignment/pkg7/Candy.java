

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvind
 */
public class Candy extends DessertItem {

    // variables
    private double weight;
    private int pricePerlbs;

    public Candy(String name, double weight, int pricePerLbs) {
        // calling to the super class
        super(name);
        this.weight = weight;
        this.pricePerlbs = pricePerLbs;

    }

    public String toString() {
        String outputCandy = this.weight + " lbs. @ $" + DessertShoppe.cents2dollarsAndCents(this.pricePerlbs) + " /lb";
        // implementing the name 
        outputCandy += "\n" + this.getName();
        // implementing the cost 
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        
        // making spaces within printing
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - holder.length() - super.getName().length(); i++)
        {
            outputCandy += " ";
        }
        outputCandy += holder;
        // output
        return outputCandy;
    }

    
    public int getCost() {
        // calculating the cost using price and weight 
        int cost;
        cost = (int) Math.round(this.weight * this.pricePerlbs);
        return cost;
    }
}
