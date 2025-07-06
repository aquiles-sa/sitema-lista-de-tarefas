package principal;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CadastroView view = new CadastroView();
		LoginView loginView = new LoginView();
		
		Cadastro cadastro = view.realizarCadastro(scan);
		boolean login_efetizado = loginView.realizarLogin(scan, cadastro); 
		
		Tarefas tarefas = new Tarefas();
	
		if (login_efetizado) {
			System.out.println("Acesso ao sistema permitido!");
			imprimirMenu(scan, cadastro, tarefas);
			
		} else {
			System.out.println("Acesso negado.");
		}

	}
	
	public static void imprimirMenu(Scanner sc, Cadastro cadastro, Tarefas tarefas) {
		int opcao = 0;
		
		while(opcao != 6) {
			System.out.println("-------- MENU " + cadastro.getNome() + " --------");
			System.out.println("1 - Mostrar lista completa.");
			System.out.println("2 - Adicionar nova tarefa.");
			System.out.println("3 - Editar tarefa.");
			System.out.println("4 - Excluir tarefa.");
			System.out.println("5 - Limpar lista.");
			System.out.println("6 - Sair. \n");
			
			opcao = sc.nextInt();
			sc.nextLine();
			
			switch (opcao) {
				case 1: {
					tarefas.mostrarTarefas();
					break;
				}
				
				case 2: 
					tarefas.adicionarTarefa(sc);
					break;
				
				case 6:
					System.out.println("Programa encerrado.");
					break;
				default:
					throw new IllegalArgumentException("Opção inválida: " + opcao);
			}
			
		};
		
	}
}
