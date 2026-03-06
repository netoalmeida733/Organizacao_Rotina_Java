package rotina;

public class Atividade {
	//ATRIBUTOS
	private String tipo;
	private int horaInicio;
	private int horaFim;
	private int duracao;
	private int treino;
	
	
	//METODO CONSTRUTOR 
	public Atividade(String trabalho, int horaInicio, int horaFim , int treino) {
		super();
		this.tipo = trabalho;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.duracao = horaFim - horaInicio;
		this.treino = treino;
	}
	
	//METODO PRINCIPAL 
	public void adicionar() {
		System.out.println("Atividade adicionada com sucesso: ");
		System.out.printf("Tipo: %s\nHorario: %dh às %dh\nDuraçao: %d horas\nTreino: %d\n", tipo , horaInicio , horaFim, duracao, treino );
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
	
	public int getTreino() {
		return treino;
	}
	public void setTreino(int treino) {
		this.treino = treino;
	}
}
