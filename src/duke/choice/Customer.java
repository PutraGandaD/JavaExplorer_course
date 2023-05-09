/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author putragandadewata
 */
// Blueprint for Customers
public class Customer {
    private String name; // represents the object's state
    private String size;
    //private int measurement;
    private Clothing[] items;

    public Customer(String name, int measurement) {
        this.name = name;
        //this.measurement = measurement;
        setSize(measurement);
    }

    public void addItems(Clothing[] someItems) {
        items = someItems;
    } 
    
    public Clothing[] getItems() {
        return items;
    }
    
    public double getTotalClothingCost() {
        double total = 0.0;
        
        for(Clothing item : items) {
            if(size.equals(item.getSize())) {
                total += item.getPrice();
            }
        }
        return total;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int measurement) {
        switch(measurement) { // using switch flow control
            case 1,2,3:
                setSize("S");
                break;
            case 4,5,6:
                setSize("M");
                break;
            case 7,8,9:
                setSize("L");
                break;
            default:
                setSize("XL");
        }
    }

//    public int getMeasurement() {
//        return measurement;
//    }
//
//    public void setMeasurement(int measurement) {
//        this.measurement = measurement;
//    }
    
    public int getItemCounter() {
        int counter = 0;
        
        for (Clothing item : items) 
        {
            if (size.equals(item.getSize())) {
                counter++;
            }
        }
        
        return counter;
    }
    
    public double getAveragePrice(Clothing[] someItems) {
        double avgPrice;
        
        avgPrice = getTotalClothingCost() / getItemCounter();
         
        return avgPrice;
    }
    
}
