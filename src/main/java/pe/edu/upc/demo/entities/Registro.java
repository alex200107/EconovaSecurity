package pe.edu.upc.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Registro")
public class Registro {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idRegistro;
	@Column(name = "usuario", length = 30, nullable = false)
	private String usuario;
	@Column(name = "contrasena", length = 30, nullable = false)
	private String contrasena;
	@Column(name = "name", length = 40, nullable = false)
	private String name;
	@Column(name = "lastname", length = 40, nullable = false)
	private String lastname;
	@Column(name = "age", length = 30, nullable = false)
	private int age;
	@Column(name = "genre", length = 30, nullable = false)
	private String genre;
	@Column(name = "DNI", length = 8, nullable = false)
	private String DNI;
	@Column(name = "email", length = 40, nullable = false)
	private String email;

	public Registro() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Registro(int idRegistro, String usuario, String contrasena, String name, String lastname, int age,
			String genre, String dNI, String email) {
		super();
		this.idRegistro = idRegistro;
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
		this.genre = genre;
		DNI = dNI;
		this.email = email;
	}

	public int getIdRegistro() {
		return idRegistro;
	}

	public void setIdRegistro(int idRegistro) {
		this.idRegistro = idRegistro;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	

}
