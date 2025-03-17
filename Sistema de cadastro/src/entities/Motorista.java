package entities;


import enums.CargoFuncionario;

public class Motorista extends Funcionario{
	private String categoriaCnh;

	public Motorista(String nome, CargoFuncionario cargo, Double salario, Endereco endereco, Integer idFuncionario, String categoriaCnh) {
		super(nome, cargo, salario, endereco, idFuncionario);
		this.categoriaCnh = categoriaCnh;
	}
}
