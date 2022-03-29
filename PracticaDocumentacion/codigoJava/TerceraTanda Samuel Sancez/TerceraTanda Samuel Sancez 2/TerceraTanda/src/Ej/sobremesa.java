package Ej;

/**
 * 
 * @author Samuel
 * 
 * 25-03-2022
 * En esta clase se encuentran todos los valores de los productos sobremesa.
 *
 */

public class sobremesa extends ordenadores{
	
	/**
	 * Estos atributos hacen referencia a los valores que tendra el producto de capacidad de memoria
	 * y el tama�o de la pantalla.
	 */
	
	private int memoria;
	private int tam;
	
	public sobremesa(){
		super();
	}
	
	public sobremesa(String procesador) {
		super(procesador);
	}
	
	public sobremesa(String producto, String codigo, String procesador, int memoria, int tam) {
		super(producto, codigo, procesador);
		this.memoria = memoria;
		this.tam = tam;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
	}
	
	/**
	 * Esta funcion recoge los valores guardados en esta calse, en la clase ordenadores y en la clase padre en un array.
	 */
	
	@Override
	public String toString() {
		return "Sobremesa [Memoria =" + memoria + ", tamaño=" + tam + "] "+super.toString();
	}
	
	/**
	 * En el metodo precioSobremesa se calcula el precio que tendra el producto
	 * en cueston a sus caracteristicas.
	 */
	
	@Override
	public double precioSobremesa() {
		
		/**
		 * El atributo precio puede tener dos valores que siempre van a ser fijos.
		 * Si no se cumple la condicion se retorna el precio base de lo contrario
		 * se retorna el precio calculado en el if.
		 */
		
		double precio = 1345.99;
		int suplemento = 250;
		
			if (memoria == 1000) {
				precio = precio + suplemento;
			}
			return precio;
		}
	
}

