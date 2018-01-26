/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvind
 */
public class IceCream extends DessertItem {
    // private int variable used for the cost 
    private int cost;
    
    public IceCream(String name, int cost){
        // calling to the super class 
        super(name);
        this.cost = cost;
    }

    public String toString()
    {
        // implementing the name and cost
        //cost implementation 
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        // name implementation 
        String outputIceCream = this.getName();
        // making the spaces within
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - this.getName().length() - holder.length(); i++){
            outputIceCream += " ";
        }
        outputIceCream += holder;
        
        return outputIceCream;
    }

  
  

    @Override
    // return the cost
    public int getCost() {
       return cost;
    }
    
}