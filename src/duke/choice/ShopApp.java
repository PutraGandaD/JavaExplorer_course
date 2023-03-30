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
        double tax = 0.2;
        double total = 0;
        double customers;
        int measurement = 4;
        
        //Customer
        Customer c1 = new Customer();
        
        c1.name = "Pinky";     
        c1.size = "S";
          
        //Clothing
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        
        //Clothing items
        Clothing items[] = {item1, item2}; //using array
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
  
        switch(measurement) { // using switch flow control
            case 1,2,3:
                c1.size = "S";
                break;
            case 4,5,6:
                c1.size = "M";
                break;
            case 7,8,9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
        }
        
        // syso for intro
        System.out.println("Welcome to the Duke Choice Shop");
        System.out.println("Hello, " + c1.name);
        System.out.println("Your body measurement size = " + c1.size);
//        System.out.println("1. " + item1.description + ", " + item1.price + ", " + item1.size + ".");
//        System.out.println("2. " + item2.description + ", " + item2.price + ", " + item2.size + ".");
        
//        customers = ((2 * item2.price) + item1.price);
//        total = (customers * tax) + customers;
        
        //using for-each loops for running price and syso each items of Clothing
        for(Clothing item : items) {
            System.out.println(item.description + ", " + item.price + ", " + item.size);
            total += (item.price * tax) + item.price;
        };
        System.out.println("Total = " + total);
    }
    
}
