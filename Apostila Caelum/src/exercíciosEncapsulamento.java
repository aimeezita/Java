
public class exerc�ciosEncapsulamento {
	public static void main(String[] args) {
		
	

//1. Adicione o modificador de visibilidade (private, se necess�rio) para cada atributo e m�todo da classe Conta. Tente criar uma Conta no main e modificar ou ler um de seus atributos privados. O que acontece?

//Resposta 1: Ao colocar os atributos E m�todos como privados eles se tornam inacess�veis, tanto para le-los ou modific�-los.
		

//Crie apenas os getters e setters necess�rios da sua classe Conta. Pense sempre se � preciso criar cada um deles. Por exemplo:
	
//Modifique suas classes que acessam e modificam atributos de uma Conta para utilizar os getters e setters rec�m criados.

//		Por exemplo, onde voc� encontra:

//		     c.titular = "Batman";
//		     System.out.println(c.titular);
//		passa para:
//
//		     c.setTitular("Batman");
//		     System.out.println(c.getTitular());

//	Fa�a com que sua classe Conta possa receber, opcionalmente, o nome do titular da Conta durante a cria��o do objeto. Utilize construtores para obter esse resultado.
//
//		Dica: utilize um construtor sem argumentos tamb�m, para o caso de a pessoa n�o querer passar o titular da Conta.
//
//		Seria algo como:
//
//		     class Conta {
//		         public Conta() {
//		             // construtor sem argumentos
//		         }
//
//		         public Conta(String titular) {
//		             // construtor que recebe o titular
//		         }
//		     }
//		Por que voc� precisa do construtor sem argumentos para que a passagem do nome seja opcional?
//Resposta: Precisamos do construtor sem argumentos porque sen�o se torna OBRIGAT�RIA a inser��o do par�metro, no caso, o nome do titular.

//		(opcional) Adicione um atributo na classe Conta de tipo int que se chama identificador. Esse identificador deve ter um valor �nico para cada inst�ncia do tipo Conta. A primeira Conta instanciada tem identificador 1, a segunda 2, e assim por diante. Voc� deve utilizar os recursos aprendidos aqui para resolver esse problema.
//
//		Crie um getter para o identificador. Devemos ter um setter?
//Rsposta: N�o precisamos de um setter, pois n�o h� raz�o para alterar o n�mero de um contador.


//
//		(opcional) Suponha que temos a classe PessoaFisica que tem um CPF como atributo. Como garantir que pessoa f�sica alguma tenha CPF invalido, nem seja criada PessoaFisica sem cpf inicial? (Suponha que j� existe um algoritmo de valida��o de cpf: basta passar o cpf por um m�todo valida(String x)...)
//Devemos colocar o algoritmo de valida��o de cpf no construtor.

		
		
		
		
	
	}
}
