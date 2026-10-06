import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;

/**
 * Clase para probar operaciones sobre las colecciones array y ArrayList.
 * 
 * @author Estudiantes DP
 * @version 1.0
 */
public class DemoComparadores
{
    private ArrayList<Persona> personasDin; //ArrayList de objetos de tipo Persona

    /**
     * Constructor para objetos de la clase DemoComparadores
     */
    public DemoComparadores()
    {
        //crear e iniciamos los campos numbers, cadenas, personasEst y personasDin
        reiniciarColecciones ();
    }

    /**
     * Método para reiniciar las colecciones. En este caso es necesario porque 
     * vamos a eliminar elementos en distintos métodos y así partimos siempre 
     * en cada método de los datos inicializados
     */
    private void reiniciarColecciones () {
        // Inicializar el array de números
        int[] numbers = new int[] {23, 19, 25, 19, 18};

        // Inicializar el array de cadenas
        String[] cadenas = new String[] {"Juan", "Maria", "Antonio", "Jose", "Eva"};

        // Inicializar el ArrayList vacío
        personasDin = new ArrayList<>();

        // Crear objetos Persona a partir de los arrays numbers y cadenas
        for (int i = 0; i < numbers.length; i++) {
            Persona p = new Persona(cadenas[i], numbers[i]);
            personasDin.add(p);         // Añadir al ArrayList
        }
    }

    /**
     * Método para probar el orden por el nombre ascendente en la colección personasDin
     */
    public void personasOrdenNombreCheck ()
    {
        reiniciarColecciones ();
        //TODO: ordenar la colección personasDin utilizando el comparador NombreComparator 

        //TODO: mostrar la colección ordenada
    }

    /**
     * Método para probar el orden por la edad ascendente y en caso de empate 
     * por el nombre en la colección personasDin
     */
    public void personasOrdenEdadCheck  ()
    {
        reiniciarColecciones ();
        //TODO: ordenar la colección personasDin utilizando el comparador EdadComparator 

        //TODO: mostrar la colección ordenada
    }

    /**
     * Método para mostrar todas las personas de la colección personasDin
     */
    public void mostrarPersonasLambda()
    {
        for(Persona p: personasDin) {
            System.out.println("Persona: "+ p);
        }

        //TODO: utiliza una expresión lambda equivalente
    }

    /**
     * Método para obtener la suma de todas las edades de las personas de la colección personasDin
     */
    public void sumaEdadesLambda()
    {
        int total = 0;
        for(Persona p: personasDin) {
            total+=p.getEdad();
        }
        System.out.println("Total: "+ total);

        //TODO: utiliza Streams y expresiones lambda equivalentes
    }

    /**
     * Método para mostrar las personas de la colección personasDin que tienen más de 20 años
     */
    public void muestraMayoresDe20Lambda()
    {
        for(Persona p: personasDin) {
            if(p.getEdad() > 20) 
                System.out.println(p);
        }

        //TODO: utiliza Streams y expresiones lambda equivalentes
    }
}
