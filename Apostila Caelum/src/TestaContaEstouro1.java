//Não funciona mais pois os atributos se tornaram privados
public class TestaContaEstouro1 {

	public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.saldo = 1000.0;
        minhaConta.saca(50000); // saldo é só 1000!!
    }
}
