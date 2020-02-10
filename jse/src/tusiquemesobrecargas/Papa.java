package tusiquemesobrecargas;

public abstract class Papa {
	public abstract void sobreEscritura(String txtBienvenida, String nombre);
	
	public static void sobreCarga(String txtDespedida, String nombre){
		System.out.println(txtDespedida + nombre);
	}
}
