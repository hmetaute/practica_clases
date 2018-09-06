
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
    private int parkingLotCapacity; // Número de celdas del parqueadero
    private double precio; // Precio de la hora
    private Cell[] listOfCells; //Lista de celdas de mi parqueadero
     

    /**
     * Metodo contructor que sirve para crear un objeto de tipo de parqueadero.
     */
    public ParkingLot(int cellCapacity, double preciohora)
    {
        // asignacion de valores a los atributos del parqueadero
      this.precio = preciohora;
      this.parkingLotCapacity = cellCapacity;
      listOfCells = new Cell[parkingLotCapacity];//necesito crear el arreglo antes de utilizarlo en el For..
     for (int i=0; i<parkingLotCapacity; i++){ 
      listOfCells[i]= new Cell();
      }
    }   
    
    
    /**
     * Metodo para saber cuántas celdas están vacías.
     *
     * @return el número de celdas vacías en el parqueadero.
     */
    public int emptyCells()
    {
     int emptyCells = 0;
    for (int i=0; i<parkingLotCapacity; i++){
    boolean estaOcupada = listOfCells[i].isOccupied();
    if (estaOcupada == false){ // un solo igual (=) asigna un valor a una variable y dos iguales (==) 
        //pregunta si dos valores son iguales y siempre retorna tru o false.
        emptyCells++;
        }
    }
    return emptyCells;
    }  

    
    /**
     * Metodo para saber cuál es la próxima celda vacía dentro del parquadero.
     *
     * @return la posición de la primera celda vacía que encuentre en el parqueadero o -1 si no encuentra celdas disponibles.
     */
    public int nextAvailableCell(){
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
     *
     * @return false si no parquea ningún vehículo en una celda.
     */
        public boolean parkVehicle (Vehicle newVehicle){   
        int parkingSpot = nextAvailableCell();
        boolean parkVehicle = false;
        if (parkingSpot!=-1){
        listOfCells[parkingSpot].parkVehicle(newVehicle);
        parkVehicle = true;}
        return parkVehicle;
        }
       
 }
    
   

