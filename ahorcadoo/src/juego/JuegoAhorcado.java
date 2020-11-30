package juego;

import java.util.Scanner;

public class JuegoAhorcado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vidas totales 7
		int vidas = 7;
		boolean encontrado;
		String letra = "", palabraSecreta = "oscar", muneco = "";
		Scanner leer = new Scanner(System.in);
		String vPalabrasecreta[], vAciertos[], vFallos[];
		vPalabrasecreta = new String[palabraSecreta.length()];
		vAciertos = new String[palabraSecreta.length()];
		vFallos = new String[vidas];
		Funciones.iniciarVectores(palabraSecreta, vPalabrasecreta, vAciertos, vFallos);
		// estructura
		do {
			// 1º Preguntar la letra
			System.out.println("Dime una letra para adivinar la palbra");
			letra = leer.next();
			// 2º Comprobar si esta en la palabra
			vidas = Funciones.comprobarLetraIntroducida(vidas, palabraSecreta, letra, vPalabrasecreta, vAciertos, vFallos);
			// 3º Dibujamos muñejo
			Funciones.dibujarMuneco(vidas);
			// 4º Dibujar aciertos y errores
			Funciones.dibujarAciertosErrores(vFallos, vAciertos);

		} while (vidas > 1 && Funciones.heGanado(vAciertos) == false);
		
		if ( (Funciones.heGanado(vAciertos) == true)) {

			for (int i = 0; i < 100000; i++) {
				if (i % 2 == 0) {
					System.out.println("__________");
					System.out.println("|         _|_");
					System.out.println("|        | oo|");
					System.out.println("|        |_ /| ");
					System.out.println("|     |    |    |");
					System.out.println("|     -----|-----");
					System.out.println("|          |");
					System.out.println("|          |");
					System.out.println("|        /   \\");
					System.out.println("|       /     \\");
					System.out.println("|      /       \\");
					System.out.println("|     /         \\");
					System.out.println("|______________");
					System.out.println("n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				} else {
					System.out.println("__________");
					System.out.println("|         _|_");
					System.out.println("|        | oo|");
					System.out.println("|        |_ /| ");
					System.out.println("|          |    ");
					System.out.println("|     -----|-----");
					System.out.println("|          |");
					System.out.println("|          |");
					System.out.println("|        /   \\");
					System.out.println("|       /     \\");
					System.out.println("|      /       \\");
					System.out.println("|     /         \\");
					System.out.println("|______________");
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

				}

			}
		}

	}
}
