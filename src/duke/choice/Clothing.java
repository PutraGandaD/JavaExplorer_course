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
    private double price = 10;
    private String size = "M"; 
    
    public final int minPrice = 10;
    public final double tax = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price + (price*tax);
    }

    public void setPrice(double newPrice) { 
        price = (newPrice > minPrice) ? newPrice : minPrice; //ternary
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
