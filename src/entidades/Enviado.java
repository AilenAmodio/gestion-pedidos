package entidades;

public class Enviado extends Estado {
	
	public Enviado () {
		this.nombre="Envidado";
	}
	
	@Override	
	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new Entregado();
}
}


