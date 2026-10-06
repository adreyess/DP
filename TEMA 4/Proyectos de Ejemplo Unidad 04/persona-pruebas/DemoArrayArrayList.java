import java.util.ArrayList;
import java.util.Arrays;

/**
 * Clase para probar operaciones sobre las colecciones array y ArrayList.
 * 
 * @author Estudiantes DP
 * @version 1.0
 */
public class DemoArrayArrayList
{
    private int[] numbers = {23, 19, 25, 19, 18};  //array de enteros
    private String[] cadenas;               //array de cadenas (String)
    private Persona[] personasEst;          //array de objetos de tipo Persona
    private ArrayList<Persona> personasDin; //ArrayList de objetos de tipo Persona

    /**
     * Constructor para objetos de la clase DemoArrayArrayList
     */
    public DemoArrayArrayList()
    {
        //TODO crear los campos cadenas, personasEst y personasDin

    }

    /**
     * Método para insertar un elemento al final de la colección
     */
    public void insertar()
    {
        //Insertando elemento en el array numbers
        int nuevoNum = 30;
        numbers[numbers.length] = nuevoNum;  //Ojo!! ¿es correcta?
        
        //TODO diferentes versiones de insertar para cada colección

    }

    /**
     * Método para borrar un elemento de una posición determinada de la colección
     * @param pos posición del elemento que se va a eliminar
     */
    public void borrar(int pos)
    {
        //Borrando el elemento de la posición pos del array numbers
        numbers[pos] = 0;  //versión "sencilla"
        
        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para mostrar el elemento de la colección que hay en una posición determinadala
     * @param pos posición del elemento que se va a eliminar
     */
    public void mostrar(int pos)
    {
        //Mostrando el elemento de la posición pos del array numbers
        //Deberíamos comprobar antes si pos es una posición válida
        System.out.println("numbers[" + pos + "] = " + numbers[pos]);


        //TODO diferentes versiones de mostrar para cada colección
    }

    /**
     * Método para mostrar la información de los campos de la clase
     */
    public void showInfo()
    {
        //Mostrando array numbers
        for(int i=0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        
        //TODO diferentes versiones de mostrar la información de cada colección
        
    }
}
