
public class testeFuncionario {

	public static void main(String[] args) {
		Funcionario nico = new Funcionario();
		nico.setNome("Nico Steppat");
		nico.setCpf("111.222.111-22");
		nico.setSalario(2580);
		
System.out.println(nico.getNome());
System.out.println(nico.getCpf());
System.out.println(nico.getSalario());
System.out.println(nico.getBonificacao());
	}

}
