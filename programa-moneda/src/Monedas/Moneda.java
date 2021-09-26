package Monedas;

public class Moneda {
	private int diametro = 28;

	public int getDiametro() {
		return diametro;
	}

	public double peso ;
	
	public Moneda(double peso) {
		this.peso= peso;
	}
	
	/*Metodo toString convierte los atributos de la clase para la impresion de  los objetos a Strings*/
	@Override 
	public String toString() {
		String resultado;
		resultado = "\nMoneda: ";
		resultado+= "Peso: "+peso ;
		
		resultado+= " Diametro: "+diametro;
		return resultado;
	}
}
