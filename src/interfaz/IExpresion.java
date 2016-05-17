package interfaz;

/**
 * (haz que sea una interfaz que implementan todas ellas).
 * 
 * "Expresion" debe tener como mínimo dos métodos públicos:
 * 
 * public Double getValor()
 * 
 * public String getEcuacion()
 * 
 * Debe retornar un string con el formato: expresion = valor . Por ejemplo si
 * hemos definido un objeto Producto con la expresión "6 * 8", este método debe
 * retornar el string "6 * 8 = 48".
 * 
 * 
 * @author JLGG
 *
 */

public interface IExpresion {
	Double getValor(); // 48
	String getEcuacion(); // 6*8 = 48
	String getExpresion(); // 6*8
}
