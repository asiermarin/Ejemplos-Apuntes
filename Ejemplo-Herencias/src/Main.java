public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x; //Variable de ejemplo
		
		//Ejemplo de herencia y diferencia entre
		//public, private y protected en Java.
		Hijo hijo = new Hijo();		
		Nieto nieto = new Nieto();
		
		hijo.prvar = 2;
		nieto.prvar = 2;
		
		hijo.padrePublic();
		nieto.padreProtected();
		
		//Ejemplo variable y metodo estatico y no herencia
		hijo.vstatic = 2;
		nieto.vstatic = 4;
		System.out.println("Vstatic: " + hijo.vstatic);
		
		//Ejemplo de visibilidad de variables ocultas
		nieto.var = 1;
		nieto.setVarPadre(2);
		x = nieto.getVarPadre();
		System.out.println("Valor de var del hijo: " + nieto.var);
		System.out.println("Valor de var del padre:" + x);
		
		//Ejemplo de clase final y abstracta
		clsFinal fin = new clsFinal();
		fin.mEjemplo();

		//Ejemplo polimorfismo
		Padre p_padre = new Padre();
		Padre p_hijo = new Hijo();
		Padre p_nieto = new Nieto();
	}
}
