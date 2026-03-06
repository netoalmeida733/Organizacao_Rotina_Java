package rotina;

import java.util.ArrayList;

public class Dia {
	//ATRIBUTOS
	private ArrayList<Atividade> atividades;

	

	//METODO CONSTRUTOR
	public Dia() {
	    this.atividades = new ArrayList<>();
	   ResumoDia resumo = new ResumoDia();
	    resumo.resumoDia(atividades);
	}

	//METODO PRINCIPAL
		private boolean temConflito(Atividade nova) {
			for(Atividade existente : atividades) {
				if (nova.getHoraInicio() < existente.getHoraFim() 
					&& nova.getHoraFim() > existente.getHoraInicio()) {
					return true; // conflito encontrado 
				}
			}
			return false; // sem conflito
		}
		
		public void adicionarAtividade(Atividade atividade) {
			if (temConflito(atividade)) {
				System.out.println("ALERTA: Conflito de horario detectado!");
				return;
			}
			atividades.add(atividade);
			atividade.adicionar();
		}
	
	
	
	//GETTERS E SETTERS
	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}

	public void setAtividades(ArrayList<Atividade> atividades) {
		this.atividades = atividades;
	}
	
	
}
