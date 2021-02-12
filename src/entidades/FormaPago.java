package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class FormaPago {
	private int cantidadPagos;
	private List <Date> fechasPago= new ArrayList <>();
	private List <Date> PagosRealizados= new ArrayList<>();
	
	
	public int getCantidadPagos() {
		return cantidadPagos;
	}
	public List<Date> getFechasPago() {
		return fechasPago;
	}
	public List<Date> getPagosRealizados() {
		return PagosRealizados;
	}
	public void setCantidadPagos(int cantidadPagos) {
		this.cantidadPagos = cantidadPagos;
	}
	public void setFechasPago(List<Date> fechasPago) {
		this.fechasPago = fechasPago;
	}
	public void setPagosRealizados(List<Date> pagosRealizados) {
		PagosRealizados = pagosRealizados;
	}
	
	public void Pagar (Date fecha, Double monto) {
		PagosRealizados.add(fecha);
	}
}
