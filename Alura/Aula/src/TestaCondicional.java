
public class TestaCondicional {

	public static void main(String[] args) {
		System.out.println("testando condiocionais");

		int idade = 16;
		int quantidadePessoas = 3;
		if (idade >= 18)

		{
			System.out.println("Você é maior de idade.");
			System.out.println("Seja bem vindo");
		} else {
			if (quantidadePessoas >= 3) {
				System.out.println("Você não tem 18, mas está acompanhado.");
			}

			else {
				System.out.println("Infelizmente você não pode entrar");
			}
		}
	}
}
