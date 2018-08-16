import java.util.*;
/**
 * Representa la ubicación de un espacio en un parqueadero en el que se puede
 * dejar un vehículo.
 *
 * @author Lilo
 * @version 0.0.0.0.0.0.1
 */
public class Celda
{
    // instance variables - replace the example below with your own
    private boolean ocupado;

    /**
     * Constructor for objects of class Celda
     */
    public Celda()
    {
        // initialise instance variables
        ocupado = false;
    }

    /**
     * Metodo para saber si una celda esta ocupada.
     *
     * @return    un variable que dice si hay o no un vehiculo en la celda. 
     */
    public boolean estaOcupada()
    {
        // put your code here
        return ocupado;
    }
    
    public List<String> splitWithEmpty(String param) {
        return Arrays.asList(param.split(","));
    }
}
