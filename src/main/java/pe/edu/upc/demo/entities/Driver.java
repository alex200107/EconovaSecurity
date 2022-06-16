package pe.edu.upc.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Driver")
public class Driver {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDriver;
	@Column(name = "nameDriver", nullable = false, length = 40)
	private String nameDriver;
	@Column(name = "lastnameDriver",nullable =false, length = 40)
	private String lastnameDriver;
	@Column(name = "anios",nullable =false)
	private int anios;
	public Driver() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Driver(int idDriver, String nameDriver, String lastnameDriver, int anios) {
		super();
		this.idDriver = idDriver;
		this.nameDriver = nameDriver;
		this.lastnameDriver = lastnameDriver;
		this.anios = anios;
	}
	public int getIdDriver() {
		return idDriver;
	}
	public void setIdDriver(int idDriver) {
		this.idDriver = idDriver;
	}
	public String getNameDriver() {
		return nameDriver;
	}
	public void setNameDriver(String nameDriver) {
		this.nameDriver = nameDriver;
	}
	public String getLastnameDriver() {
		return lastnameDriver;
	}
	public void setLastnameDriver(String lastnameDriver) {
		this.lastnameDriver = lastnameDriver;
	}
	public int getAnios() {
		return anios;
	}
	public void setAnios(int anios) {
		this.anios = anios;
	}
	
}
