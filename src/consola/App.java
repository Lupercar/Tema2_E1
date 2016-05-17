package consola;

import entidad.Numero;
import entidad.Resta;
import entidad.Suma;
import interfaz.IExpresion;

/**
 * Se quiere modelizar las estructuras de datos para un programa que trabajar�
 * con expresiones matem�ticas.
 * 
 * Se quiere disponer de las siguientes clases: Numero: representar� un valor
 * num�rico real (con decimales) que incluya el infinito y el valor no definido
 * (NaN).
 * 
 * Suma: representar� una suma entre dos expresiones.
 * 
 * Resta: representar� la resta entre dos expresiones.
 * 
 * Producto: representar� la multiplicaci�n entre dos expresiones.
 * 
 * Division: representar� la divisi�n real entre dos expresiones.
 * 
 * 
 * 
 * Adem�s, se quiere que todas estas clases puedan ser interpretadas como una
 * "Expresion" (haz que sea una interfaz que implementan todas ellas).
 * 
 * "Expresion" debe tener como m�nimo dos m�todos p�blicos:
 * 
 * public Double getValor()
 * 
 * Debe retornar el valor de la expresi�n como un objeto de tipo Double. Por
 * ejemplo, si hemos definido un objeto Suma con la expresi�n "4.5 + 6.2", este
 * m�todo debe retornar el valor "10.7".
 * 
 * public String getEcuacion()
 * 
 * Debe retornar un string con el formato: expresion = valor . Por ejemplo si
 * hemos definido un objeto Producto con la expresi�n "6 * 8", este m�todo debe
 * retornar el string "6 * 8 = 48".
 * 
 * Crea todas estas clases, def�neles los constructores apropiados y rescribe
 * los m�todos getValor() y getEcuacion() para que devuelvan los valores
 * adecuados para cada clase.
 * 
 * @author JLGG
 *
 */
public class App {
	public static void main(String[] args) {
//		Ejemplo clase Numero
		IExpresion n1 = new Numero(7.5);
		System.out.println(n1.getEcuacion());
		
//		Ejemplo clase Suma
		IExpresion s1 = new Suma(n1, new Numero(4.3)); 
		System.out.println(s1.getEcuacion());
		
//		Ejemplo clase Resta
		IExpresion r1 = new Resta(s1,n1); 
		System.out.println(r1.getEcuacion());
	}
}
