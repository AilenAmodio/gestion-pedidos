package entidades;

public class Pagado extends Estado {
	
	public Pagado () {
		this.nombre="Pagado";
	}
	
	@Override
	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new Procesando();
	}

}
