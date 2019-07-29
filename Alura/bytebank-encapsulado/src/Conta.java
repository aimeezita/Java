

public class Conta {

	    private double saldo;
	    private int agencia;
	    private int numero;
	    private Cliente titular;

// Métodos

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
	
	//Pegar Saldo
	public double getSaldo() { 
        return this.saldo;
}
//Devolve (retorna) o número da conta
	 public int getNumero() { 
	        return this.numero;
	    }
//Altera o número da conta
	 public void setNumero(int novoNumero) { 
	        this.numero = novoNumero;
	    }

//Devolve (retorna) o número da agência
	 public int getAgencia() {
		 return this.agencia;
}
	 
//Coloca ou altera o número da agência
	 public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
// Define o titular da conta
	 
	 public void setTitular(Cliente titular) {
		 this.titular = titular;
	 }
//Devolve o nome do titular da conta
	 public Cliente getTitular() {
		 return this.titular;
	 }

}
