package rotina;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		//HORARIO MEDIO DO CIDADAO ACORDADO 
		System.out.println("======== SISTEMA DE CONTROLE DE TEMPO ========");
		System.out.println("Dia iniciado: 06h até 23h");
		System.out.println("----------------------------------------------");
		
		 // Criando a agenda do dia
        Dia agenda = new Dia();
		
		//ADICIONANDO ATIVIDADES
        Atividade treino = new Atividade("Treino", 6, 7, true);
        Atividade trabalho = new Atividade("Trabalho", 9, 18, true);
        Atividade estudo = new Atividade("Estudo", 19, 20, true);
        Atividade lazer = new Atividade("Lazer", 21, 23, true);
        
        
        // Adicionando atividades na agenda
        agenda.adicionarAtividade(treino);
        System.out.println("----------------------------------------------");
        System.out.println("----------------------------------------------");
        agenda.adicionarAtividade(trabalho);
        System.out.println("----------------------------------------------");
        agenda.adicionarAtividade(estudo);
        System.out.println("----------------------------------------------");
        agenda.adicionarAtividade(lazer);

        System.out.println("----------------------------------------------");

        agenda.listarAtividades();

        System.out.println("----------------------------------------------");


		//GERANDO RESUMO DO DIA 
		System.out.println("====== Resumo do dia ======");
		ResumoDia resumo = new ResumoDia();
		resumo.resumoDia(agenda.getAtividades());
	}
}
