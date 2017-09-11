
public class Restaurante {

	public Restaurante() {
	mostraCardapio();
	}

	private void mostraCardapio() {
		
		Prato x1 = new Prato("Lasanha",18,"z1");
		Prato x2 = new Prato("Macarrão",12,"z2");
		Prato x3 = new Prato("Strogonoff",19,"z3");
		
		System.out.println(x1.getNome()+" R$ :"+x1.getPreco()+"\n"+x1.getDescricao());
		System.out.println("------------------------------------------------");
		
		System.out.println(x2.getNome()+" R$ :"+x2.getPreco()+"\n"+x2.getDescricao());
		System.out.println("------------------------------------------------");
		
		System.out.println(x3.getNome()+" R$ :"+x3.getPreco()+"\n"+x3.getDescricao());
		System.out.println("------------------------------------------------");
	}

}
