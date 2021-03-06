package ejercicios;

import utils.Teclado;

public class EjerciciosMasMenu {

	public static void main(String[] args) {
		int opcion = 0;
		

		do {
			mostrarMenu();
			opcion = Teclado.leerInt("Introduzca el numero: ");
			switch (opcion) {
			case 0:
				System.out.println("adios");
				break;
			case 1:
				mostrarCuadrante();
				break;
			case 2:
				meses2();
				break;
			case 3:
				long segundosObtenidos =edadASegundos();
				System.out.println("Segundos--> "+segundosObtenidos);
				break;
			case 4:
				calcularDescuento();
				break;
			default:
				System.out.println("Error");
			}
		} while (opcion != 0);

	}

	public static void mostrarMenu() {
		System.out.println("MENU");
		System.out.println("0. Salir");
		System.out.println("1. cuadrante");
		System.out.println("2. meses2");
		System.out.println("3. Edad a segundos");
		System.out.println("4. calcular descuento");
		

	}

	public static void mostrarCuadrante() {

		double a;
		double b;
		a = Teclado.leerDouble("Introduzca la x:");
		b = Teclado.leerDouble("Introduzca la y:");
		if (a == 0 && b == 0) {
			System.out.println("Origen");
		} else if (a > 0 && b > 0) {
			System.out.println("Primero");
		} else if (a > 0 && b < 0) {
			System.out.println("Cuarto cuadrante");
		} else if (a < 0 && b < 0) {
			System.out.println("Tercero");
		} else {
			System.out.println("Segundo");
		}

	}
	/*
	 * Meses2- Realizar un programa en JAVA que una vez introducidos mes y año,
	 * devuelva los días que le pertenecen a dicho mes. Para saber si un año es
	 * bisiesto, suponiendo que a sea el año se deben cumplir una de las dos
	 * condiciones siguientes para que lo sea: (a mod 4)=0 Y (a mod 100)0 O (a mod
	 * 400)=0
	 */

	public static void meses2() {
		int anyo = Teclado.leerInt("Introduzca año");
		int mes = Teclado.leerInt("Introduzca un mes");
		/*
		 * Meses con 30 días: Abril, Junio, Septiembre y Noviembre. Meses con 31 días:
		 * Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre. Meses con 28 días:
		 * Febrero (Menos cuando es bisiesto que tiene 29 días).
		 */
		/*
		 * Podemos hacer 12 if uno por mes O 3 if, uno para meses con 30 dias, otro para
		 * 31 y otro para febrero
		 * 
		 */
		if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("Su mes tiene 30 días");
		} else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 12) {
			System.out.println("Su mes tiene 31 días.");
		} else {// significa que el unico mes posible es febrero
				// (a mod 4)=0 Y (a mod 100)!=0 O (a mod 400)=0
			if ((anyo % 4 == 0 && anyo % 100 != 0) || anyo % 400 == 0) {// si es bisiesto 29 dias
				System.out.println("Año bisiesto, febrero 29 dias");
			} else {// no es bisiesto entonces 28 dias
				System.out.println("Su mes es febrero, tiene 28 días.");

			}
		}

	}
	//FUNCION --> DEVUELVE ALGO
	//PROCEDIMIENTO --> NO DEVUELVE NADA, PARA NOSOTROS, IMPRIME
	public static long edadASegundos() {
		long edad = Teclado.leerInt("Introduzca su edad:" );
		long dias = edad*365;
		long horas = dias*24;
		long segundos = horas*60;
		return segundos;
		
	}
	/*
	 * . Descuentos-Realizar un programa en JAVA que calcule los descuentos a aplicar
a una compra según los siguientes criterios:
• Si la compra es superior a 100 unidades, aplicar un 40% de descuento.
• Si la compara está entre 25 y 100 unidades, 20% de descuento
• Si la compra está entre 10 y 24 unidades, realizar un 10% de descuento.
• Si la compra es inferior a 10 unidades, no se aplica descuento.
Se nos pedirá por teclado Código artículo, Precio y Unidades. Se obtendrá como
resultado el Código del artículo, el Subtotal a pagar, el Descuento aplicado y el Total
a pagar.
	 */
	public static void calcularDescuento() {
		String codigo = Teclado.leerString("Introduzca el codigo");
		double precio = Teclado.leerDouble("Introduzca el precio del articulo");
		int cantidad = Teclado.leerInt("Introduzca la cantidad: ");
		double subtotal = 0;
		double total = 0;
		double descuento = 0;
		//IMPRIMIR CODIGO, SUBTOTAL A PAGAR, DESCUENTO REALIZADO Y TOTAL
		//Un big mac vale 10 euros, compro 5 unidades, subtotal= 50 euros, tengo descuento del 20%
		//total = subtotal-descuento = 40 euros
		subtotal = cantidad*precio;
		if(cantidad>100) {
			descuento = 40;
		}else if(25<=cantidad && cantidad <=100) {
			descuento = 20;
		}else if(10<=cantidad && cantidad<=24) {
			descuento = 10;
		}
		if(descuento!=0) {
			total = descuento*subtotal/100;
		}else {
			total = subtotal;
		}
		System.out.println("CODIGO: "+codigo);
		System.out.println("Unidades: "+cantidad);
		System.out.println("Precio unitario "+precio);
		System.out.println("Subtotal sin descuento: "+subtotal);
		System.out.println("Total con "+descuento+"%"+" = "+total);
		
		
	}
	
	
}
