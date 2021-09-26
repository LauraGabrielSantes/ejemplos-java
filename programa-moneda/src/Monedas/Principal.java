/*Programa que genera 200 monedas e indica el numero de monedas verdaderas o falsas que se han generado, 
 * teniendo un 10% de probabilidad de generar monedas falsas
 * Por: Laura Gabriel Santes
 * 26-09-21*/
package Monedas;

public class Principal {

	public static void main(String[] args) {
		int num_monedas=200;
		int cont = 0, contV = 0;
		int num_aleatorios[] = new int[num_monedas];
		Moneda monedas[] = new Moneda[num_monedas];

		for (int i = 0; i < num_monedas; i++) {
			num_aleatorios[i] = (int) (Math.random() * 100 + 1);

		}

		for (int i = 0; i < num_monedas; i++) {
			if (num_aleatorios[i] <= 10) {
				monedas[i]= new Moneda(15.32);
				//cont++;
			} else {
				monedas[i] = new Moneda(10.32);
				//contV++;
			}

		}
		for (Moneda i : monedas) {

			if (i.peso == 15.32) {
				cont++;
			} else {
				contV++;
			}
		}
		System.out.println("Monedas defectuosas: " + cont + " Monedas auténticas: " + contV);
		System.out.println("\nFin del programa");
	}

}
