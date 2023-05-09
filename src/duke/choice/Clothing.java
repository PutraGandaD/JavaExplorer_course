/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author putragandadewata
 */
public class Clothing {
    private String description;
    private String size;
    private double price;
    
    public final static int MIN_PRICE = 10;
    public final static double TAX_RATE = 0.2;

    public Clothing(String description, double price, String size) {
        this.description = description;
        this.price = price;
        this.size = size;
    }
    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price*TAX_RATE);
    }

    public void setPrice(double newPrice) { 
        price = (newPrice > MIN_PRICE) ? newPrice : MIN_PRICE; //ternary
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }  
    
    @Override
    public String toString() {
        return description + ", " + size + ", " + price;
    }

}
