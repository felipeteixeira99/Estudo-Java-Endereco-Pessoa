public class TestarPessoa {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa(); //instanciando um objeto do tipo Pessoa
		Endereco endereco = new Endereco(); //instanciando um objeto do tipo Endereco 
		
		//Verificar com o Danilo se está de acordo com o que pede no exercicio 
		
		pessoa.setNome("Felipe");
		pessoa.setIdade(23);
		pessoa.setAltura(1.83);
		
		pessoa.setEndereco(endereco);
	
		endereco.setRua("Rua Presidente");
		endereco.setNumero(1);
		endereco.setBairro("Jardim America");
		endereco.setCidade("Goiania");
		endereco.setEstado("Goias");
		
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Endereco " + endereco.getRua());
		
		//System.out.println(pessoa.getNome().getEndereco());
		
		System.out.println("Alteração nessa linha realizada pela a maquina que eu uso no trabalho...feita para teste");

	}

}
