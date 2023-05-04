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
        int measurement = 3;
        
        //Customer objects
        // created one object from Customer class (blueprint)
        Customer c1 = new Customer();
        
        c1.setName("Pinky"); //customer's name
        c1.setSize("S"); //customer's body size
        c1.setSize(measurement); //customer's body size (used measurement value)
          
        //Clothing objects
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();
        
        //Clothing items array
        Clothing items[] = {item1, item2, item3, item4}; //using array
        
        item1.setDescription("Blue Jacket");
        item1.setPrice(11);
        item1.setSize("S");

        item2.setDescription("Orange T-Shirt");
        item2.setPrice(12);
        item2.setSize("M");
        
        //another way to access array's value using arrayvariablename[i]
        items[2].setDescription("Green Scarf");
        items[2].setPrice(13);
        items[2].setSize("L");
        
        items[3].setDescription("Blue T-Shirt");
        items[3].setPrice(5);
        items[3].setSize("XL");
               
        c1.addItems(items); //add items array to the c1, using method invocation
        
        // syso for intro
        System.out.println("Welcome to the Duke Choice Shop");
        System.out.println("Hello, " + c1.getName());
        System.out.println("Your body measurement size = " + c1.getSize());
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
