
public class TestarEndereco {

	public static void main(String[] args) {

		Endereco endereco = new Endereco();
		endereco.setRua("Rua Presidente");
		endereco.setNumero(1);
		endereco.setBairro("Jardim America");
		endereco.setCidade("Goiania");
		endereco.setEstado("Goias");
		
		//System.out.println("Mostrando na tela o endereco completo");
		System.out.println(
				endereco.getRua()
				+ " " + endereco.getNumero()
				+ " " + endereco.getBairro()
				+ " " + endereco.getCidade()
				+ " " + endereco.getEstado());
		
		System.out.println("Alteracao teste");
		
	}

}
