package sistemaMercado;

import java.util.ArrayList;

public class Categoria {
	//ATRIBUTOS
	private int codigoCate;
	private String nomeCate;
	private ArrayList<Item> itens;
	
	public Categoria(String nomeCate ) {
		this.nomeCate = nomeCate;
		this.itens = new ArrayList<Item>();
	}
	public void adicionarItem(Item item) {
		itens.add(item);
	}
	
	public void removerItem(int codigo) {
		itens.remove(codigo);
	}
	
	//GETTERS
	public int getCodigoCate() {
		return codigoCate;
	}
	
	public String getNomeCate() {
		return nomeCate;
	}
	
	public ArrayList<Item> getItens() {
		return itens;
	}
}
