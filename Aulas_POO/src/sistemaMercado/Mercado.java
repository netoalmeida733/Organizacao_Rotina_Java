package sistemaMercado;

import java.util.ArrayList;

public class Mercado {
	//ATRIBUTOS
	private String nomeMercado;
	private ArrayList<Categoria> categorias; 
	private ArrayList<Item> itens; 
	private int codigoMerc;
	
	public Mercado(String nomeMercado) {
		super();
		this.nomeMercado = nomeMercado;
		this.categorias = new ArrayList<Categoria>();
		this.itens = new ArrayList<Item>();
	}
	
	
	//ADICIONAR CATEGORIA
	public void adicionarCategoria(Categoria categoria) {
		categorias.add(categoria);
	}
	
	//REMOVER CATEGORIA
	public void removerCategoria(int codigo) {
		if (codigo >= 0 && codigo < categorias.size()) {
			System.out.println("Categoria removida: " + categorias.get(codigo).getNomeCate());
			categorias.remove(codigo);
		} else {
			System.out.println("Código inválido!");
		}
	}

	//MOSTRAR CATEGORIA 
	public void mostrarCategoria() {
		for (int i = 0; i < categorias.size(); i++) {
			System.out.println("Codigo: " + "[" +i+ "]" + " - " + " Nome da Categoria: "+ categorias.get(i).getNomeCate());
		}
	}
	
	//MOSTRAR ITENS DE UMA CATEGORIA 

	public void mostrarCategoria(int codigo) {
	    if (codigo < 0 || codigo >= categorias.size()) {
	        System.out.println("Categoria inválida!");
	        return;
	    }

	    Categoria categoria = categorias.get(codigo);

	    System.out.println("\n[" + codigo + "] " + categoria.getNomeCate());

	    for (int i = 0; i < categoria.getItens().size(); i++) {
	        System.out.println("   - " + categoria.getItens().get(i).getNomeItem());
	    }
	}
	
	public void mostrarItens() {

		for (int i = 0; i < categorias.size(); i++) {
			  Categoria categoria = categorias.get(i);
			  for (int j = 0; j < categoria.getItens().size(); j++){
				  System.out.println("- " + categoria.getItens().get(j).getNomeItem());
			}
		}
	}

	//GETTERS
	public String getNomeMercado() {
		return nomeMercado;
	}
	
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	
	public ArrayList<Item> getItens() {
		return itens;
	}
	
	public int getCodigoMerc() {
		return codigoMerc;
	}
	
}
