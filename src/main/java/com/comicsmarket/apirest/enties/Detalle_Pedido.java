package com.comicsmarket.apirest.enties;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "detalles_pedido")
public class Detalle_Pedido implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="cantidad")
	private int cantidad;
	@Column(name="subtotal")
	private float subtotal;
	@Column(name="producto")
	private int producto;
	@Column(name="cliente")
	private int cliente;	
	@Column(name="factura")
	private int factura;	
	
	public Detalle_Pedido() {
	}

	public Detalle_Pedido(Long id, String descripcion, int cantidad, float subtotal, int producto, int cliente,
			int factura) {
		this.id = id;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		this.subtotal = subtotal;
		this.producto = producto;
		this.cliente = cliente;
		this.factura = factura;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the cantidad
	 */
	public int getCantidad() {
		return cantidad;
	}

	/**
	 * @param cantidad the cantidad to set
	 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	/**
	 * @return the subtotal
	 */
	public float getSubtotal() {
		return subtotal;
	}

	/**
	 * @param subtotal the subtotal to set
	 */
	public void setSubtotal(float subtotal) {
		this.subtotal = subtotal;
	}

	/**
	 * @return the producto
	 */
	public int getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(int producto) {
		this.producto = producto;
	}

	/**
	 * @return the cliente
	 */
	public int getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the factura
	 */
	public int getFactura() {
		return factura;
	}

	/**
	 * @param factura the factura to set
	 */
	public void setFactura(int factura) {
		this.factura = factura;
	}

	@Override
	public String toString() {
		return "Detalle_Producto [id=" + id + ", descripcion=" + descripcion + ", cantidad=" + cantidad + ", subtotal="
				+ subtotal + ", producto=" + producto + ", cliente=" + cliente + ", factura=" + factura + "]";
	}	
}
