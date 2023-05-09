package duke.choice;

import java.util.Arrays;

/**
 *
 * @author putragandadewata
 */
public class ShopApp {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Customer objects
        // created one object from Customer class (blueprint)
        Customer c1 = new Customer("Pinky", 6);
        
//        c1.setSize(c1.getMeasurement());
        
        //Clothing objects
        Clothing item1 = new Clothing("Blue Jacket", 11, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 12, "M");
        Clothing item3 = new Clothing("Green Scarf", 13, "L");
        Clothing item4 = new Clothing("Blue T-Shirt", 5, "XL");
        
        //Clothing items array
        Clothing items[] = {item1, item2, item3, item4}; //using array
//        
//        item1.setDescription("Blue Jacket");
//        item1.setPrice(11);
//        item1.setSize("S");
//
//        item2.setDescription("Orange T-Shirt");
//        item2.setPrice(12);
//        item2.setSize("M");
//        
//        //another way to access array's value using arrayvariablename[i]
//        items[2].setDescription("Green Scarf");
//        items[2].setPrice(13);
//        items[2].setSize("L");
//        
//        items[3].setDescription("Blue T-Shirt");
//        items[3].setPrice(5);
//        items[3].setSize("XL");
        
        // syso for intro
        System.out.println("Welcome to the Duke Choice Shop");
        System.out.println("Minimum price = " + Clothing.MIN_PRICE);
        System.out.println("List of available items that you can purchase = ");
        Arrays.sort(items); // sorted the items array, invoke compareTo method
        for(Clothing item : items) {
            System.out.println(item);
        }
        
        System.out.println("");
        System.out.println("Hello, " + c1.getName());
        System.out.println("Your body measurement size = " + c1.getSize());
        
        c1.addItems(items); //add items array to the c1, using method invocation
        System.out.println("Total cost for the items that you've purchased = " + c1.getTotalClothingCost());
        System.out.println("The amount of item you've purchased = " + c1.getItemCounter());
        
        System.out.println("");
        System.out.println ("List of the items that you've purchased = ");
        //using for-each loops for running price and syso each items of Clothing
        for(Clothing item : c1.getItems()) {
            if(c1.getSize().equals(item.getSize())) {
                System.out.println(item.getDescription());
            }
        }
        System.out.println("Average Price = " + c1.getAveragePrice(items));
        
        // Study case
        /* Below is a study case to Generate Arithmetic Exception Error 
           and then tried to use try and catch as
           a solution, or at least to catch the error logs.
        
           The actual and correct code of Item Counter and Average Price
           is available on the other class as i implemented it using OOP
           in mind.
        */
        System.out.println("");
        System.out.println("");
        System.out.println("STUDY CASE = TRY AND CATCH");
        int average = 0;
        int count = 0;
        
        for (Clothing item : c1.getItems()) {
            if (item.getSize().equals("L")) {
                count++;
                average += item.getPrice();
            }
        }
        
        try {
            average = average/count;
            System.out.println("Average = " + average + ", Counter = " + count);
        } catch (ArithmeticException e) {
            System.out.println("Don't divide by zero");
        }
    }
}
