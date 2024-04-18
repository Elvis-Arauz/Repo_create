package libreria;

import java.util.Scanner;

public class Llfunciones {
	
	private int kilos=0, llenadoCompleto = 0, TipoDeRopa=0, LavadoCompleto = 0, secadoCompleto=0;
	//CREAR UN COSNTRUCTOR para enviar los argumentos
	public Llfunciones(int kilos, int TipoDeRopa) {
		this.kilos = kilos;
		this.TipoDeRopa = TipoDeRopa;
	}
	private void Llenado() {
		if(kilos <=12) {
			llenadoCompleto =1;
			System.out.println("Llenando");
			System.out.println("Llenado completo");
		}else{
			System.out.println("La carga de ropa es muy pesada, reduce la carga");
		}
		
	}
	private void Lavado() {
		//AQUI LE DECIMOS VEN MEYTODO DE LLENADO QUE TU SABES 
		//QIE SI ES VERDAD QUE ESTA LAVANDO
		Llenado();
		if(llenadoCompleto==1){
			if(TipoDeRopa ==1)
			System.out.println("Ropa blanca / Lavado suave");
			System.out.println("Lavando...");
			LavadoCompleto = 1;
			
			}else if(TipoDeRopa==2) {
				System.out.println("Ropa de volor/ Lavado intenso");
				System.out.println("Lavando...");
				
			}else {
				System.out.println("Rl tipo de ropa no esta disponible");
				System.out.println("Se lavara a color / lavado intenso ");
				LavadoCompleto =1;
			}
	}
		private void Secado() {
			Lavado();
			if(LavadoCompleto==1) {
				System.out.println("Secando...");
				secadoCompleto =1;
			}
		}
		public void cicloFinalizado() {
			Secado();
			if(secadoCompleto==1) {
				System.out.println("Tu ropa esta lista");
			}
		}
		
}

