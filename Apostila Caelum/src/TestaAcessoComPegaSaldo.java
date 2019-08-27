
public class TestaAcessoComPegaSaldo {
public static void main(String[] args) {
	Conta minhaConta = new Conta("Luana"); //Fui obrigada a colocar um nome para o titular da conta após a criação do construtor
		minhaConta.deposita(1000);
	
	System.out.println("Saldo: " + minhaConta.getSaldo());
}
}
