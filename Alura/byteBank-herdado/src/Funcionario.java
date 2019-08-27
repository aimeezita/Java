
public class Funcionario {
//Atributos
	private String nome;
	private String cpf;
	private double salario;
	
	
//	Getters and Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double valor) {
		this.salario = valor;
	}
	
	
//Métodos

	double getBonificacao() {
		return this.salario = salario * 0.1;
	}
	
	
	
	
}
