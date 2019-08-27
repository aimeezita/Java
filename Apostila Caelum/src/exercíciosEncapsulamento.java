
public class exercíciosEncapsulamento {
	public static void main(String[] args) {
		
	

//1. Adicione o modificador de visibilidade (private, se necessário) para cada atributo e método da classe Conta. Tente criar uma Conta no main e modificar ou ler um de seus atributos privados. O que acontece?

//Resposta 1: Ao colocar os atributos E métodos como privados eles se tornam inacessíveis, tanto para le-los ou modificá-los.
		

//Crie apenas os getters e setters necessários da sua classe Conta. Pense sempre se é preciso criar cada um deles. Por exemplo:
	
//Modifique suas classes que acessam e modificam atributos de uma Conta para utilizar os getters e setters recém criados.

//		Por exemplo, onde você encontra:

//		     c.titular = "Batman";
//		     System.out.println(c.titular);
//		passa para:
//
//		     c.setTitular("Batman");
//		     System.out.println(c.getTitular());

//	Faça com que sua classe Conta possa receber, opcionalmente, o nome do titular da Conta durante a criação do objeto. Utilize construtores para obter esse resultado.
//
//		Dica: utilize um construtor sem argumentos também, para o caso de a pessoa não querer passar o titular da Conta.
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
//		Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional?
//Resposta: Precisamos do construtor sem argumentos porque senão se torna OBRIGATÓRIA a inserção do parâmetro, no caso, o nome do titular.

//		(opcional) Adicione um atributo na classe Conta de tipo int que se chama identificador. Esse identificador deve ter um valor único para cada instância do tipo Conta. A primeira Conta instanciada tem identificador 1, a segunda 2, e assim por diante. Você deve utilizar os recursos aprendidos aqui para resolver esse problema.
//
//		Crie um getter para o identificador. Devemos ter um setter?
//Rsposta: Não precisamos de um setter, pois não há razão para alterar o número de um contador.


//
//		(opcional) Suponha que temos a classe PessoaFisica que tem um CPF como atributo. Como garantir que pessoa física alguma tenha CPF invalido, nem seja criada PessoaFisica sem cpf inicial? (Suponha que já existe um algoritmo de validação de cpf: basta passar o cpf por um método valida(String x)...)
//Devemos colocar o algoritmo de validação de cpf no construtor.

		
		
		
		
	
	}
}
