package com.novellius.pojo;

import java.sql.Timestamp;
import java.util.Set;

//import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Admin")
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idAd;
	//@Column(name="nombre")
	private String nombre;
	private String cargo;
	private Timestamp fechaCreacion;
	@OneToMany(mappedBy="admin",fetch = FetchType.EAGER)
    private Set<Direccion> direcciones;
    
	public Admin() {

	}
	
	public Admin(String nombre, String cargo, Timestamp fechaCreacion) {
		this.nombre = nombre;
		this.cargo = cargo;
		this.fechaCreacion = fechaCreacion;
	}
	
	

	public Admin(int idAd, String nombre, String cargo, Timestamp fechaCreacion) {
		this.idAd = idAd;
		this.nombre = nombre;
		this.cargo = cargo;
		this.fechaCreacion = fechaCreacion;
	}

	public int getIdAd() {
		return idAd;
	}

	public void setIdAd(int idAd) {
		this.idAd = idAd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	
	
	public Set<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Set<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	@Override
	public String toString() {
		return "Admin [idAd=" + idAd + ", nombre=" + nombre + ", cargo=" + cargo + ", fechaCreacion=" + fechaCreacion
				+ ", direcciones=" + direcciones + "]";
	}

	

}
