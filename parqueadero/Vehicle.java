
/**
* Representa un vehiculo que puede llenar una celda.
*/
public class Vehicle{
 // instance variables - replace the example below with your own
 private String numberPlate;
 private String color;
 private int model;
 private String brand;
 private int startParkingTime; //cambiar por formato de horas.
 
  /**
  * Constructor de la clase vehículo
  */
  public Vehicle(String numberPlate, String color, int model, String brand){
   this.numberPlate = numberPlate;
   this.color= color;
   this.model = model;
   this.brand = brand;
   this.startParkingTime = 1;
  }

  /**
  * Método getter para obtener el atributo numberPlate desde otras clases.
  */
  public String getNumberPlate(){
   return numberPlate;
  }
  
  /**
  * Método getter para obtener a qué horas entró el vehículo al parqueadero.
  */
  public int getStartParkingTime(){ //cambiar por formato de horas.
   int startParkingTime = 1; //cambiar por formato de horas y poner una variable.
   return startParkingTime;
  }
  
  /**
  * Método getter para obtener a qué horas salió el vehículo del parqueadero
  */
  public int getEndParkingTime(){ //cambiar por formato de horas.
   int endParkingTime = 5; //cambiar por formato de horas y poner una variable.
   return endParkingTime;
  }
  
}
  
