package org.upn.edu.pe.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Productos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int IdProducto;
	@Column(name = "descripcion")
	private String Descripcion;
	@Column(name = "precio")
	private double PrecioUnidad;
	@Column(name = "stock")
	private int Stock;
	@Column(name="estado")
	private char Estado;
	
	
	@Column (name="imagen")
	private String Imagen;
	@Column (name="modelo")
	private String Modelo;
	@Column (name="fabricante")
	private String Fabricante;
	
	
	public Productos() {
	}


	public Productos(int idProducto, String descripcion, double precioUnidad, int stock, char estado, String imagen,
			String modelo, String fabricante) {
		IdProducto = idProducto;
		Descripcion = descripcion;
		PrecioUnidad = precioUnidad;
		Stock = stock;
		Estado = estado;
		Imagen = imagen;
		Modelo = modelo;
		Fabricante = fabricante;
	}


	public int getIdProducto() {
		return IdProducto;
	}


	public void setIdProducto(int idProducto) {
		IdProducto = idProducto;
	}


	public String getDescripcion() {
		return Descripcion;
	}


	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}


	public double getPrecioUnidad() {
		return PrecioUnidad;
	}


	public void setPrecioUnidad(double precioUnidad) {
		PrecioUnidad = precioUnidad;
	}


	public int getStock() {
		return Stock;
	}


	public void setStock(int stock) {
		Stock = stock;
	}


	public char getEstado() {
		return Estado;
	}


	public void setEstado(char estado) {
		Estado = estado;
	}


	public String getImagen() {
		return Imagen;
	}


	public void setImagen(String imagen) {
		Imagen = imagen;
	}


	public String getModelo() {
		return Modelo;
	}


	public void setModelo(String modelo) {
		Modelo = modelo;
	}


	public String getFabricante() {
		return Fabricante;
	}


	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}



	
}
