package pe.edu.upc.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idInvoice;
	
	@Column(name="mont",nullable = false, length = 10)
	private int mont;
	
	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="datepayment",nullable = false)
	private Date datepayment;
	
	@ManyToOne
	@JoinColumn(name = "idService")
	private Service service;

	public Invoice() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Invoice(int idInvoice, int mont, Date datepayment, Service service) {
		super();
		this.idInvoice = idInvoice;
		this.mont = mont;
		this.datepayment = datepayment;
		this.service = service;
	}

	public int getIdInvoice() {
		return idInvoice;
	}

	public void setIdInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}

	public int getMont() {
		return mont;
	}

	public void setMont(int mont) {
		this.mont = mont;
	}

	public Date getDatepayment() {
		return datepayment;
	}

	public void setDatepayment(Date datepayment) {
		this.datepayment = datepayment;
	}

	public Service getService() {
		return service;
	}

	public void setService(Service service) {
		this.service = service;
	}

	
	
	
}
