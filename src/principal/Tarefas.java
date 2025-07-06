package principal;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
	private String tarefa;
	public ArrayList<String> tarefas = new ArrayList<>();
	
	public Tarefas() {
		this.tarefa = null;
	}
	
	public String getTarefa() {
		return this.tarefa;
	}
	
	public void setTarefa(String nova_tarefa) {
		this.tarefa = nova_tarefa;
	}
	
	public void adicionarTarefa (Scanner sc) {
		String tarefa_adicionada;
		
		System.out.println("Digite a tarefa que você gostaria de adicionar: ");
		tarefa_adicionada = sc.nextLine();
		
		tarefas.add(tarefa_adicionada);
		System.out.println("A tarefa foi adicionada com sucesso.");
	}
	
	public void mostrarTarefas () {
		for (int i = 0; i < tarefas.size(); i++) {
			System.out.println(i + 1 + " - " + tarefas.get(i));
		}
	}	
}
