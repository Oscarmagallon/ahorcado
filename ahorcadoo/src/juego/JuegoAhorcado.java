package juego;

import java.util.Scanner;

public class JuegoAhorcado {

	public static boolean heGanado(String vAciertos[]) {
		boolean ganar = true;
		for (int i = 0; i < vAciertos.length; i++) {
			if (vAciertos[i].equals(" _ ")) {
				ganar = false;
				break;
			}
		}

		return ganar;

	}

	public static void iniciarVectores(String palabraSecreta, String vPalabrasecreta[], String vAciertos[],
			String vFallos[]) {
		for (int i = 0; i < vFallos.length; i++) {
			vFallos[i] = " _ ";
		}
		for (int i = 0; i < vPalabrasecreta.length; i++) {
			vPalabrasecreta[i] = palabraSecreta.substring(i, i + 1);
			vAciertos[i] = " _ ";
		}

	}

	public static void dibujarMuneco(int vidas) {
		switch (vidas) {

		case 6:
			System.out.println("______________________");

			break;
		case 5:
			System.out.println("___________");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________________");

			break;
		case 4:
			System.out.println("___________");
			System.out.println("|          _|_");
			System.out.println("|         | oo|");
			System.out.println("|         |__/| ");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 3:
			System.out.println("__________");
			System.out.println("|        _|_");
			System.out.println("|        | oo|");
			System.out.println("|        |_ /| ");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 2:
			System.out.println("__________");
			System.out.println("|        _|_");
			System.out.println("|        | oo|");
			System.out.println("|        |_ /| ");
			System.out.println("|          |");
			System.out.println("|     -----|-----");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|");
			System.out.println("|______________");

			break;
		case 1:
			System.out.println("__________");
			System.out.println("|        _|_");
			System.out.println("|        | oo|");
			System.out.println("|        |_ /| ");
			System.out.println("|          |");
			System.out.println("|     -----|-----");
			System.out.println("|          |");
			System.out.println("|          |");
			System.out.println("|        /   \\");
			System.out.println("|       /     \\");
			System.out.println("|      /       \\");
			System.out.println("|     /         \\");
			System.out.println("|______________");

			break;

		}
	}

	public static int comprobarLetraIntroducida(int vidas, String palabraSecreta, String letra,
			String vPalabrasecreta[], String vAciertos[], String vFallos[]) {
		boolean encontrado = false;
		for (int i = 0; i < palabraSecreta.length(); i++) {
			if (palabraSecreta.substring(i, i + 1).equalsIgnoreCase(letra)) {
				vAciertos[i] = letra;
				encontrado = true;
				// System.out.println(vAciertos[i]);
			}
		}

		if (encontrado == false) {
			// Guardo en la primera posicion libre de vfallos
			for (int i = 0; i < vFallos.length; i++) {
				if (vFallos[i].equalsIgnoreCase(" _ ")) {

					vFallos[i] = letra;
					vidas--;
					break;
				}
			}

		}
		return vidas;
	}

	public static void dibujarAciertosErrores(String vFallos[], String vAciertos[]) {
		// Imprimir fallos
		System.out.println("Fallos cometidos");
		for (int i = 0; i < vFallos.length; i++) {

			if (!vFallos[i].equals(" _ ")) {
				System.out.print(vFallos[i] + " ");

			}
		}
		System.out.println("\nAciertos");
		for (int i = 0; i < vAciertos.length; i++) {
			System.out.print(vAciertos[i] + " ");
		}
		System.out.println("");
	}

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
		iniciarVectores(palabraSecreta, vPalabrasecreta, vAciertos, vFallos);
		// estructura
		do {
			// 1º Preguntar la letra
			System.out.println("Dime una letra para adivinar la palbra");
			letra = leer.next();
			// 2º Comprobar si esta en la palabra
			vidas = comprobarLetraIntroducida(vidas, palabraSecreta, letra, vPalabrasecreta, vAciertos, vFallos);
			// 3º Dibujamos muñejo
			dibujarMuneco(vidas);
			// 4º Dibujar aciertos y errores
			dibujarAciertosErrores(vFallos, vAciertos);

		} while (vidas > 1 && heGanado(vAciertos) == false);
		
		if ( (heGanado(vAciertos) == true)) {

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
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

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
					System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n");

				}

			}
		}

	}
}
