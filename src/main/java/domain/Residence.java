package domain;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Residence {
	
	private Long idResidence;
	private int taille;
	private int nbrpieces;
	private int nbrchauffages;
	private Personne personne;
	private Collection<Equipements>listequipements;
	
	@Id
	@GeneratedValue
	public Long getIdResidence() {
		return idResidence;
	}
	public void setIdResidence(Long idResidence) {
		this.idResidence = idResidence;
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public int getNbrpieces() {
		return nbrpieces;
	}
	public void setNbrpieces(int nbrpieces) {
		this.nbrpieces = nbrpieces;
	}
	public int getNbrchauffages() {
		return nbrchauffages;
	}
	public void setNbrchauffages(int nbrchauffages) {
		this.nbrchauffages = nbrchauffages;
	}
	
	@ManyToOne()
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	
	@OneToMany (mappedBy = "residence")
	public Collection<Equipements> getListequipements() {
		return listequipements;
	}
	public void setListequipements(Collection<Equipements> listequipements) {
		this.listequipements = listequipements;
	}
	
	
	

}
