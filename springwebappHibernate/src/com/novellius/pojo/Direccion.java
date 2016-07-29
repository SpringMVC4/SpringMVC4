package com.novellius.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="Direccion")
public class Direccion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDir;
	private String calle;
	private String cp;
	@ManyToOne
	@JoinColumn(name="idAd")
    private Admin admin;
	public Direccion() {

	}

	public Direccion(String calle, String cp) {
		this.calle = calle;
		this.cp = cp;
		}
	
	public Direccion(int iddir, String calle, String cp) {
		this.idDir = iddir;
		this.calle = calle;
		this.cp = cp;
	}

	public int getIddir() {
		return idDir;
	}

	public void setIddir(int iddir) {
		this.idDir = iddir;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "Direccion [idDir=" + idDir + ", calle=" + calle + ", cp=" + cp + ", admin=" + admin + "]";
	}

	



}
