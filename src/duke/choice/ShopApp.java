package duke.choice;

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
        System.out.println("Minimum price = " + Clothing.minPrice);
        System.out.println("Hello, " + c1.getName());
        System.out.println("Your body measurement size = " + c1.getSize());
        
        c1.addItems(items); //add items array to the c1, using method invocation
        System.out.println("Total cost for the items that you've purchased = " + c1.getTotalClothingCost());
        
        System.out.println ("Items List = ");
        //using for-each loops for running price and syso each items of Clothing
        for(Clothing item : c1.getItems()) {
            if(c1.getSize().equals(item.getSize())) {
                System.out.println(item.getDescription());
            }
        }
    }
}
