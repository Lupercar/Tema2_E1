package interfaz;

public abstract class ExpresionImplementada implements IExpresion {
//	El metodo getEcuacion es comun a todos los tipos de Expresiones
//	getExpresion = getValor; 
	@Override
	public String getEcuacion() {
		// TODO Auto-generated method stub
		return getExpresion() + " = "+ getValor();
	}
}
