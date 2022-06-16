package pe.edu.upc.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Vaccine")
public class Vaccine {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idVaccine;
	@Column(name = "descriptionVaccine",nullable = false, length = 100)
	private String descriptionVaccine;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dateFrabication",nullable = false)
	private Date dateFrabication;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dateExpiration",nullable = false)
	private Date dateExpiration;
	
	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vaccine(int idVaccine, String descriptionVaccine, Date dateFrabication, Date dateExpiration) {
		super();
		this.idVaccine = idVaccine;
		this.descriptionVaccine = descriptionVaccine;
		this.dateFrabication = dateFrabication;
		this.dateExpiration = dateExpiration;
	}
	
	public int getIdVaccine() {
		return idVaccine;
	}
	public void setIdVaccine(int idVaccine) {
		this.idVaccine = idVaccine;
	}
	public String getDescriptionVaccine() {
		return descriptionVaccine;
	}
	public void setDescriptionVaccine(String descriptionVaccine) {
		this.descriptionVaccine = descriptionVaccine;
	}
	public Date getDateFrabication() {
		return dateFrabication;
	}
	public void setDateFrabication(Date dateFrabication) {
		this.dateFrabication = dateFrabication;
	}
	public Date getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(Date dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	
	
}
