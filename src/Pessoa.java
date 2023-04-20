public class Pessoa {
	
	private int idade;
	private double altura;
	private Endereco endereco;  //cria um atributo do tipo Endereco
	private String nome;
	
	
	//teste
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco chamaEndereco) {
		this.endereco = chamaEndereco;
	}
	
}
