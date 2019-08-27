
public class Conta {

	String titular;
    private int numero;
    private double saldo;
    static int identificador = 0;
    
    //Construtor
    
    public Conta(String titular) {
    	this.titular = titular;
    	identificador++;
    	
    	System.out.println("J� foram criadas um total de " + identificador + " contas.");
    	
    }
    
    
    // M�todos

    void deposita(double valor) {
    this.saldo = this.saldo + valor;	
    }
    
    void saca(double valor) {
        this.saldo = this.saldo - valor; 
    }

    //Retorna Saldo
    public double getSaldo() {
    	return this.saldo;
    }

    //Muda saldo
    public void setSaldo(double saldo) {
    	this.saldo = saldo;
    	
    }
    
//  Retorna Titular
    public String getTitular() {
    	return this.titular;
    	
    }
    
// Altera Titular
    public void setTitular(String newTitular) {
    	this.titular = newTitular;
    }

//Pega o n�mero da conta
	public int getNumero() {
		return numero;
	}

	
//Altera o n�mero da conta
	public void setNumero(int numero) {
		this.numero = numero;
	}
 

}
