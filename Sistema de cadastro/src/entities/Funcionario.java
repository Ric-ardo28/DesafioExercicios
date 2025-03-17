package entities;


import enums.CargoFuncionario;

public class Funcionario implements Imposto {
	private String nome;
	private CargoFuncionario cargo;
	private Double salario;
	private Endereco endereco;
	private Integer idFuncionario;

	public Funcionario(String nome, CargoFuncionario cargo, Double salario, Endereco endereco, Integer idFuncionario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
		this.endereco = endereco;
		this.idFuncionario = idFuncionario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public CargoFuncionario getCargo() {
		return cargo;
	}

	public void setCargo(CargoFuncionario cargo) {
		this.cargo = cargo;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setIdFuncionario(Integer idFuncionario) {
		this.idFuncionario = idFuncionario;
	}

	public void aumentarSalario(double porc) {
		salario += salario * porc / 100.0;
	}

	public double calcularImpostoInss(double salario) {
		double desconto = 0.0;
		if (salario <= 1518.00) {
			desconto = salario * 0.075;
		} else if (salario <= 2793.88) {
			desconto = salario * 0.09;
		} else if (salario <= 4190.83) {
			desconto = salario * 0.12;
		} else if (salario <= 8157.41) {
			desconto = salario * 0.14;
		} else {
			desconto = 8157.41 * 0.14; // Teto do INSS
		}
		return desconto;
	}
	public double getDesconto() {
		return calcularImpostoInss(salario);
	}



	@Override
	public String toString() {
		return "Funcionario: \n" +
				"Nome: " + nome + "\n" +
				"Cargo: " + cargo.getNome() + "\n" +
				"Descrição: " + cargo.getDescricao() + "\n" +
				"Salario Bruto: " + salario + "\n" +
				"Salario Liguido: R$ " + String.format("%.2f", salario - calcularImpostoInss(salario)) + "\n" +
				"Desconto inss: " + String.format("%.2f", getDesconto()) + "\n" +
				"Endereço: " + endereco + "\n" +
				"Id: " + idFuncionario + "\n" ;



	}
}
