
public class Gerente extends Funcionario{
//Atributos
	private int senha;

	
	

	public void setSenha(int senha) {
		this.senha = senha;
	}


//M�todos
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
 
	
	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
}
