package ejercicios;

import utils.Teclado;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*
		 * Ordena3n�meros- Realizar un programa en JAVA que lea tres n�meros enteros y
		 * los ordene de mayor a menor.
		 */
		int edad = 20;
		String sexo = "mujer";

		// SOY PEPA UNA MUJER Y TENGO 16 A�OS
		/*if (edad > 18 && sexo == "mujer") {
			System.out.println("Entre.");
		} else {
			if (sexo == "hombre" && edad > 18) {
				// if para saber si es mujer

			}
		}
		if (edad > 18) {
			if (sexo == "mujer") {
				System.out.println("Entre");
			} else {
				System.out.println("Solo entras con una mujer de acompa�ante");
			}
		} else {
			System.out.println("No entras");
		}*/

		String preguntaUno = "Introduzca el primer n�mero: ";
		String preguntaDos = "Introduzca el segundo n�mero: ";
		String preguntaTres = "Introduzca el tercer n�mero: ";
		int mayor = 0;
		int mediano = 0;
		int menor = 0;
		int a = Teclado.leerInt(preguntaUno);
		int b = Teclado.leerInt(preguntaDos);
		int c = Teclado.leerInt(preguntaTres);
		//mayor
		if(a>b && a>c) {
			mayor=a;
		}else if (b>a && b>c) {
			mayor=b;
		}else if (c>a && c>b) {
			mayor=c;
		}
		//menor
		if(a<b && a<c) {
			menor=a;
		}else if (b<a && b<c) {
			menor=b;
		}else if (c<a && c<b) {
			menor=c;
		}
		mediano = a+b+c-menor-mayor;
		System.out.println("Orden descendente: "+mayor+","+mediano+","+menor);
		System.out.println("Orden descendente: "+menor+","+mediano+","+mayor);
		

	}

}
