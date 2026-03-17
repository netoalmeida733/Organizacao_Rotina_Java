package lanchonete;

import java.util.ArrayList;

public class Carrinho {
	ArrayList<Item> itens;
	
	public Carrinho() {
		itens = new ArrayList<Item>();
	}
	public void adicionarItem(Item item) {
		itens.add(item);
		System.out.format(
			    "Nome do item: %s\nPreço do item: R$%.2f\nCodigo do item: %d\n", item.getNome(), item.getPreco() , item.getCodigoProduto()
			);
	}
	public void removerItem(int Codigo) {
		for (int i = 0; i < itens.size(); i++) {
			if (itens.get(i).getCodigoProduto() == Codigo) {
				System.out.println(itens.get(i).getNome()+" removido do carrinho");
				itens.remove(i);
			}
			
		}
	}
	public void calcularItem() {
		float valor = 0f;
		for (int i = 0; i < itens.size(); i++) {
			valor += itens.get(i).getPreco();
			}
			System.out.println("O valor total gasto foi de RS"+ valor);
		}
	}
