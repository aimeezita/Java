package byteBank;
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);

		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		
	Conta contaDaMarcela = new Conta();
	contaDaMarcela.deposita(1000);
	
	
//	Transferir dinheiro da Marcela para o Paulo
	
	if(contaDaMarcela.transfere(3000, contaDoPaulo)) {
		System.out.println("Transfer�ncia feita com sucesso");
	}else {
		System.out.println("Saldo em conta insuficiente");
	}
	
		System.out.println(contaDoPaulo.saldo);
		System.out.println(contaDaMarcela.saldo);
	}

//	contaDoPaulo.titular = "Paulo Silveira";
//	System.out.println(contaDoPaulo.Titular);
	
	
	
}