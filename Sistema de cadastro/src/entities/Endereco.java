package entities;

public class Endereco {
	private String rua;
	private int numero;
	private String cep;
	private String bairro;
	private String cidade;
	private String estado;

	public Endereco(String rua, int numero, String cep, String bairro, String cidade, String estado) {
		this.rua = rua;
		this.numero = numero;
		this.cep = cep;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	@Override
	public String toString() {
		return " rua: " + rua + '\n' +
				" numero: " + numero + '\n' +
				" cep: " + cep + '\n' +
				" bairro: " + bairro + '\n' +
				" cidade: " + cidade + '\n' +
				" estado: " + estado + '\n';
	}
}

