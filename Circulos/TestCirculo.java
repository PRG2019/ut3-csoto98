
/**
 * Write a description of class TestCirculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TestCirculo
{
    public static void main(String[] args)
    {
        Punto pun = new Punto(2,2);
        Circulo circulo = new Circulo(pun, 1);
        Circulo circulo2 = new Circulo();
        
        circulo2.muestra();
        circulo.muestra();
    }
    
    
}
  
