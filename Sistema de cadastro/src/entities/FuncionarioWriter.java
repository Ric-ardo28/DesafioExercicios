package entities;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FuncionarioWriter {
	public static void salvarFuncionario(Funcionario funcionario, String caminho) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
			bw.write(funcionario.toString());
			bw.newLine();
			System.out.println("Funcionario Salvo com sucesso!");

		}catch (IOException e){
			System.out.println("Erro ao Salvar funcionario" + e.getMessage());
		}

	}
	public static void atualizarFuncionario(List<Funcionario> listaFuncionario, String caminho) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
			for (Funcionario funcionario : listaFuncionario) {
				bw.write(funcionario.toString());
				bw.newLine();

			}
			System.out.println("Funcionario Atualizado com sucesso!");

		}catch (IOException e){
			System.out.println("Erro ao atualizar funcionario" + e.getMessage());
		}
	}
}
