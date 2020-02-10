package modificadoresacceso;

import modificadoresacceso.A;

public class B {

	public void miMetodoB() {
		A a = new A("amor",10);
		a.miMetodoA();
	}
}
