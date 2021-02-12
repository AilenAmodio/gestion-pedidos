package entidades;

public class Pendiente extends Estado {
	
	public Pendiente () {
		this.nombre= "pendiente";
	}
	@Override
	public Estado getEstadoSiguiente() {
		// TODO Auto-generated method stub
		return new Pagado();
	}

}
