
public class ConsumoDos {
	private double kms;
	private double litros;
	private double vmd;
	private double prgas;
	
	 ConsumoDos (double km , double li,double v,double pg) {
		kms=km;
		litros=li;
		vmd=v;
		prgas=pg;

	 }
	 
	 public double getTiempo() {
		 return kms/vmd;
	 }
	 public double consumoMedio(){
		 return litros/kms*120;
	 }
		 
	 public double consumoEuros(){
		 return consumoMedio()*prgas;
	 }
	 
	 public void setKms (double km) {
		 kms=km;
		 
	 }
	 public void setLitros (double li) {
		 litros=li;
		 
	 }
	 public void setVmd(double v) {
		  vmd = v;
		 
	 }
	 public void setPgas(double pg) {
		  prgas= pg;
		 
	 }
 
}






