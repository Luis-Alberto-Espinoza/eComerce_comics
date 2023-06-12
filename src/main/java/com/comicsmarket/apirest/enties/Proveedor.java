package com.comicsmarket.apirest.enties;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "proveedores")
public class Proveedor implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="proveedor")
	private String proveedor;
	@Column(name="contacto_nombre")
	private String contacto_nombre;
	@Column(name="contacto_email")
	private String contacto_email;
	@Column(name="contacto_telefono")
	private String contacto_telefono;
	@Column(name="contacto_direccion")
	private String contacto_direccion;
	
	public Proveedor() {
	}

	public Proveedor(Long id, String proveedor, String contacto_nombre, String contacto_email, String contacto_telefono,
			String contacto_direccion) {
		this.id = id;
		this.proveedor = proveedor;
		this.contacto_nombre = contacto_nombre;
		this.contacto_email = contacto_email;
		this.contacto_telefono = contacto_telefono;
		this.contacto_direccion = contacto_direccion;
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
	 * @return the proveedor
	 */
	public String getProveedor() {
		return proveedor;
	}

	/**
	 * @param proveedor the proveedor to set
	 */
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	/**
	 * @return the contacto_nombre
	 */
	public String getContacto_nombre() {
		return contacto_nombre;
	}

	/**
	 * @param contacto_nombre the contacto_nombre to set
	 */
	public void setContacto_nombre(String contacto_nombre) {
		this.contacto_nombre = contacto_nombre;
	}

	/**
	 * @return the contacto_email
	 */
	public String getContacto_email() {
		return contacto_email;
	}

	/**
	 * @param contacto_email the contacto_email to set
	 */
	public void setContacto_email(String contacto_email) {
		this.contacto_email = contacto_email;
	}

	/**
	 * @return the contacto_telefono
	 */
	public String getContacto_telefono() {
		return contacto_telefono;
	}

	/**
	 * @param contacto_telefono the contacto_telefono to set
	 */
	public void setContacto_telefono(String contacto_telefono) {
		this.contacto_telefono = contacto_telefono;
	}

	/**
	 * @return the contacto_direccion
	 */
	public String getContacto_direccion() {
		return contacto_direccion;
	}

	/**
	 * @param contacto_direccion the contacto_direccion to set
	 */
	public void setContacto_direccion(String contacto_direccion) {
		this.contacto_direccion = contacto_direccion;
	}

	@Override
	public String toString() {
		return "Proveedor [id=" + id + ", proveedor=" + proveedor + ", contacto_nombre=" + contacto_nombre
				+ ", contacto_email=" + contacto_email + ", contacto_telefono=" + contacto_telefono
				+ ", contacto_direccion=" + contacto_direccion + "]";
	}

}
