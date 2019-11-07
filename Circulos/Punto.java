import lang.stride.*;

/**
 * 
 */
public class Punto
{
    private int y = 0;
    private int x = 0;

    /**
     * 
     */
    public Punto()
    {
        /* initialise instance variables*/
        x = 0;
        y = 0;
    }

    /**
     * 
     */
    public Punto(int parametro1, int parametro2)
    {
        x = parametro1;
        y = parametro2;
    }

    /**
     * 
     */
    public void muestra()
    {
        System.out.println("Centro(" + x + "," + y + ")");
    }
}
