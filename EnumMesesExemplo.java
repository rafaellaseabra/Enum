package ENUM;

public class EnumMesesExemplo {

	public static void main(String[] args) {
		
		for (Mes mes : Mes.values()) { //Values mostra todos itens do enum
			System.out.println("---------");
			System.out.println(mes);
		}

	}

}
