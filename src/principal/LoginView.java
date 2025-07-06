package principal;

import java.util.Scanner;

public class LoginView {
	public boolean realizarLogin(Scanner sc, Cadastro cadastro) {
		System.out.println("---------- LOGIN APP TO-DO ----------\n");
		
		System.out.print("Digite o nome de usuário: ");
		String nome_digitado = sc.nextLine();
		
		System.out.print("Digite a senha: ");
		String senha_digitada = sc.nextLine();
		
		if (cadastro == null) {
			System.out.println("Não há usuário logado. Faça o cadastro primeiro.");
			return false;
		}
		
		if (nome_digitado.equals(cadastro.getNome()) && senha_digitada.equals(cadastro.getSenha())) {
			System.out.println("Usuário " + nome_digitado + " logado com sucesso!");
			return true;
		} else {
			System.out.println("Nome de usuário ou senha estão incorretos!");
			return false;
		}
		
	}
}
