package Ej;

/**
 * 
 * @author Samuel
 * 25-03-2022
 * En esta clase se encuentran todos los valores del producto Ipad
 *
 */

public class tablet extends productos{
	
	/**
	 * El atributo memoria declara la capacidad de memoria del producto.
	 */
	
	private int memoria;
	
	public tablet() {
		super();
	}
	
	public tablet(String producto, String codigo, int memoria) {
		super(producto, codigo);
		this.memoria = memoria;
	}

	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	
	/**
	 * Esta funcion recoge los valores guardados en esta calse y en la clase padre en un array.
	 */
	
	@Override
	public String toString() {
		return "tablet [Memoria=" + memoria +"]"+super.toString();
	}
	
	/**
	 * En el metodo precioIpad se calcula el precio que tendra el producto
	 * en cueston a sus caracteristicas.
	 */
	
	@Override
	public double precioIpad() {
		
		/**
		 * El atributo precio puede tener dos valores que siempre van a ser fijos.
		 * Si no se cumple la condicion se retorna el precio base de lo contrario
		 * se retorna el precio calculado en el if.
		 */
		
		double precio = 1127.99;
		int suplemento = 250;
		
			if ( memoria == 720) {
				precio = precio + suplemento;
			}
			
			return precio;
		
	}
	
	
}
