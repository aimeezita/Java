//N�o funciona mais pois os atributos se tornaram privados
public class TestaContaEstouro2 {
    public static void main(String[] args) {
        Conta minhaConta = new Conta();
        minhaConta.saldo = -200; //saldo est� abaixo de 0
    }
}