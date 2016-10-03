
public class Casa {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		Porta p1 = new Porta(2.0,4.0);
		Porta p2;
		p1.abrir();
		System.out.println(p1.getAltura());
		System.out.println(p1.getLargura());
		System.out.println(p1.isAberta());
		p1.fechar();
		System.out.println(p1.isAberta());
		p2 = (Porta) p1.clone();
		System.out.println(p2.getAltura());
		System.out.println(p2.getLargura());
		System.out.println(p2.isAberta());
	}

}
