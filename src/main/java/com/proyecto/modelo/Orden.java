package com.proyecto.modelo;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Orden", schema="dbo")
public class Orden {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int idOrden;
	private String numOrden;
	private Date fechaCompra;
	
	@ManyToOne
	@JoinColumn(name="idcliente")
	private Cliente cliente;
	
	@OneToMany(mappedBy = "orden")
	private List<DetalleOrden> detalle;
	
	public Orden() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orden [idOrden=" + idOrden + ", numOrden=" + numOrden + ", fechaCompra=" + fechaCompra + ", cliente="
				+ cliente + ", detalle=" + detalle + "]";
	}

	public Orden(int idOrden, String numOrden, Date fechaCompra, Cliente cliente, List<DetalleOrden> detalle) {
		super();
		this.idOrden = idOrden;
		this.numOrden = numOrden;
		this.fechaCompra = fechaCompra;
		this.cliente = cliente;
		this.detalle = detalle;
	}

	public int getIdOrden() {
		return idOrden;
	}

	public void setIdOrden(int idOrden) {
		this.idOrden = idOrden;
	}

	public String getNumOrden() {
		return numOrden;
	}

	public void setNumOrden(String numOrden) {
		this.numOrden = numOrden;
	}

	public Date getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(Date fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<DetalleOrden> getDetalle() {
		return detalle;
	}

	public void setDetalle(List<DetalleOrden> detalle) {
		this.detalle = detalle;
	}
	
}
