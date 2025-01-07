package Juegos;

import daw.com.Pantalla;
import daw.com.Teclado;

public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int Apuesta = Teclado.leerInt("De cuanto va a ser la apuesta");
		 
		
		int SumaNum = 0;
		String TipoCarta = "";
		int DineroBanca = 0;
		int banca = 0;
		
		int ApuestaGanada = 0;
		int ManoCrupier = (int) ((10 * Math.random()) + 1);
		int ManoCrupier2 = (int) ((10 * Math.random()) + 1);
		int SumCrupier = ManoCrupier + ManoCrupier2;

		
		for(int i = 1; i < 3; i++) {
			
			int NumerosAzar = (int) ((10 * Math.random()) + 1);
			
			int TipoCartaAzar = (int) ((4 * Math.random()) + 1);
		
		switch(TipoCartaAzar) {
			
		case 1:
			TipoCarta = "Diamantes";
			break;
		case 2:
			TipoCarta = "Picas";
			break;
		case 3:
			TipoCarta = "Trebol";
			break;
		case 4:
			TipoCarta = "Corazones";
			break;
		}
		
		String PosCarta = "";
		switch(i) {
		
		case 1:
			PosCarta = "primera";
			break;
		case 2:
			PosCarta = "segunda";
			break;
		}
		
		Pantalla.escribirString("Tu " + PosCarta + " carta es: " + NumerosAzar, "de " + TipoCarta);
		
		SumaNum = SumaNum + NumerosAzar;
		
		
		}
		
		Pantalla.escribirString("En total tienes un: " + SumaNum);
		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirSaltoLinea();

		Pantalla.escribirString("La primera carta del croupier es un: " + ManoCrupier);
		
		Pantalla.escribirSaltoLinea();		
		Pantalla.escribirSaltoLinea();

		
		Pantalla.escribirString("1. Pedir otra carta");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("2. Doblar y pedir (Si doblas no podras pedir mas cartas)");
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("3. Plantarse");
		Pantalla.escribirSaltoLinea();
		int decision = Teclado.leerInt();
		
		
		if (decision == 1) {
			while (decision == 1) {
			int NumerosAzar = (int) ((10 * Math.random()) + 1);
			int TipoCartaAzar = (int) ((4 * Math.random()) + 1);
			
			switch(TipoCartaAzar) {
			
			case 1:
				TipoCarta = "Diamantes";
				break;
			case 2:
				TipoCarta = "Picas";
				break;
			case 3:
				TipoCarta = "Trebol";
				break;
			case 4:
				TipoCarta = "Corazones";
				break;
			}
			
			Pantalla.escribirString("Tu nueva carta es: " + NumerosAzar, "de " + TipoCarta);
			
			SumaNum = SumaNum + NumerosAzar;
			
			Pantalla.escribirString("Ahora tienes un: " + SumaNum);
			
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirSaltoLinea();
			
			if (SumaNum > 21) {
				decision = 3;
				Pantalla.escribirString("Acabas de perder");
				banca = Apuesta + banca;
				DineroBanca = DineroBanca + banca;
				
			}else if(SumaNum == 21){
				Pantalla.escribirString("Has ganado");
			}else {
				Pantalla.escribirString("1. Pedir otra carta");
				Pantalla.escribirSaltoLinea();
				Pantalla.escribirString("2. Doblar y pedir (Si doblas no podras pedir mas cartas)");
				Pantalla.escribirSaltoLinea();
				Pantalla.escribirString("3. Plantarse");
				Pantalla.escribirSaltoLinea();
				decision = Teclado.leerInt();
			}

			

			}
		}
		
		if (decision == 2) {
			int NumerosAzar = (int) ((10 * Math.random()) + 1);
			int TipoCartaAzar = (int) ((4 * Math.random()) + 1);
			
			switch(TipoCartaAzar) {
			
			case 1:
				TipoCarta = "Diamantes";
				break;
			case 2:
				TipoCarta = "Picas";
				break;
			case 3:
				TipoCarta = "Trebol";
				break;
			case 4:
				TipoCarta = "Corazones";
				break;
			}
			
			Pantalla.escribirString("Tu nueva carta es: " + NumerosAzar, "de " + TipoCarta);
			
			SumaNum = SumaNum + NumerosAzar;
			
			Pantalla.escribirString("Ahora tienes un: " + SumaNum);
			
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirSaltoLinea();
			
			if (SumaNum > 21) {
				Pantalla.escribirString("Acabas de perder");
				ApuestaGanada = Apuesta * 2;
				banca = Apuesta + banca;
				DineroBanca = DineroBanca + banca;
				
			}else if(SumaNum == 21){
				Pantalla.escribirString("Has ganado");
				ApuestaGanada = Apuesta * 4;
			}else if(SumaNum < 21) {
				if (21 - SumaNum < 21 - SumCrupier){
					Pantalla.escribirString("Acabas de ganar.");
					ApuestaGanada = Apuesta * 4;
				}else {
					Pantalla.escribirString("Acabas de perder");
					banca = Apuesta + banca;
					DineroBanca = DineroBanca + banca;
				}
			}

		}
		
		if (decision == 3) {
			Pantalla.escribirString("Ahora tienes un: " + SumaNum);
			
			Pantalla.escribirSaltoLinea();
			Pantalla.escribirSaltoLinea();
			
			if (SumaNum > 21) {
				Pantalla.escribirString("Acabas de perder");
				ApuestaGanada = Apuesta * 2;
				banca = Apuesta + banca;
				DineroBanca = DineroBanca + banca;
				
			}else if(SumaNum == 21){
				Pantalla.escribirString("Has ganado");
				ApuestaGanada = Apuesta * 2;
			}else if(SumaNum < 21) {
				if (21 - SumaNum < 21 - SumCrupier){
					Pantalla.escribirString("Acabas de ganar.");
					ApuestaGanada = Apuesta * 2;
				}else {
					Pantalla.escribirString("Acabas de perder");
					banca = Apuesta + banca;
					DineroBanca = DineroBanca + banca;
				}
			}
		}
		Pantalla.escribirSaltoLinea();
		
		Pantalla.escribirString("La segunda carta del croupier es un: " + ManoCrupier2);
		
		
		Pantalla.escribirSaltoLinea();
		
		Pantalla.escribirString("El crupier tiene un: " + SumCrupier);
		
		Pantalla.escribirSaltoLinea();
		

		
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Este es el dinero que ha ganado la banca: " + DineroBanca);
		Pantalla.escribirSaltoLinea();
		Pantalla.escribirString("Esto es lo que has ganado: " + ApuestaGanada);

	}

}
