package ENUM;

public class DisciplinaPrincipal {

	public static void main(String[] args) {
	 
		for (Disciplina sesi : Disciplina.values()) {
			System.out.println ("-------------");
			System.out.println(sesi);
		}

	}

}
