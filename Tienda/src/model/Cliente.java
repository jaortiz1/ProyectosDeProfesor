package model;

import java.util.Arrays;
import java.util.Date;

public class Cliente {

	private String nombre;
	private Double saldo;
	private Articulo historialArticulos[];
	private Date historialFechas[];
	private Articulo carrito[];
	private Integer tamanioCarrito;
	private Integer tamanioHistorial;
	public Integer tamanioFechas;

	public Cliente() {
		super();
	}

	public Cliente(String nombre, Double saldo, Articulo[] historialArticulos, Date[] historialFechas,
			Articulo[] carrito, Integer tamanioCarrito, Integer tamanioHistorial) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
		this.historialArticulos = historialArticulos;
		this.historialFechas = historialFechas;
		this.carrito = carrito;
		this.tamanioCarrito = tamanioCarrito;
		this.tamanioHistorial = tamanioHistorial;
	}

	public Cliente(String name, int saldo) {
		this.nombre = name;
		this.saldo = (double) saldo;
		this.historialArticulos = new Articulo[10];
		this.historialFechas = new Date[10];
		this.carrito = new Articulo[10];
		this.tamanioCarrito = 0;
		this.tamanioHistorial = 0;
		this.tamanioFechas = 0;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Articulo[] getHistorialArticulos() {
		return historialArticulos;
	}

	public void setHistorialArticulos(Articulo[] historialArticulos) {
		this.historialArticulos = historialArticulos;
	}

	public Date[] getHistorialFechas() {
		return historialFechas;
	}

	public void setHistorialFechas(Date[] historialFechas) {
		this.historialFechas = historialFechas;
	}

	public Articulo[] getCarrito() {
		return carrito;
	}

	public void setCarrito(Articulo[] carrito) {
		this.carrito = carrito;
	}

	public Integer getTamanioCarrito() {
		return tamanioCarrito;
	}

	public void setTamanioCarrito(Integer tamanioCarrito) {
		this.tamanioCarrito = tamanioCarrito;
	}

	public Integer getTamanioHistorial() {
		return tamanioHistorial;
	}

	public void setTamanioHistorial(Integer tamanioHistorial) {
		this.tamanioHistorial = tamanioHistorial;
	}

	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", saldo=" + saldo + ", historialArticulos="
				+ Arrays.toString(historialArticulos) + ", historialFechas=" + Arrays.toString(historialFechas)
				+ ", carrito=" + Arrays.toString(carrito) + ", tamanioCarrito=" + tamanioCarrito + ", tamanioHistorial="
				+ tamanioHistorial + "]";
	}

	public void mostrarSaldo() {
		System.out.println("Mi saldo es de : " + this.getSaldo() + " euros.");
	}

	/*
	 * Historial de compras de Pedro:
	 * ----------------------------------------------------------- Cero (ref. 0),
	 * 10.0 euros + iva comprado en Tue Feb 15 14:07:02 2021
	 * ----------------------------------------------------------- Contenido del
	 * carrito de Pedro: -----------------------------------------------------------
	 * -- Uno (ref. 1), 20.0 euros + iva -- Tres (ref. 3), 180.0 euros + iva
	 * -----------------------------------------------------------
	 */
	public void mostrarHistorial() {
		System.out.println("HISTORIAL DE " + this.getNombre());
		for (int i = 0; i < this.getHistorialArticulos().length; i++) {
			System.out.println("Articulo n� " + i + ": " + this.getHistorialArticulos()[i]);
			System.out.println("Fecha de compra: " + this.getHistorialFechas()[i]);
		}

	}

	public void aumentarSaldo(Double s) {
		if (s > 0) {
			this.setSaldo(this.getSaldo() + s);
			System.out.println("Ingresando saldo.....");
		} else {
			System.out.println("El saldo es negaito, no venga a robar.");
		}
	}
	
	public void disminuirSaldo(double s) {
		if (this.getSaldo()-s >= 0) {
			this.setSaldo(this.getSaldo() - s);
			System.out.println("Retirando saldo.....");
		} else {
			System.out.println("El saldo es negativo, no venga a robar.");
		}
	}
	

}
