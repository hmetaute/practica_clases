import java.util.*;
/**
 * Esta es la Clase que representa un parqueadero.
 * La Clase tiene hasta aora 3 atributos: capacidad, precio y lista de celdas.
 */
public class ParkingLot{
 // Atributos de la clase Parqueadero
  private int parkingLotCapacity; // Número total de celdas del parqueadero
  private double precio; // Precio de la hora
  private Cell[] listOfCells; //Lista de celdas de mi parqueadero
     
    /**
     * Este es el Método contructor que sirve para crear un objeto de tipo de parqueadero. Si no se crean
     los objetos en el constructor puede aparecer un error Null pointer exception.
     */
    public ParkingLot(int cellCapacity, double preciohora){
     // asignacion de valores a los atributos del parqueadero
     this.precio = preciohora;
     this.parkingLotCapacity = cellCapacity;
     listOfCells = new Cell[parkingLotCapacity];//Necesito crear el arreglo antes de utilizarlo en el For..
      for (int i=0; i<parkingLotCapacity; i++){ 
       listOfCells[i]= new Cell();
      }
    }   
    
    /**
     * Metodo para saber cuántas celdas están vacías.
     * @return el número de celdas vacías en el parqueadero.
     */
    public int GetEmptyCells(){
     int emptyCells = 0;
      for (int i=0; i<parkingLotCapacity; i++){
      boolean estaOcupada = listOfCells[i].isOccupied();
       if (estaOcupada == false){ // un solo igual (=) asigna un valor a una variable. 
                                  //Dos iguales (==)pregunta si dos valores son iguales. Retorna true o false.
        emptyCells++;
       }
     }
     return emptyCells;
    }  

    /**
     * Metodo para saber cuál es la próxima celda vacía dentro del parquadero.
     * @return la posición de la primera celda vacía que encuentra o -1 si no hay celdas vacías.
     */
    public int getNextAvailableCell(){
     int nextAvailableCell = -1;
     int i = 0;
     boolean encontreVacia = false;
     while (encontreVacia == false && i<parkingLotCapacity){
      boolean estaOcupada = listOfCells[i].isOccupied();
       if (estaOcupada == false){
         encontreVacia = true;
         nextAvailableCell = i;
      }
      i++;
     }
     return nextAvailableCell;
    }
    
    /**
    * Metodo que permite parquear un vehículo en una celda disponible.
    * @return false si no parquea ningún vehículo en una celda cuando el parqueadero está lleno.
    */
    public boolean parkVehicle (Vehicle newVehicle){   
     int emptyParkingSpot = getNextAvailableCell();
     boolean parkVehicle = false;
      if (emptyParkingSpot!=-1){
       listOfCells[emptyParkingSpot].parkVehicle(newVehicle);
       parkVehicle = true;
      }
      return parkVehicle;
     }
      
     /**
     * Metodo que permite encontrar la celda dónde está un vehículo parqueado.
     * @return un entero con la posición de la celda donde está parqueado o -1 si no encentra el vehículo.
     */
     public int findParkedVehicle(Vehicle newVehicle){
     Vehicle parkedVehicleToFind = newVehicle;
     String parkedVehiclePlate = parkedVehicleToFind.getNumberPlate();
     int spotPosition = -1;
     int i = 0;
     boolean estaOcupada = true;
       while (estaOcupada == true && i < parkingLotCapacity){
        boolean tieneCarro = listOfCells[i].isOccupied();
         if(tieneCarro==true){
           Vehicle parkedVehicle = listOfCells[i].getParkedVehicle();
           if(parkedVehicle.getNumberPlate().equals(parkedVehiclePlate)){
            estaOcupada = false;
            spotPosition = i;
           }  
         }
        i++;
       }
       return spotPosition;
    }
    
    /**
     * Metodo que permite sacar un carro del parqueadero para dejar la celda vacía.
     * @return un entero con el número de horas que estuvo parqueado el carro y deja la celda vacía.
     */
    public int removeVehicle (Vehicle newVehicle){
     Vehicle vehicleToRemove = newVehicle;
     int occupiedSpot = findParkedVehicle(vehicleToRemove);
     int parkingTime =  0;
     if (occupiedSpot != -1){
     listOfCells[occupiedSpot].changeOccupied(false);
     parkingTime = vehicleToRemove.getParkingTime();
     }
     else{
     parkingTime = -1;
    }
    return parkingTime;
   } 
} 