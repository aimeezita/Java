
public class teste {
	public static void main(String[] args) {
		Cliente marcela = new Cliente();
		marcela.nome = "Marcela";
		marcela.cpf = "111.111.111-11";
		marcela.profissao = "Cabelereira";
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1500);
		contaDaMarcela.titular = marcela;
		
		
		
		
	}
	
}