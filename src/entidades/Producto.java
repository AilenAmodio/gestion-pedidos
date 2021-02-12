package entidades;

public class Producto {
	private String codigo= "";
	private String nombre= "";
	private Double precio= 0.0;
	private Double stock = 0.0;
	private Double impuesto = 0.21;
	private String estadoProducto = "nuevo";
	private Double porcentajeGanancia = 1.3;
	
	
	public Producto (String codigo, String nombre) {
		this.codigo=codigo;
		this.nombre=nombre;
	}


	public String getCodigo() {
		return codigo;
	}


	public String getNombre() {
		return nombre;
	}


	public double getPrecio() {
		return precio;
	}


	public double getStock() {
		return stock;
	}


	public double getImpuesto() {
		return impuesto;
	}


	public String getEstadoProducto() {
		return estadoProducto;
	}


	public double getPorcentajeGanancia() {
		return porcentajeGanancia;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public void setStock(double stock) {
		this.stock = stock;
	}


	public void setImpuesto(double impuesto) {
		this.impuesto = impuesto;
	}


	public void setEstadoProducto(String estadoProducto) {
		this.estadoProducto = estadoProducto;
	}


	public void setPorcentajeGanancia(double porcentajeGanancia) {
		this.porcentajeGanancia = porcentajeGanancia;
	}
	
	public Double getPrecioVenta() {
		return (this.precio* this.porcentajeGanancia) +
				(this.precio * this.impuesto);
		
	}
	
	public Double getPrecioCompra () {
		return this.getPrecio();
		
	}
}
