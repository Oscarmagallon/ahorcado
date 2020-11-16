package juego;

import java.util.Scanner;

public class JuegoAhorcado {
	
	public static void iniciarVectores(String palabra,String vPalabrasecreta[],String vAciertos[],String vFallos[]) {
		for (int i = 0; i<vFallos.length;i++) {
			vFallos[i]="_ ";
		}
		for(int i=0; i<vPalabrasecreta.length;i++) {
			vPala
		}
		
	}
	
	
	public static void dibujarMuneco(int vidas) {
		switch (vidas) {
		case 7:
				System.out.println("");
			break;
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
			for (int i = 0; i<vFallos.length,i++) {
				vFallos[i]="_ ";
			}
	
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
			System.out.println("|");for (int i = 0; i<vFallos.length,i++) {
				vFallos[i]="_ ";
			}
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
			System.out.println("|		   |");
			System.out.println("|		   |");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
	        System.out.println("|");	
			System.out.println("|______________");
			
	
			break;
		case 2:
			System.out.println("_______________");
			System.out.println("|              _|_");
			System.out.println("|             | oo|");
			System.out.println("|             |_ /| ");
			System.out.println("|               |");
			System.out.println("|         ______|______");
			System.out.println("|				|");
			System.out.println("|				|");
			System.out.println("|			   		");
			System.out.println("|");
			System.out.println("|");
	        System.out.println("|");	
			System.out.println("|______________");
			
	
			break;
		case 1:		
		System.out.println("_______________");
		System.out.println("|              _|_");
		System.out.println("|             | oo|");
		System.out.println("|             |_ /| ");
		System.out.println("|               |");
		System.out.println("|         ______|_____");
		System.out.println("|				|");
		System.out.println("|			    |");
		System.out.println("|			   /|  	");
		System.out.println("|             / |  ");
		System.out.println("|");
        System.out.println("|");	
		System.out.println("|______________");
		
	
			break;
		case 0:
					
	
	break;


	
		
		}
	}
	public static boolean comprobarLetraPalabra(String palabra,String letra) {
		boolean encontrado=false;
		return encontrado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// vidad totales 7
		int vidas=7;
		String letra="",palabraSecreta="oscar";
		Scanner leer=new Scanner(System.in);
		String vPalabrasecreta[],vAciertos[],vFallos[];
		vPalabrasecreta=new String[palabraSecreta.length()];
		vAciertos=new String[palabraSecreta.length()];
		vFallos=new String[vidas];
		//estructura
		do {
			//1º Preguntar la letra
			System.out.println("Dime una letra para adivinar la palbra");
			
			//2º Comprobar si esta en la palabra
			//3º Dibujamos muñejo
			dibujarMuneco(vidas);
			//4º Dibujar aciertos y errores
			vidas--;
		}while(vidas>=0);

	}

}
