import java.util.*;
/**
 * Representa la ubicación de un espacio en un parqueadero en el que se puede
 * dejar un vehículo.
 *
 * @author Lilo
 * @version 0.0.0.0.0.0.1
 */
public class Cell
{
    // instance variables - replace the example below with your own
    private boolean occupied;
    private Vehicle parkedVehicle;
    

    /**
     * Constructor for objects of class Celda
     */
    public Cell()
    {
        // initialise instance variables
        occupied = false;
    }

    /**
     * Metodo para saber asignarle un vehículo a una celda.
     *
     * @return un variable que dice si hay o no un vehiculo en la celda. 
     */
    public void parkVehicle(Vehicle newVehicle)
    {
        occupied = true;
        parkedVehicle = newVehicle;
    
    }
    
    public List<String> splitWithEmpty(String param) {
        return Arrays.asList(param.split(","));
    }
}
