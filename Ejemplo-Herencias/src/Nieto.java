
public class Nieto extends Hijo{

	public int varN;
	public int var;
	
	//recuperar la variable padre
	public int getVarPadre() {
		return super.var;
	}
	
	//escribir la variable padre
	public void setVarPadre(int x) {
		super.var = x;
	}
	
	//Override y cambio de visibilidad
	public int getVarH() {
		return var;	
	}
}
