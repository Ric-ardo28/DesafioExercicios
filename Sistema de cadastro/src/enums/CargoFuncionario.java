package enums;

public enum CargoFuncionario {
	GERENTE("Gerente Geral", "Gerente", 9000.00),
	SUPERVISOR("Supervisor de Patio", "Supervisor", 7000.00),
	CONFERENTE("Conferente de Carga", "Conferente", 5000.00),
	AJUDANTE("Ajudante de Armazem", "Ajudante", 3000.00),
	MOTORISTA("Motorista de entregas", "Motorista", 5500.00),;

	private String descricao;
	private String nome;
	private double salario;

	CargoFuncionario(String descricao, String nome, double salario) {
		this.descricao = descricao;
		this.nome = nome;
		this.salario = salario;
	}

	public String getDescricao() {
		return descricao;
	}

	public String getNome() {
		return nome;
	}

	public double getSalario() {
		return salario;
	}
}
