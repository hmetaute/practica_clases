
/**
 * Representa un vehiculo que puede llenar una celda.
   
 * 
 * @author Lilo 
 * @version 0.0.0.0.0.0.1
 */
public class Vehicle
{
    // instance variables - replace the example below with your own
    private String numberPlate;
    private String color;
    private int model;
    private String brand;
    /**
     * Constructor for objects of class vehicle
     */
    public Vehicle(String numberPlate, String color, int model, String brand){
        this.numberPlate = numberPlate;
        this.color= color;
        this.model = model;
        this.brand = brand;
    }

}
