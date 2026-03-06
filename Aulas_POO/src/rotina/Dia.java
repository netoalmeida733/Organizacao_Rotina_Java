package rotina;

import java.util.ArrayList;

public class Dia {
	//ATRIBUTOS
    private ArrayList<Atividade> atividades;
    
    // METODO CONSTRUTOR DIA 
    public Dia() {
        this.atividades = new ArrayList<>();
    }

    private boolean temConflito(Atividade nova) {

        for (Atividade existente : atividades) {

            if (nova.getHoraInicio() < existente.getHoraFim() &&
                nova.getHoraFim() > existente.getHoraInicio()) {

                return true;
            }
        }

        return false;
    }
    //METODO PRINCIPAL
    public void adicionarAtividade(Atividade atividade) {

        if (temConflito(atividade)) {
            System.out.println(" ALERTA: Conflito de horário detectado!");
            return;
        }

        atividades.add(atividade);
        atividade.adicionar();
    }
    
    public void listarAtividades() {

        System.out.println("===== AGENDA DO DIA =====");

        for (Atividade a : atividades) {

            System.out.printf(
                "%dh - %dh | %s\n",
                a.getHoraInicio(),
                a.getHoraFim(),
                a.getTrabalho()
            );

        }
    }
    //GETTER ADICIONADO 
    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }
}