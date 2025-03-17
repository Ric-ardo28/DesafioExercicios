package application;



import entities.Endereco;
import entities.Funcionario;
import entities.FuncionarioWriter;
import entities.Motorista;
import enums.CargoFuncionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Define a localidade padrão para os Estados Unidos (para uso de ponto em valores decimais)
		Locale.setDefault(Locale.US);

		// Cria um objeto Scanner para entrada de dados pelo console
		Scanner sc = new Scanner(System.in);

		// Lista para armazenar os funcionários cadastrados
		List<Funcionario> listaFuncionarios = new ArrayList<>();

		// Variável para manter o controle do ID único de funcionários
		int idFuncionario = 1;

		// Variável de controle para manter o loop do menu ativo
		boolean x = true;

		// Loop para exibição do menu e tratamento das opções escolhidas
		while (x) {
			// Exibição do menu principal
			System.out.println("---------------MENU---------------");
			System.out.println("1. Adicionar Funcionario");
			System.out.println("2. Atualizar Funcionario");
			System.out.println("3. Deletar Funcionario");
			System.out.println("4. Exibir Funcionario");
			System.out.println("5. Aumento Salarial");
			System.out.println("6. Sair");

			// Captura a opção escolhida pelo usuário
			switch (sc.nextInt()) {

				case 1: // Adicionar um funcionário
					sc.nextLine(); // Consome a quebra de linha após o número
					System.out.println("Digite o nome do funcionario: ");
					String nome = sc.nextLine(); // Entrada do nome

					System.out.println("Digite o cargo do funcionario: ");
					// Converte o cargo digitado para o formato do enum
					CargoFuncionario cargo = CargoFuncionario.valueOf(sc.nextLine().toUpperCase());

					// Obtém o salário baseado no cargo
					double salario = cargo.getSalario();

					// Entrada dos dados do endereço
					System.out.println("Digite o endereço do funcionario: ");
					System.out.println("Digite Rua: ");
					String rua = sc.nextLine();
					System.out.println("Digite Numero: ");
					int numero = sc.nextInt();
					sc.nextLine(); // Consome a quebra de linha
					System.out.println("Digite o Cep: ");
					String cep = sc.nextLine();
					System.out.println("Digite o  Bairro: ");
					String bairro = sc.nextLine();
					System.out.println("Digite o  Cidade: ");
					String cidade = sc.nextLine();
					System.out.println("Digite o  Estado: ");
					String estado = sc.nextLine();

					// Cria o objeto Endereço
					Endereco endereco = new Endereco(rua, numero, cep, bairro, cidade, estado);

					// Tratamento especial para motoristas
					if (cargo == CargoFuncionario.MOTORISTA) {
						System.out.println("Qual a categoria da CNH: ");
						String categoriaCnh = sc.nextLine();
						// Cria um motorista
						Motorista motorista = new Motorista(nome, cargo, salario, endereco, idFuncionario, categoriaCnh);
						listaFuncionarios.add(motorista); // Adiciona à lista
					} else {
						// Cria um funcionário genérico
						Funcionario funcionario = new Funcionario(nome, cargo, salario, endereco, idFuncionario);
						listaFuncionarios.add(funcionario); // Adiciona à lista

						// Salva o funcionário no arquivo
						FuncionarioWriter.salvarFuncionario(funcionario, "Funcionarios.txt");
					}

					System.out.println("Funcionario adicionado com sucesso!");
					idFuncionario++; // Incrementa o ID único
					break;

				case 2: // Atualizar informações de um funcionário
					System.out.println("Digite o ID funcionario para atualizar informações: ");
					int idAtualizar = sc.nextInt();
					sc.nextLine(); // Consome a quebra de linha

					// Busca o funcionário pelo ID
					Funcionario funcionarioAtualizado = listaFuncionarios.stream()
							.filter(f -> f.getIdFuncionario() == idAtualizar)
							.findFirst()
							.orElse(null); // Retorna null se não encontrar

					if (funcionarioAtualizado != null) {
						// Entrada das novas informações
						System.out.println("Digite o novo cargo do funcionario: ");
						String cargoAtualizado = sc.nextLine().toUpperCase();
						System.out.println("Digite o novo salario do funcionario: ");
						double salarioAtualizado = sc.nextDouble();
						sc.nextLine();

						// Atualiza os dados do funcionário
						funcionarioAtualizado.setSalario(salarioAtualizado);
						funcionarioAtualizado.setCargo(CargoFuncionario.valueOf(cargoAtualizado));

						// Atualiza o arquivo com os dados
						FuncionarioWriter.atualizarFuncionario(listaFuncionarios, "FuncionariosAt.txt");
						System.out.println("Funcionario atualizado com sucesso!");
					} else {
						System.out.println("Funcionario com ID " + idAtualizar + " não encontrado.");
					}
					break;

				case 3: // Deletar um funcionário
					System.out.println("Digite o ID do funcionario a ser deletado: ");
					int idRemover = sc.nextInt();
					sc.nextLine();

					// Remove o funcionário da lista pelo ID
					boolean removido = listaFuncionarios.removeIf(f -> f.getIdFuncionario() == idRemover);

					if (removido) {
						FuncionarioWriter.atualizarFuncionario(listaFuncionarios, "FuncionariosAt.txt");
						System.out.println("Funcionario removido com sucesso!");
					} else {
						System.out.println("Funcionario com ID " + idRemover + " não encontrado.");
					}
					break;

				case 4: // Exibir lista de funcionários
					System.out.println("Lista de Funcionarios: ");
					if (listaFuncionarios.isEmpty()) {
						System.out.println("Nenhum funcionario cadastrado.");
					} else {
						// Itera sobre a lista e exibe os dados de cada funcionário
						for (Funcionario f : listaFuncionarios) {
							System.out.println(f);
						}
					}
					break;

				case 5: // Aplicar reajuste salarial
					System.out.println("Digite o ID do funcionario a receber reajuste salarial: ");
					int idReajuste = sc.nextInt();
					sc.nextLine();

					// Busca o funcionário pelo ID
					Funcionario funcionarioReajuste = listaFuncionarios.stream()
							.filter(f -> f.getIdFuncionario() == idReajuste)
							.findFirst()
							.orElse(null);

					if (funcionarioReajuste != null) {
						System.out.println("Digite a porcentagem de reajuste salarial: % ");
						double porcentagem = sc.nextDouble();

						// Aplica o aumento de salário
						funcionarioReajuste.aumentarSalario(porcentagem);

						FuncionarioWriter.atualizarFuncionario(listaFuncionarios, "FuncionariosAt.txt");
						System.out.println("Reajuste aplicado! Novo salário: " + funcionarioReajuste.getSalario());
					} else {
						System.out.println("Funcionario com ID " + idReajuste + " não encontrado.");
					}
					break;

				case 6: // Sair do sistema
					x = false; // Termina o loop
					System.out.println("👋🏽 Saindo . . . . . . . ");
					break;

				default: // Opção inválida
					System.out.println("Entrada invalida ");
					break;
			}
		}

		// Fecha o Scanner
		sc.close();
	}
}

