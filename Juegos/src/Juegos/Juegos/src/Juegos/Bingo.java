package Juegos;

import java.util.Arrays;

import daw.com.Pantalla;
import daw.com.Teclado;
import daw.com.Tiempo;

public class Bingo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int NumJugadores = Teclado.leerInt("Cuantos jugadores sois:");
		
		int filas = 3;
		int columnas = 9;
		
		for ( int jugador = 1; jugador <= NumJugadores; jugador++) {
		
		Pantalla.escribirString("Este es tu carton jugador: " + jugador);
		Pantalla.escribirSaltoLinea();

		Pantalla.escribirString("------------------------------------------- ");


		
		Pantalla.escribirSaltoLinea();
		int [][] NumsSalidos = new int[filas][columnas];

		
		for(int i = 0; i < filas; i++) {
			for(int j = 0; j < columnas; j++) {
				
				int NumsCarton = (int) ((99 * Math.random()) + 1);
				
				int candidato = NumsCarton;

				for(int ñ = 0; ñ < filas; ñ++) {
		
						for(int ñ2 = 0; ñ2 < columnas; ñ2++) {
							
							while( NumsSalidos[ñ][ñ2]  == candidato ){
							candidato = (int) ((99 * Math.random()) + 1);
							ñ = 0;
							ñ2 = 0;

							}
							
						}
						
						

				}
				NumsSalidos[i][j] = candidato;
				Pantalla.escribirString(candidato + " | ");

			}
		
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirString("------------------------------------------- ");
			Pantalla.escribirSaltoLinea();
			}
		}
		
		Pantalla.escribirSaltoLinea();

		Pantalla.escribirString("Atención ya van a empezar a salir los numeros");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();

		int NumerosAzar = (int) ((99 * Math.random()) + 1);

		int [] numerossalidos = new int[100];

			for(int i = 0; i < 99; i++) {

				NumerosAzar = (int) ((99 * Math.random()) + 1);
				
				int candidato = NumerosAzar;

					for(int j = 0; j < 99; j++) {
						

						while( numerossalidos[j]  == candidato ){
						candidato = (int) ((99 * Math.random()) + 1);
						j = 0;

						}
					}
					
					numerossalidos[i] = candidato;

					Tiempo.esperar(2);

					Pantalla.escribirString(candidato + " ");

			}

		
	}

		}
	
	


