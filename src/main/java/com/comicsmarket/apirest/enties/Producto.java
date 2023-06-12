package com.comicsmarket.apirest.enties;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "productos")
public class Producto implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name="producto")
	private String producto;
	@Column(name="categoria")
	private int categoria;
	@Column(name="marca")
	private int marca;
	@Column(name="precio_unitario")
	private float precio_unitario;
	@Column(name="stock")
	private int stock;	

	public Producto() {
	}

	public Producto(Long id, String producto, int categoria, int marca, float precio_unitario, int stock) {
		this.id = id;
		this.producto = producto;
		this.categoria = categoria;
		this.marca = marca;
		this.precio_unitario = precio_unitario;
		this.stock = stock;
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
	 * @return the producto
	 */
	public String getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(String producto) {
		this.producto = producto;
	}

	/**
	 * @return the categoria
	 */
	public int getCategoria() {
		return categoria;
	}

	/**
	 * @param categoria the categoria to set
	 */
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}

	/**
	 * @return the marca
	 */
	public int getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(int marca) {
		this.marca = marca;
	}

	/**
	 * @return the precio_unitario
	 */
	public float getPrecio_unitario() {
		return precio_unitario;
	}

	/**
	 * @param precio_unitario the precio_unitario to set
	 */
	public void setPrecio_unitario(float precio_unitario) {
		this.precio_unitario = precio_unitario;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", producto=" + producto + ", categoria=" + categoria + ", marca=" + marca
				+ ", precio_unitario=" + precio_unitario + ", stock=" + stock + "]";
	}
}
