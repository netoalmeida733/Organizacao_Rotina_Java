package rotina;

import java.util.ArrayList;

public class ResumoDia {
		
		//METODO PRINCIPAL
	public void resumoDia(ArrayList<Atividade> atividades) {
		int totalHoras = 0;
		for (Atividade a : atividades) {
			totalHoras += a.getDuracao();
		}
		System.out.println("Total de atividades: " + atividades.size());
		System.out.println("Horas ocupadas: " + totalHoras);
		if(totalHoras >= 8) {
			System.out.println("Continue assim! Seu dia foi produtivo.");
		} else {
			System.out.println("Tente melhora. Dia pouco produtivo");
		}
	}
	
	
}
