
/**
 * Representa un parqueadero.
 *
 * @author lili
 * @version 0.0.0.1
 */
import java.util.*;
public class ParkingLot
{
    // Atributos de la clase Parqueadero
    private int ParkingLotCapacity; // Número de celdas del parqueadero
    private double precio; // Precio de la hora
    private Cell onlyParkingSpot; //El único espacio de mi parqueadero.
    //private ArrayList <Cell> listOfParkedVehicles; //Lista de carros dentro del parquedero
    private int availableCells; // Número de celdas disponibles
    private int ocupiedCells; // Número de celdas ocupadas
    

    /**
     * Metodo contructor que sirve para crear un objeto de tipo de parqueadero.
     */
    public ParkingLot(int cellCapacity, double preciohora)
    {
        // asignacion de valores a lso atributos del parqueadero
      this.precio = preciohora;
      this.ParkingLotCapacity = 1;
      onlyParkingSpot= new Cell ();
      
    }
    
    public void parkVehicle (){
       Vehicle newVehicle = new Vehicle ("lil123","negro", 2012, "KIA");
       onlyParkingSpot.parkVehicle(newVehicle); 
    
    }
   
}
