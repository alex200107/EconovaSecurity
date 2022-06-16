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
@Table(name = "TypeSuscription")
public class TypeSuscription {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTypeSuscription;
	@Column(name = "nameSuscription", nullable = false, length = 80)
	private String nameSuscription;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "datestart", nullable = false)
	private Date datestart;
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dateend", nullable = false)
	private Date dateend;
	
	public TypeSuscription() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public TypeSuscription(int idTypeSuscription, String nameSuscription, Date datestart, Date dateend) {
		super();
		this.idTypeSuscription = idTypeSuscription;
		this.nameSuscription = nameSuscription;
		this.datestart = datestart;
		this.dateend = dateend;
	}

	public int getIdTypeSuscription() {
		return idTypeSuscription;
	}

	public void setIdTypeSuscription(int idTypeSuscription) {
		this.idTypeSuscription = idTypeSuscription;
	}

	public String getNameSuscription() {
		return nameSuscription;
	}

	public void setNameSuscription(String nameSuscription) {
		this.nameSuscription = nameSuscription;
	}

	public Date getDatestart() {
		return datestart;
	}

	public void setDatestart(Date datestart) {
		this.datestart = datestart;
	}

	public Date getDateend() {
		return dateend;
	}

	public void setDateend(Date dateend) {
		this.dateend = dateend;
	}
	
	
}
