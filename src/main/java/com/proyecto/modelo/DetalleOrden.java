package com.proyecto.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="DetalleOrden", schema="dbo")
public class DetalleOrden {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDetalleOrden;
	private String nombre;
	private int cantidad;
	private double precio;
	private double total;
	
	@ManyToOne
	@JoinColumn(name="idOrden")
	private Orden orden;
	
	@ManyToOne
	@JoinColumn(name="idproducto")
	private Producto producto;
	
	public DetalleOrden() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "DetalleOrden [idDetalleOrden=" + idDetalleOrden + ", nombre=" + nombre + ", cantidad=" + cantidad
				+ ", precio=" + precio + ", total=" + total + ", orden=" + orden + ", producto=" + producto + "]";
	}

	public DetalleOrden(int idDetalleOrden, String nombre, int cantidad, double precio, double total, Orden orden,
			Producto producto) {
		super();
		this.idDetalleOrden = idDetalleOrden;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.precio = precio;
		this.total = total;
		this.orden = orden;
		this.producto = producto;
	}

	public int getIdDetalleOrden() {
		return idDetalleOrden;
	}

	public void setIdDetalleOrden(int idDetalleOrden) {
		this.idDetalleOrden = idDetalleOrden;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Orden getOrden() {
		return orden;
	}

	public void setOrden(Orden orden) {
		this.orden = orden;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	
}
