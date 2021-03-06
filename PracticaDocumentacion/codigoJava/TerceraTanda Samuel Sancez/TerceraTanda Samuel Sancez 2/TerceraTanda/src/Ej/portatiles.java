package Ej;

/**
 * 
 * @author Samuel
 * 
 * 25-03-2022
 * En esta clase se encuentran todos los valores de los productos portatiles.
 *
 */

public class portatiles extends ordenadores {
	
	/**
	 * Estos atributos hacen referencia a su capacidad de memoria y a la duracion de su bateria, autonomia.
	 */
		
		private int memoria;
		private String autonomia;
		
		public portatiles() {
			super();
		}
		public portatiles(String procesador) {
			super(procesador);
		}
		public portatiles(String producto, String codigo, String procesador, int memoria, String autonomia) {
			super(producto, codigo, procesador);
			this.memoria = memoria;
			this.autonomia = autonomia;
		}

		public int getMemoria() {
			return memoria;
		}

		public void setMemoria(int memoria) {
			this.memoria = memoria;
		}

		public String getAutonomia() {
			return autonomia;
		}

		public void setAutonomia(String autonomia) {
			this.autonomia = autonomia;
		}
		
		/**
		 * Esta funcion recoge los valores guardados en esta calse, en la clase ordenadores y en la clase padre en un array.
		 */
		
		@Override
		public String toString() {
			return "Portatiles [Memoria =" + memoria + ", autonomia=" + autonomia + "] "+super.toString();
		}
		
		/**
		 * En el metodo precioPortatil se calcula el precio que tendra el producto
		 * en cueston a sus caracteristicas.
		 */
		
		public double precioPortatil() {
			/**
		 * El atributo precio puede tener dos valores que siempre van a ser fijos.
		 * Si no se cumple la condicion se retorna el precio base de lo contrario
		 * se retorna el precio calculado en el if.
		 */
			double precio = 2897.99;
			int suplemento = 250;
			
				if (memoria == 1500) {
					precio = precio + suplemento;
				}
				return precio;
			}
	
}