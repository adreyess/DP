import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Clase para probar operaciones sobre las colecciones array y ArrayList.
 * 
 * @author Estudiantes DP
 * @version 1.0
 */
public class DemoBlucles
{
    private int[] numbers;                  //array de enteros
    private String[] cadenas;               //array de cadenas (String)
    private Persona[] personasEst;          //array de objetos de tipo Persona
    private ArrayList<Persona> personasDin; //ArrayList de objetos de tipo Persona

    /**
     * Constructor para objetos de la clase DemoBlucles
     */
    public DemoBlucles()
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
        numbers = new int[] {23, 19, 25, 19, 18};

        // Inicializar el array de cadenas
        cadenas = new String[] {"Juan", "Maria", "Antonio", "Jose", "Eva"};

        // Inicializar personasEst con el mismo tamaño que numbers
        personasEst = new Persona[numbers.length];

        // Inicializar el ArrayList vacío
        personasDin = new ArrayList<>();

        // Crear objetos Persona a partir de los arrays numbers y cadenas
        for (int i = 0; i < numbers.length; i++) {
            Persona p = new Persona(cadenas[i], numbers[i]);
            Persona p2 = new Persona(cadenas[i], numbers[i]);

            personasEst[i] = p;         // Guardar en el array
            personasDin.add(p2);         // Añadir al ArrayList
        }
    }

    /**
     * Método para probar recorridos con el bucle while en las distintas colecciones
     */
    public void recorridoWhile()
    {
        //recorrido con while de numbers
        System.out.println("Recorrido con while: ");
        System.out.println("Colección numbers: ");
        int i = 0;
        while(i < numbers.length) {
            System.out.println(numbers[i]);
            i++;
        }

        //TODO diferentes versiones de recorridos while para cada colección

    }

    /**
     * Método para probar recorridos con el bucle for en las distintas colecciones
     */
    public void recorridoFor()
    {
        //recorrido con for de numbers
        System.out.println("Recorrido con for: ");
        System.out.println("Colección numbers: ");
        for(int i=0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }

        //TODO diferentes versiones de recorridos for para cada colección
    }
    /**
     * Método para probar recorridos con el bucle for each en las distintas colecciones
     */
    public void recorridoForEach()
    {
        //recorrido con for each de numbers
        System.out.println("Recorrido con for each: ");
        System.out.println("Colección numbers: ");
        for (int i : numbers) {
            System.out.println(i);
        }   

        //TODO diferentes versiones de recorridos for each para cada colección

    }

    /**
     * Método para probar recorridos con el bucle while o for más Iterator en las distintas colecciones
     */
    public void recorridoIterator()
    {
        //TODO diferentes versiones de recorridos con Iterator para cada colección

    }

    /**
     * Método para borrar un elemento de las colecciones usando el bucle while
     */
    public void borrarElementoWhile()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando el elemento 19 del array numbers
        //Borrando el elemento "Antonio" del array cadenas
        //Borrando la persona con nombre "Antonio" de personasEst y personasDin

        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para borrar un elemento de las colecciones usando el bucle for
     */
    public void borrarElementoFor()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando el elemento 19 del array numbers
        //Borrando el elemento "Antonio" del array cadenas
        //Borrando la persona con nombre "Antonio" de personasEst y personasDin

        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para borrar un elemento de las colecciones usando el bucle for each
     */
    public void borrarElementoForEach()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando el elemento 19 del array numbers
        //Borrando el elemento "Antonio" del array cadenas
        //Borrando la persona con nombre "Antonio" de personasEst y personasDin

        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para borrar un elemento de las colecciones usando 
     * el bucle while o for más Iterator
     */
    public void borrarElementoIterator()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando el elemento 19 del array numbers
        //Borrando el elemento "Antonio" del array cadenas
        //Borrando la persona con nombre "Antonio" de personasEst y personasDin

        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para borrar varios elementos de las colecciones usando el bucle while
     */
    public void borrarVariosElementosWhile()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando todos los elementos 19 del array numbers
        //Borrando todas las cadenas que comiencen por "J" del array cadenas
        //Borrando la persona cuyo nombre comience por "J" de personasEst y personasDin
        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para borrar varios elementos de las colecciones usando el bucle for
     */
    public void borrarVariosElementosFor()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando todos los elementos 19 del array numbers
        //Borrando todas las cadenas que comiencen por "J" del array cadenas
        //Borrando la persona cuyo nombre comience por "J" de personasEst y personasDin
        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para borrar varios elementos de las colecciones usando el bucle for each
     */
    public void borrarVariosElementosForEach()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando todos los elementos 19 del array numbers
        //Borrando todas las cadenas que comiencen por "J" del array cadenas
        //Borrando la persona cuyo nombre comience por "J" de personasEst y personasDin
        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para borrar varios elementos de las colecciones usando 
     * el bucle while o for más Iterator
     */
    public void borrarVariosElementosIterator()
    {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones();

        //Borrando todos los elementos 19 del array numbers
        //Borrando todas las cadenas que comiencen por "J" del array cadenas
        //Borrando la persona cuyo nombre comience por "J" de personasEst y personasDin
        //TODO diferentes versiones de borrar para cada colección
    }

    /**
     * Método para modificar un elemento en personasDin usando un bucle for
     * Ejemplo: Cambia "Antonio" por "Antonia"
     */
    public void modificarElementoFor() {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones(); 

        //TODO: Cambiar "Antonio" por "Antonia"
    }

    /**
     * Método para modificar un elemento en personasDin usando un bucle for each
     * Ejemplo: Cambia "Antonio" por "Antonia"
     */
    public void modificarElementoForEach() {
        //iniciamos las colecciones con los valores iniciales
        reiniciarColecciones(); 

        //TODO: Cambiar "Antonio" por "Antonia"

    }

}
