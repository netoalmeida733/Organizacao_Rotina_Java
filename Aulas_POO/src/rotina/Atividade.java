package rotina;

public class Atividade {
	//ATRIBUTOS
	private String tipo;
	private int horaInicio;
	private int horaFim;
	private int duracao;
	private boolean treino;
	
	
	//METODO CONSTRUTOR 
	public Atividade(String trabalho, int horaInicio, int horaFim , boolean treino) {
		super();
		this.tipo = trabalho;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.duracao = horaFim - horaInicio;
		this.treino = treino;
		calcularDuracao();
	}
	
	private void calcularDuracao() {
		if(horaFim >= horaInicio) {
			duracao = horaFim - horaInicio;
		}else {
			duracao = (24 - horaInicio) + horaFim;
		}
	}
	
	//METODO PRINCIPAL 
	public void adicionar() {
		System.out.println("Atividade adicionada com sucesso: ");
		System.out.printf("Tipo: %s\nHorario: %dh às %dh\nDuraçao: %d horas\nTreino: %s\n", tipo , horaInicio , horaFim, duracao, 
				treino ? "Feito" : "Nao feito");
	}
	
	
	//GETTERS E SETTERS
	public String getTrabalho() {
		return tipo;
	}
	public void setTrabalho(String trabalho) {
		this.tipo = trabalho;
	}
	public int getHoraInicio() {
		return horaInicio;
	}
	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}
	public int getHoraFim() {
		return horaFim;
	}
	public void setHoraFim(int horaFim) {
		this.horaFim = horaFim;
	}

	public int getDuracao() {
		return duracao;
	}

	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	
	public boolean getTreino() {
		return treino;
	}
	public void setTreino(boolean treino) {
		this.treino = treino;
	}
}
