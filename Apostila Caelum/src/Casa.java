
public class Casa {
	
//Atributos
	
	String cor = "Branca";
	Porta porta1 = new Porta ();
	Porta porta2 = new Porta ();
	Porta porta3 = new Porta ();
	static int portaAberta = 0;
//Métodos
	
	void pintaCasa(String cor) {
		this.cor = cor;
	}
	
	void portasAbertas() {
		
		if(Porta.aberta == true) {
			portaAberta++;
		}
	System.out.println(portaAberta);
		
	}
	
	

}
