package sistemaMercado;

public class MainMercado {
	public static void main(String[] args) {
		System.out.println("========= SISTEMA DE SUPERMERCADO ===========");
		
		//ADICIONANDO O MERCADO 
		Mercado cojiba = new Mercado("Mercado Cojiba");
		
		//CRIANDO AS CATEGORIAS 
		Categoria a = new Categoria("Alimentos");
		Categoria hp = new Categoria("Higiene pessoal");
		Categoria pl = new Categoria("Produto de Limpeza");
		
		//ADICIONANDO CATEGORIAS AO MERCADO 
		cojiba.adicionarCategoria(a);
		cojiba.adicionarCategoria(hp);
		cojiba.adicionarCategoria(pl);
		
		//ADICIONANDO OS ITENS 
		Item leite = new Item("Leite", 4.99);
		Item cafe = new Item("Café" , 3.59);
		a.adicionarItem(cafe);
		a.adicionarItem(leite);
		
		Item escovaD = new Item("Escova de Dente", 10.99);
		Item sabao = new  Item("Sabonete", 2.90);
		hp.adicionarItem(escovaD);
		hp.adicionarItem(sabao);
		
		Item amac = new Item("Amaciante", 19.69);
		Item desin = new Item("Desinfetante", 18.99);
		pl.adicionarItem(amac);
		pl.adicionarItem(desin);
		
		// MOSTRAR CATEGORIAS
		System.out.println("\nCategorias cadastradas:");
		cojiba.mostrarCategoria();
		
		//MOSTRAR TODOS OS ITENS 
		 System.out.println("\n========= TODOS OS ITENS =========");
		cojiba.mostrarItens();	
		
		// MOSTRAR ITENS DE UMA CATEGORIA
		System.out.println("\n========= ITENS =========");

		for (int i = 0; i < cojiba.getCategorias().size(); i++) {
		    cojiba.mostrarCategoria(i);
		}
		
	}
}
