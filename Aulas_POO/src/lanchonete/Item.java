package lanchonete;

public class Item {
	//ATRIBUTOS 
	private int codigoProduto;
	private String nome;
	private float preco;

	
	public Item(String nome, float preco, int codigoProduto ) {
		this.nome = nome;
		this.preco = preco;
		this.codigoProduto = codigoProduto;

	}


	
	
	
	//Getters e SETTERS
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getCodigoProduto() {
		return codigoProduto;
	}

	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}

	
	
}
