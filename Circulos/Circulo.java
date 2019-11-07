
/**
 * 
 * 
 * @author Charlie Soto
 * @version 06/11/2019
 */
public class Circulo{
    private Punto centro=null;
    private double radio=0;
    private int area=0;
       public Circulo(){
        centro=new Punto();
        radio = 2;
    }
       public Circulo (Punto parametro1, double parametro2){
        centro=parametro1;
        radio=parametro2;
    }
    public void muestra(){ 
        centro.muestra();
        System.out.println("Radio="+radio);
        
    }    
     public void area(){ 
         double area=radio*Math.PI;
         
        }
    
    
}
