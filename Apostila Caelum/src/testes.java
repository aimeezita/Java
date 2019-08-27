
public class testes {


public static void main(String[] args) {
	for (int i=0; i < 100; i++) {
		if (i>50 && i<60) {
			continue;
			}
	System.out.println(i);

	int numteste = 10;
	
	//System.out.println(numteste/0);
	//System.out.println(numteste/0.0);
	
	}
	
//	Programa 1
//
//    Classe: Pessoa
//    Atributos: nome, idade. 
//    Método: void fazAniversario()
//Crie uma pessoa, coloque seu nome e idade iniciais, faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade.
	
	
	Pessoa aimee = new Pessoa();
	
	aimee.nome = "Aimee";
	aimee.idade = 32;
	
	System.out.println(aimee.nome);
	aimee.fazAniversário();
	System.out.println(aimee.idade);
	
	

//Programa 2
//
//Classe: Porta
//Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
//Métodos: void abre()
//         void fecha() 
//         void pinta(String s)
//         boolean estaAberta()
//Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, 
	//altere suas dimensões e use o método estaAberta para verificar se ela está aberta.

	Porta porta1 = new Porta();
	porta1.dimensaoX = 40;
	porta1.dimensaoY= 100;
	porta1.dimensaoZ = 5;
	porta1.cor = "azul";
	
	porta1.abre();
	System.out.println(porta1.estaAberta());
	porta1.fecha();
	System.out.println(porta1.estaAberta());
	System.out.println(porta1.cor);
	
	
//Programa 3
//	Crie uma casa e pinte-a. Crie três portas e coloque-as na casa; 
//abra e feche as mesmas como desejar. Utilize o método quantasPortasEstaoAbertas
//para imprimir o número de portas abertas.
	
	Casa casa = new Casa();
	System.out.println(casa.cor);
	
	casa.pintaCasa("lilás");
	System.out.println(casa.cor);
	
	casa.porta2.fecha();
    System.out.println(casa.porta2.estaAberta());
    casa.portasAbertas();

}
}
