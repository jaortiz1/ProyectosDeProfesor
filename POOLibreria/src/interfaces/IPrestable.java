package interfaces;

public interface IPrestable {

	/*
	 * Defina otra interfaz IPrestable, que tenga las operaciones relacionadas con
	 * el pr�stamo de las publicaciones. Tendr� definidas las operaciones: �
	 * prestar: No recibe ni retorna par�metros. S�lo debe modificar la propiedad
	 * que indica si est� prestado o no, para que indique que s� est� prestado. �
	 * devolver: No recibe ni retorna par�metros. S�lo debe modificar la propiedad
	 * que indica si est� prestado o no, para que indique que no est� prestado. �
	 * estaPrestado: Que no recibe par�metros y retorna el valor de la propiedad que
	 * indica si est� prestado o no. f)
	 */
	public void prestar();
	public void devolver();
	public Boolean estaPrestado();
}
