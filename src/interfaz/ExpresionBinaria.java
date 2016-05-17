package interfaz;

public abstract class ExpresionBinaria extends ExpresionImplementada {

	protected IExpresion operador1; 
	protected IExpresion operador2;
	
	public ExpresionBinaria(IExpresion operador1, IExpresion operador2) {
		this.operador1 = operador1;
		this.operador2 = operador2;
	}
}
