package interfaces;

public interface IConsultable {

	/*
	 * h) Defina otra interfaz IConsultable, que tenga las operaciones relacionadas
	 * con la consulta de las publicaciones consultables en la biblioteca: �
	 * retirar: No recibe ni retorna par�metros. Este m�todo indica que una
	 * publicaci�n es retirada para consulta. � devolver: No recibe ni retorna
	 * par�metros. Este m�todo indica que una publicaci�n es devuelta despu�s de ser
	 * consultada. � estaConsultando: Este m�todo indica si una publicaci�n est�
	 * siendo consultada
	 */
	public void retirar();
	public void devolver();
	public Boolean estaConsultando();
	
}
