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
  
}
