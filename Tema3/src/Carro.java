	
	public class Carro {
	
		private String marca;
		private String modelo;
		
		public Carro ()	{
			marca="";
			modelo="";
						}
		public Carro (String marc, String model) {
			marca=marc;
			modelo=model;
												 }
		
		public void marcaModelo() {
			
			System.out.println ("Marca:" +marca+ " Modelo:" +modelo);
			
		}
				
		
	}
