package model;

public class Movil implements ITelefono {

	private Integer numero;

	public Movil() {
		super();
	}

	public Movil(Integer numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Fijo [numero=" + numero + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		return result;
	}

	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movil other = (Movil) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		return true;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public Integer consultarNumero() {
		System.out.println("Consultado el numero en clase movil-->" + this.getNumero());
		return this.getNumero();
	}

	@Override
	public void marcar(Integer numero) {
		System.out.println("Marcando con el movil...-->" + numero);

	}

	@Override
	public void colgar(Integer numero) {
		System.out.println("Colgando con el movil...-->" + numero);

	}

	@Override
	public void activarAltavoz() {
		System.out.println("Activo altavoz desde movil");

	}

	@Override
	public void desactivarAltavoz() {
		System.out.println("Desactivo altavoz desde movil");

	}

	@Override
	public void sonarTimbre() {
		System.out.println("RING RING RING DESDE EL movil DE TU MADRE");

	}
}
