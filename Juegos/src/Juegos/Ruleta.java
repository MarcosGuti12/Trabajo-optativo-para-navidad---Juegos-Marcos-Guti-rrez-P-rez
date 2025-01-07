package Juegos;

import daw.com.Pantalla;
import daw.com.Teclado;
import daw.com.Tiempo;

public class Ruleta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pantalla.escribirString("1. Apostar a numeros");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("2. Apostar a colores");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("3. Apostar a par o impar");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("4. Salir");
		Pantalla.escribirSaltoLinea();

		int eleccion = Teclado.leerInt();

		String color = "";
		
		
		
				
		int numeroazar = (int) ((36 * Math.random()) + 1);
		
		int[] Rojos = { 1, 3, 5, 7, 9, 12, 14, 16, 18, 19, 21, 23, 25, 27, 30, 32, 34, 36 }; 
		int[] Negros = { 2, 4, 6, 8, 10, 11, 13, 15, 17, 20, 22, 24, 26, 28, 29, 31, 33, 35 };
		int[] Verde = { 0 };

		
		for(int i = 0; i < Rojos.length ;i++) {
			
		if (numeroazar == Rojos[i]) {
			color = "Rojo";
		}
		}
		
		for(int i = 0; i < Negros.length ;i++) {
			
		if (numeroazar == Negros[i]) {
			color = "Negro";
		}
		}
		
		for(int i = 0; i < Verde.length ;i++) {
			
		if (numeroazar == Verde[i]) {
			color = "Verde";
		}
		}
		

		
		if(eleccion == 1) {
			int dineroApostar = Teclado.leerInt("Cuanto dinero quiere apostar");
			Pantalla.escribirSaltoLinea();
			int numeroApostar = Teclado.leerInt("A que numero quiere apostar");
			Pantalla.escribirInt(numeroazar);;
			Pantalla.escribirString(" " + color);
			Pantalla.escribirSaltoLinea();
		if (numeroApostar == numeroazar) {
			Pantalla.escribirString("Acabas de ganar y el premio es de: ");
			
			
			Pantalla.escribirInt(dineroApostar * 36);	

			
		}else {
			
			Pantalla.escribirString("Acabas de perder:(");
			Pantalla.escribirSaltoLinea();
		}

		}
		
		if(eleccion == 2) {
			int dineroApostar = Teclado.leerInt("Cuanto dinero quiere apostar");
			Pantalla.escribirSaltoLinea();
			String colorApostar = Teclado.leerString("A que color quiere apostar: (Rojo o Negro)");
			Pantalla.escribirInt(numeroazar);;
			Pantalla.escribirString(" " + color);
			Pantalla.escribirSaltoLinea();
		if (colorApostar.equals(color)) {
			Pantalla.escribirString("Acabas de ganar y el premio es de: ");
			Pantalla.escribirInt(dineroApostar * 2);
			
			
			
		}else {
			Pantalla.escribirString("Acabas de perder:(");

		}
		}
	
		
		String ParOImpar = "";
		
		if(eleccion == 3) {
			int dineroApostar = Teclado.leerInt("Cuanto dinero quiere apostar");
			Pantalla.escribirSaltoLinea();
			String ParImpar = Teclado.leerString("A que quiere apostar: (Par o Impar)");
			Pantalla.escribirInt(numeroazar);
			Pantalla.escribirString(" " + color);
			Pantalla.escribirSaltoLinea();
			
			if(numeroazar % 2 == 0) {
				ParOImpar = "Par";
			}else {
				ParOImpar = "Impar";
			}
				
				
		if (ParImpar.equals(ParOImpar)) {
			Pantalla.escribirString("Acabas de ganar y el premio es de: ");
			Pantalla.escribirInt(dineroApostar * 2);
			
		}else {
			
			Pantalla.escribirString("Acabas de perder:(");
		}

		}

	}
	
	
	
	}


