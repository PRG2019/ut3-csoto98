

public class Consumo {

	private double kms;
	private double litros;
	private double vm;
	private double preciogs;
	
	
	 Consumo (double km , double li,double vmd,double pregas) {
		kms=km;
		litros=li;
		vm=vmd;
		preciogs=pregas;
		
	 														}
	 public double getTiempo() {
		 return kms/vm;
		 
	 				 			}
	 
	 public double consumoMedio() {
		 return litros/kms*120;
	 							}
		 
	 public double consumoEuros() {
		 return consumoMedio()*preciogs;
		 
		 
	 }
	public void Parametros() {
		System.out.println("Km recorridos: " +kms);
		System.out.println("Combustible consumido: " +litros);
		System.out.println( "Velocidad media: " +vm);
		System.out.println("Precio gasolina: " +preciogs);
		
		
	}
	 
}
