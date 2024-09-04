package ENUM;

public class PrincipalPedido {

	public static void main(String[] args) {
		StatusPedido status = StatusPedido.Aberto;
		StatusPedido status2 = StatusPedido.Cancelado;
		StatusPedido status3 = StatusPedido.Em_andamento;
		StatusPedido status4 = StatusPedido.Entregue;
		
		System.out.println(status); 
		System.out.println(status2); 
		System.out.println(status3); 
		System.out.println(status4); 

	}

}
