//N�o funciona mais pois os atributos se tornaram privados
class TestaContaEstouro3 {

    public static void main(String[] args) {
        // a Conta
        Conta minhaConta = new Conta();
        minhaConta.saldo = 100;

        // quero mudar o saldo para -200
        double novoSaldo = -200;

        // testa se o novoSaldo � v�lido
        if (novoSaldo < 0) { // 
            System.out.println("N�o posso mudar para esse saldo");
        } else {
            minhaConta.saldo = novoSaldo;
        }
    }
}