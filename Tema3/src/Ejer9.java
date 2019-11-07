public class Ejer9 {
	public static void main(String[] args) {
        Consumo c = new Consumo(100,10,100,1.5);
        c.Parametros();
        System.out.println("Tiempo " +c.getTiempo());
        System.out.println("Consumo medio " +c.consumoMedio());
        System.out.println("Consumo euros " +c.consumoEuros());  
    }   
}