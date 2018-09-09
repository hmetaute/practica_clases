
/**
* Representa un vehiculo que puede llenar una celda.
*/
public class Vehicle{
 // instance variables - replace the example below with your own
 private String numberPlate;
 private String color;
 private int model;
 private String brand;
 private int parkingTime;
 
  /**
  * Constructor for objects of class vehicle
  */
  public Vehicle(String numberPlate, String color, int model, String brand){
   this.numberPlate = numberPlate;
   this.color= color;
   this.model = model;
   this.brand = brand;
   this.parkingTime = 2;
  }

  /**
  * Método getter para obtener el atributo numberPlate desde otras clases.
  */
  public String getNumberPlate(){
   return numberPlate;
  }
  
  /**
  * Método getter para obtener el tiempo que el carro estuvo parqueado.
  */
  public int getParkingTime(){
   return parkingTime;
  }
}
