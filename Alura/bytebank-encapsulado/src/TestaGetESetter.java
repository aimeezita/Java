
public class TestaGetESetter {
public static void main (String[] args) {
	Conta conta = new Conta(1337,24226);
    
	//*A partir do momento que foram definidos os construtores, a necessidade de atribuir
	//um valor para ag�ncia atrav�s do m�todo setNumero ao cri�-la torna-se desnecess�ria.
	
	//conta.setNumero(1337);
    
	System.out.println(conta.getNumero());

    Cliente paulo = new Cliente ();
    paulo.setNome("Paulo Silveira");
    paulo.setCpf("222.222.222-22");
    paulo.setProfissao("Programador");
    
    conta.setTitular(paulo);
   System.out.println(conta.getTitular().getNome());
}
}
