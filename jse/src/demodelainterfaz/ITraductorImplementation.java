package demodelainterfaz;

public class ITraductorImplementation implements ITraductor {

	@Override
	public String monteserinTranslate(String txt) {
		//Traductor2000 t2000 = new Traductor2000();
		//return t2000.traducelo(txt);
		
		TraduceloBien tr = new TraduceloBien();
		return tr.trduceloGuay(txt);
	}
	
	
	void amar() {
		String love =" a pablo. Por favor";
	}

}
