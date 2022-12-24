package tk.lvicenteaa.ejercicios.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nombre;
	private Double precio;
	private String modelo;

	public Laptop(Long id, String nombre, Double precio, String modelo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.modelo = modelo;
	}

	public Laptop(String nombre, Double precio, String modelo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.modelo = modelo;
	}

	public Laptop() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

}
