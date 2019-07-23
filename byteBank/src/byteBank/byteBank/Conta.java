package byteBank;

public class Conta {

	   double saldo;
	    int agencia;
	    int numero;
	   

// M�todos

	//Deposita
	public void deposita (double valor) {
		this.saldo += valor;
		
	}
	
	//Saca
	public boolean saca (double valor) {
		if(this.saldo >= valor) {
		this.saldo -= valor;
		return true;
		}
		
		else {
			return false;
		}
	
	}
	
	//Transfere
public boolean transfere(double valor, Conta destino) {
	if(this.saldo >= valor) {
		this.saldo -= valor;
		destino.deposita(valor);
		return true;
	} else {
		return false;
	}
	
}

}
