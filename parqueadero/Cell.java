import java.util.*;
/**
* Representa la ubicación de un espacio en un parqueadero.
*/
public class Cell{
 // Atributos de la Clase.
 private boolean occupied;
 private Vehicle parkedVehicle;
 
  /**
  * Constructor de la clase Celda.
  */
  public Cell(){
   // inicia la celda como vacía.
   occupied = false;
  }

    /**
  * Método getter para obtener el atributo IsOccupied desde otras clases.
  */
  public boolean isOccupied(){
   return occupied;
  }
  
   /**
  * Método setter para cambiar el contenido del atributo IsOccupied desde otras clases.
  */
  public void changeOccupied(boolean cellStatus){
   this.occupied = cellStatus;
  }
  
  /**
  * Método getter para obtener el atributo parkedVehicle desde otras clases.
  */
  public Vehicle getParkedVehicle(){
   return parkedVehicle;
  }
  
  /**
  * Método para asignarle un vehículo a una celda para que quede parqueado.
  * @return un variable que dice si hay o no un vehículo en la celda. 
  */
  public void parkVehicle(Vehicle newVehicle){
   occupied = true;
   parkedVehicle = newVehicle;
  }
}
