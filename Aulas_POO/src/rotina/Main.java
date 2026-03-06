package rotina;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		//HORARIO MEDIO DO CIDADAO ACORDADO 
		System.out.println("======== SISTEMA DE CONTROLE DE TEMPO ========");
		System.out.println("Dia iniciado: 06h até 23h");
		System.out.println("----------------------------------------------");
		
		//ADICIONANDO ATIVIDADES
		Atividade atividade = new Atividade("Treino" , 06 , 07);
		Atividade atividade2 = new Atividade("Trabalho", 8, 18);
		Atividade atividade3 = new Atividade("Estudo" ,19 , 20);
		Atividade atividade4 = new Atividade ("Lazer/Descanso" , 21 ,23);
		Atividade atividade5 = new Atividade ("Teste" ,19 ,20);
		Dia agenda = new Dia();
		
		
		agenda.adicionarAtividade(atividade); 
		System.out.println("------------------------------------");
		agenda.adicionarAtividade(atividade2);
		System.out.println("------------------------------------");
		agenda.adicionarAtividade(atividade3);
		System.out.println("------------------------------------");
		agenda.adicionarAtividade(atividade4);
		System.out.println("------------------------------------");
		agenda.adicionarAtividade(atividade5);
		System.out.println("====================================");
		System.out.println("====== Resumo do dia ======");
		ResumoDia resumo = new ResumoDia();
		ArrayList<Atividade> atividades = new ArrayList<>();
		atividades.add(atividade);
		atividades.add(atividade2);
		atividades.add(atividade3);
		atividades.add(atividade4);
		atividades.add(atividade5);
		resumo.resumoDia(atividades);
		
		
	}
}
