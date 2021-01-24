
/**
 * Building Java Programs 3rd Edition
 * Chapter 8
 * pg 571
 * Programming Project #3: Grocery
 */

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class GroceryList {
private GroceryItemOrder gList[];
private final int MAX_SIZE=10;
private int counter;
  
    // -------------- Constructor ------------
    public GroceryList()
    {
        this.counter = 0;
        // Set gList to refer to a 'new' array of MAX_SIZE
        gList = new GroceryItemOrder[MAX_SIZE];
        
        // NOTE: We MUST fill each element with a GroceryItemOrder.
        for (int i=0; i<MAX_SIZE; i++)
        {
            gList[i] = new GroceryItemOrder();
        }
    }
    
    // ---------------- Helper Methods ---------
    public void add(GroceryItemOrder item)
    {
        if (counter < 10) {
        gList[counter] = item;
        counter++;
        }
    }
       
    public String getTotalCost() {
    NumberFormat moneyFormat = NumberFormat.getCurrencyInstance(Locale.US);                              
    double total = 0;
        for (int a = 0; a < counter; a++) {
            total = total + gList[a].getCost();
        }

        return moneyFormat.format(total);
    }
    
    public String max() {
        return "You have reached the limit of 10 items!";
    }
    
    public String toString() {
        return Arrays.toString(gList);
    }
  
}
