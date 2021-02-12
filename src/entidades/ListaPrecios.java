package entidades;

import java.util.ArrayList;
import java.util.List;

public class ListaPrecios {
	private long id;
	private List<Producto> ListaProductos;  
	private String provedor;
	
	public ListaPrecios (String provedor) {
		this.id= id;
		this.provedor=provedor;
		this.ListaProductos= new ArrayList <>();
	}

	public long getId() {
		return id;
	}

	public List<Producto> getListaProductos() {
		return ListaProductos;
	}

	public String getProvedor() {
		return provedor;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		ListaProductos = listaProductos;
	}

	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}
	
}