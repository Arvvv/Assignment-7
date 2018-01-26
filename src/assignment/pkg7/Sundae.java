/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arvind
 */
public class Sundae extends IceCream{
    // private variables
//    private String name;
//    private int icCost;
    private int toppingCost;
    private String toppingName;

    // implementing the constructor 
    public Sundae(String icName, int icCost, String toppingName, int toppingCost)
        {
        // name implementation 
//        this.name = icName;
//        // cost implementation 
//        this.icCost = icCost;
            
        // topping name implementation 
            super(icName,icCost);
        this.toppingName = toppingName;
        // topping cost implementation  
        this.toppingCost = toppingCost;
       
    }
 
    
    public String toString(){
       // implementing the cost and name 
        String outputSundae = this.toppingName + " sundae " + "with\n";
        outputSundae += this.getName();
        String holder = DessertShoppe.cents2dollarsAndCents(getCost());
        
        // making the spaces within 
        for(int i = 0; i < DessertShoppe.RECEIPT_WIDTH - this.getName().length() - holder.length(); i++){
            outputSundae += " ";
        }
    // adding the cost     
    outputSundae += holder;
    return outputSundae;
}

// adding the cost
public int getCost(){
    
    int total = super.getCost();
    // adding cost to the topping cost 
    total += this.toppingCost;
    return total;
}
}