/**
 * Clase para definir objetos de tipo Persona.
 * Esta clase se utilizará en los ejercicios de las clases de teoría.
 * 
 * @author Estudiantes DP
 */
public class Persona
{

    private int edad;      // edad de la persona
    private String  nombre;      // nombre de la persona

    /**
     * Constructor para objetos de la clase Persona
     * @param nombre nombre del nuevo objeto creado
     */
    public Persona(String nombre)
    {
        edad = 19;
        this.nombre =nombre;
    }

    /**
     * Constructor para objetos de la clase Persona
     * @param nombre nombre del nuevo objeto creado
     * @param edad edad del nuevo objeto creado
     */
    public Persona(String nombre, int edad)
    {
        this.edad = edad;
        this.nombre =nombre;
    }

    /** 
     * Método que actualiza el nombre del objeto
     * @param n nuevo nombre del objeto
     */
    public void setName(String n )
    {
        nombre = n;
    }

    /** 
     * Método que devuelve el nombre del objeto
     * @return nombre del objeto
     */
    public String getName()
    {
        return   nombre;
    }

    /** 
     * Método que actualiza la edad del objeto
     * @param edad nueva edad del objeto
     */
    public void setEdad(int edad )
    {
        this.edad = edad;
    }

    /** 
     * Método que devuelve la edad del objeto
     * @return edad del objeto
     */
    public int getEdad()
    {
        return   edad;
    }

    /**
     * Método que devuelve una cadena formateada con la información de una persona.
     *  @return Cadena que describe a una persona.
     */
    @Override
    public String toString() {
        return "\nPersona: " + getName() + " " +getEdad();
    }

}