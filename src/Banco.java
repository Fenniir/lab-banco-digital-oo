import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	public void mostrarContas() {
		System.out.println(contas);
	}

	@Override
	public String toString() {
		return "[nome= " + nome + ", conta= " + contas + "]  ";
	}

	

}
