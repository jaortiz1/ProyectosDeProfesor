package model;

import java.util.Comparator;

//para el metodo compare to implementamos comparable
public class Libro implements Comparable<Libro>{
	private String titulo;
	private String autor;
	private Integer paginas;
	private String generos;
	public Libro() {
		super();
	}
	
	public Libro(String titulo, String autor, Integer paginas, String generos) {
		super();
		//ORACLE SE EQUIVOCA
//		this.titulo = titulo;
//		this.autor = autor;
//		this.paginas = paginas;
//		this.generos = generos;
		setTitulo(titulo);
		setAutor(autor);
		setPaginas(paginas);
		setGeneros(generos);
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Integer getPaginas() {
		return paginas;
	}
	public void setPaginas(Integer paginas) {
		this.paginas = paginas;
	}
	public String getGeneros() {
		return generos;
	}
	public void setGeneros(String generos) {
		this.generos = generos;
	}
	//yo soy un libro y me dan otro libro para compararme
	public boolean equals(Libro comp) {
		boolean result = false;
		if(this.getAutor().equals(comp.getAutor()) && 
				this.getTitulo().equals(comp.getTitulo()) && 
				this.getPaginas().equals(comp.getPaginas())) {
			result=true;
		}
		return result;
	}

	@Override
	public String toString() {
		return "Libro --> titulo:" + titulo + ", autor:" + autor + ", paginas:" + paginas + ", generos:" + generos + ".";
	}

	@Override
	public int compareTo(Libro o) {
		// Compareto--> devuelve 0 si son iguales, -1 si el primer libro es menor, +1 si es mayor
		int salida = 0;
		if(getAutor().compareTo(o.getAutor())==0) {
			if(getTitulo().compareTo(o.getTitulo())==0) {
				salida = getGeneros().compareTo(o.getGeneros());
			}else {
				salida = getTitulo().compareTo(o.getTitulo());
			}
		}else {
			salida = getAutor().compareTo(o.getAutor());
		}
		
		return salida;
	}
	
	
	
	
//	 * a) Clase POJO correspondiente, con un constructor por defecto, otro con todos
//* los atributos, los m�todos Getters & Setters, m�todo equals (son libros son
//* iguales si, siendo del mismo autor, tienen el mismo t�tulo y n�mero de
//* p�ginas), m�todo toString personalizado, y un m�todo que establezca un orden
//* natural de ordenaci�n siguiendo estas prioridades: Autor, G�nero, T�tulo.
//* 
//* b) En un m�todo main, a�ada a una lista 10 libros de forma manual. Impr�mala
//* utilizando un for normal, luego utilizando un for extendido.
//* 
//* c) Imprima la lista orden�ndola por su orden natural establecido en la propia
//* clase; luego orden�ndola por Genero-Autor-T�tulo y por �ltimo s�lo por el
//* N�mero de P�ginas.
//* 
//* d) Elimine cada uno de los elemento de la lista, desde el �ltimo hasta el
//* primero, mostrando en pantalla qu� elemento es que que se elimina de dicha
//* lista.
//*/

}
