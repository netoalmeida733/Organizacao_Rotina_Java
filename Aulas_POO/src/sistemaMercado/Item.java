package sistemaMercado;

public class Item {
	//ATRIBUTOS
	private String nomeItem;
	private int codigoItem;
	private double preco;
	
	
	public Item(String nomeItem, double preco) {
		super();
		this.nomeItem = nomeItem;
		this.preco = preco;
	}

	//GETTERS
	public String getNomeItem() {
		return nomeItem;
	}
	
	public int getCodigoItem() {
		return codigoItem;
	}
	
	public double getPreco() {
		return preco;
	}
}
