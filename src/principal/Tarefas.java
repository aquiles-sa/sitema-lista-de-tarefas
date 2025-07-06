package principal;
import java.util.ArrayList;
import java.util.Scanner;

public class Tarefas {
	private String tarefa;
	private ArrayList<String> tarefas = new ArrayList<>();
	
	public Tarefas() {
		this.tarefa = null;
	}
	
	public String getTarefa() {
		return this.tarefa;
	}
	
	public void setTarefa(String nova_tarefa) {
		this.tarefa = nova_tarefa;
	}
	
	public void mostrarTarefas () {
		for (int i = 0; i < tarefas.size(); i++) {
			System.out.println(i + 1 + " - " + tarefas.get(i));
		}
	}
	
	public void adicionarTarefa (Scanner sc) {
		String tarefa_adicionada;
		
		System.out.println("Digite a tarefa que você gostaria de adicionar: ");
		tarefa_adicionada = sc.nextLine();
		
		tarefas.add(tarefa_adicionada);
		System.out.println("A tarefa foi adicionada com sucesso.");
	}
	
	public void editarTarefa (Scanner sc) {
		int tarefa_a_ser_editada;
		String tarefa_atualizada;
		
		System.out.print("Digite o índice da tarefa a ser editada: ");
		tarefa_a_ser_editada = sc.nextInt();
		sc.nextLine();
		System.out.println();
		
		if (tarefa_a_ser_editada < 0 || tarefa_a_ser_editada >= tarefas.size()) {
			System.out.println("Essa tarefa não existe.");
		} else {
			String tarefa_original = tarefas.get(tarefa_a_ser_editada);
			
			System.out.println("Tarefa a ser editada: " + tarefa_original);
			System.out.print("Escreva a tarefa atualizada: ");
			tarefa_atualizada = sc.nextLine();
			
			tarefas.set(tarefa_a_ser_editada, tarefa_atualizada);
			System.out.println("Tarefa atualizada com sucesso!");
		}
		
	}
}







