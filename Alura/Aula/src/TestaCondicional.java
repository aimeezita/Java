
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condiocionais");

		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18)

		{
			System.out.println("Voc� � maior de idade.");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 3) {
				System.out.println("Voc� n�o tem 18, mas est� acompanhado.");
			}

			else {
				System.out.println("Infelizmente voc� n�o pode entrar");
			}
		}
	}
}
