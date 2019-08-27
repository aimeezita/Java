
public class Porta {

//	Atritbutos
	static boolean aberta;
	int dimensaoX = 40;
	int dimensaoY = 100;
	int dimensaoZ = 5;
	String cor = "Branca";
	


//	Métodos
	
	void abre() {
		 aberta = true;
	}
	
	void fecha() {
		aberta = false;
	}
	
	void pinta(String newCor) {
		cor = newCor;
	}
	
	boolean estaAberta() {
		if ( aberta == true) {
			return (true) ;
		
		}
		return aberta;
		
	}
}



