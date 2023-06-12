package com.comicsmarket.apirest.enties;


import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "facturas")
public class Factura implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="numero")
	private String numero;
	@Column(name="tipo_factura")
	private int tipo_factura;
	@Column(name="fecha")
	private Date fecha;
	@Column(name="monto_total")
	private float monto_total;
	@Column(name="nombre")
	private String nombre;
	
	public Factura() {
	}

	public Factura(Long id, String numero, int tipo_factura, Date fecha, float monto_total, String nombre) {
		this.id = id;
		this.numero = numero;
		this.tipo_factura = tipo_factura;
		this.fecha = fecha;
		this.monto_total = monto_total;
		this.nombre = nombre;
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
	 * @return the numero
	 */
	public String getNumero() {
		return numero;
	}

	/**
	 * @param numero the numero to set
	 */
	public void setNumero(String numero) {
		this.numero = numero;
	}

	/**
	 * @return the tipo_factura
	 */
	public int getTipo_factura() {
		return tipo_factura;
	}

	/**
	 * @param tipo_factura the tipo_factura to set
	 */
	public void setTipo_factura(int tipo_factura) {
		this.tipo_factura = tipo_factura;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the monto_total
	 */
	public float getMonto_total() {
		return monto_total;
	}

	/**
	 * @param monto_total the monto_total to set
	 */
	public void setMonto_total(float monto_total) {
		this.monto_total = monto_total;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Factura [id=" + id + ", numero=" + numero + ", tipo_factura=" + tipo_factura + ", fecha=" + fecha
				+ ", monto_total=" + monto_total + ", nombre=" + nombre + "]";
	}
	
}
