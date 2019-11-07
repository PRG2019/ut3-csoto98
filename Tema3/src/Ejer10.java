import java.util.*;
public class Ejer10 {
	public static void main (String [] args) {
		Scanner opcion = new Scanner (System.in);
		int km,li,v,pg;
	
		System.out.println("Dame los kilometros ");
		km=opcion.nextInt();
		System.out.println("Dame el combustible ");
		li=opcion.nextInt();
		System.out.println("Dame la velocidad media... ");
		v=opcion.nextInt();
		System.out.println("€€ Dame el precio de la gasolina €€ ");
		pg=opcion.nextInt();
		
		ConsumoDos b = new ConsumoDos(km,li,v,pg);
		 System.out.println("Tiempo " +b.getTiempo());
	     System.out.println("Consumo medio " +b.consumoMedio());
	     System.out.println("Consumo euros " +b.consumoEuros()); 
		
		
		
		
	}
	
	
	
}
