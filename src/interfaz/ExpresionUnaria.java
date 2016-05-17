package interfaz;

public abstract class ExpresionUnaria extends ExpresionImplementada {
	protected Double valor;

	public ExpresionUnaria(Double valor) {
		this.valor = valor;
	}

	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return valor;
	}

	@Override
	public String getExpresion() {
		// TODO Auto-generated method stub
		return valor.toString();
	}

}
