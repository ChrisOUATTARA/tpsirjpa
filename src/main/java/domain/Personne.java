package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Generated;

@Entity 
public class Personne {
	private Long idPersonne;
	private String nom;
	private String prenom;
	private String mail;
	private Collection<Residence> listResidence;
	
	
	@Id 
	@GeneratedValue
	public Long getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	@OneToMany (mappedBy = "personne")
	public Collection<Residence> getListResidence() {
		return listResidence;
	}
	public void setListResidence(Collection<Residence> listResidence) {
		this.listResidence = listResidence;
	}
	

}
