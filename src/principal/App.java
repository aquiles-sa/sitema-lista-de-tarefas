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
			tarefas.adicionarTarefa(scan);
			tarefas.mostrarTarefas();
			
		} else {
			System.out.println("Acesso negado.");
		}
	}

}
