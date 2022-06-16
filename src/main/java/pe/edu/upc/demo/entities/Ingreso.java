package pe.edu.upc.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Ingreso")
public class Ingreso {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idIngreso;
	@Column(name = "usuario", length = 40, nullable = false)
	private String usuario;
	@Column(name = "contrasena", length = 40, nullable = false)
	private String contrasena;

	public Ingreso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ingreso(int idIngreso, String usuario, String contrasena) {
		super();
		this.idIngreso = idIngreso;
		this.usuario = usuario;
		this.contrasena = contrasena;

	}

	public int getIdIngreso() {
		return idIngreso;
	}

	public void setIdIngreso(int idIngreso) {
		this.idIngreso = idIngreso;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

}
