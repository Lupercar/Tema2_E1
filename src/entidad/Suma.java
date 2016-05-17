package entidad;

import interfaz.ExpresionBinaria;
import interfaz.IExpresion;

public class Suma extends ExpresionBinaria{

	public Suma(IExpresion operador1, IExpresion operador2) {
		super(operador1, operador2);
	}

	@Override
	public Double getValor() {
		// TODO Auto-generated method stub
		return operador1.getValor()+operador2.getValor();
	}

	@Override
	public String getExpresion() {
		// TODO Auto-generated method stub
		return "["+operador1.getExpresion()+"+"+operador2.getExpresion()+"]";
	}

}
