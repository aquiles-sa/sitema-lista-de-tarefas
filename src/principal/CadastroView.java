package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroView {
	Scanner scan = new Scanner(System.in);
	
	public Cadastro realizarCadastro(Scanner sc) {
		String nome, senha;
		
		System.out.println("---------- CADASTRO APP TO-DO ----------\n");
		
		try {

			do {
				System.out.print("Digite o seu nome de usuário: ");
				nome = sc.nextLine().trim();
				
				System.out.print("Digite a sua senha: ");
				senha = sc.nextLine().trim();
				
				System.out.println();
				
			} while (nome.isEmpty() || senha.isEmpty()); 
			
			System.out.println("Cadastro realizado com sucesso!");
			System.out.println("Usuário " + nome + ".");
			
			return new Cadastro(nome, senha);
			
		} catch (InputMismatchException e) {
			System.out.println("Tipo de entrada inválido.");
		} catch (Exception e) {
			System.out.println("Erro: " + e);
		}
		
		return null;
	}
}
