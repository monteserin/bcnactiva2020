package demodelainterfaz;

public class Main {

	public static void main(String[] args) {
		Traductor2000 tr2000 = new Traductor2000();
		String v = tr2000.traducelo("hola");
		System.out.println(v);
			
		ITraductorImplementation tr= new ITraductorImplementation();
		String valor = tr.monteserinTranslate("hola");
		System.out.println(valor);
	}

}
