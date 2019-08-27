
	public class TesteValores {
	public static void main(String[] args) {
	
		Conta conta = new Conta(1337, 2426);
	
		//A conta está inconsistente em relação às regras estabelecidas, pois o valor default é 0
//	conta.setAgencia(330);
//	conta.setNumero(-330);
//		System.out.println(conta.getNumero());
		
		Conta conta2 = new Conta (1337, 16549);	
		
		System.out.println(Conta.getTotal());
	}
	
	
	}
