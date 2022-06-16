package pe.edu.upc.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Company")
public class Empresa {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idCompany;
	@Column(name = "nameCompany", length = 50,nullable = false)
	private String nameCompany;
	@Column(name = "ruCompany", length = 11,nullable = false)
	private String ruCompany;
	@Column(name = "phoneCompany", length = 9,nullable = false)
	private String phoneCompany;
	@Column(name = "addressCompany", length = 80,nullable = false)
	private String addressCompany;
	
	@ManyToOne
	@JoinColumn(name = "idTypeSuscription")
	private TypeSuscription typesuscription;

	public Empresa() {
		super();
		//TODO Auto-generated constructor stub
	}

	public Empresa(int idCompany, String nameCompany, String ruCompany, String phoneCompany, String addressCompany,
			TypeSuscription typesuscription) {
		super();
		this.idCompany = idCompany;
		this.nameCompany = nameCompany;
		this.ruCompany = ruCompany;
		this.phoneCompany = phoneCompany;
		this.addressCompany = addressCompany;
		this.typesuscription = typesuscription;
	}

	public int getIdCompany() {
		return idCompany;
	}

	public void setIdCompany(int idCompany) {
		this.idCompany = idCompany;
	}

	public String getNameCompany() {
		return nameCompany;
	}

	public void setNameCompany(String nameCompany) {
		this.nameCompany = nameCompany;
	}

	public String getRuCompany() {
		return ruCompany;
	}

	public void setRuCompany(String ruCompany) {
		this.ruCompany = ruCompany;
	}

	public String getPhoneCompany() {
		return phoneCompany;
	}

	public void setPhoneCompany(String phoneCompany) {
		this.phoneCompany = phoneCompany;
	}

	public String getAddressCompany() {
		return addressCompany;
	}

	public void setAddressCompany(String addressCompany) {
		this.addressCompany = addressCompany;
	}

	public TypeSuscription getTypesuscription() {
		return typesuscription;
	}

	public void setTypesuscription(TypeSuscription typesuscription) {
		this.typesuscription = typesuscription;
	}
	
	
	
	
	
}
