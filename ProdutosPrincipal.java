package ENUM;

public class ProdutosPrincipal {

	public static void main(String[] args) {
		
		for (Produtos lista : Produtos.values()) {
			System.out.println ("-------------");
			System.out.println(lista);
		}

	}

}
