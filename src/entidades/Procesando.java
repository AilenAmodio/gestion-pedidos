package entidades;

public class Procesando extends Estado {
	public Procesando () {
		this.nombre="Procesando";
	}
	@Override
	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new Enviado();
	}

}
