package lanchonete;



public class App {
	public static void main(String[] args) throws Exception {
		System.out.println("======= SISTEMA DE LANCHONETE ==========");
			Item item = new Item("X-salada" , 45 , 1);
			Item item2 = new Item("X-bacon" , 37 , 2);
			Item item3 = new Item("Coca-Cola" , 7 , 3);
			
			Carrinho c = new Carrinho();
			c.adicionarItem(item);
			System.out.println("------------------------------------------");
			c.adicionarItem(item2);
			System.out.println("------------------------------------------");
			c.adicionarItem(item3);
			System.out.println("=================================");
			c.calcularItem();
			//c.removerItem(10);
		}
	}
	
