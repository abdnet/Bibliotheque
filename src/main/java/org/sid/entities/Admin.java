package org.sid.entities;


import java.util.Date;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="ADMIN")
public class Admin extends Utilisateur {

	private static final long serialVersionUID = 1L;

	public Admin(String nom, String prenom, String adresse, String email, String mdp, String sexe, String telephone,
			Date dateInscription, Date dateNaissance, boolean statut) {
		super(nom, prenom, adresse, email, mdp, sexe, telephone, dateInscription, dateNaissance, statut);
		// TODO Auto-generated constructor stub
	}

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Admin [getNom()=" + getNom() + ", getPrenom()=" + getPrenom()
				+ ", getAdresse()=" + getAdresse() + ", getEmail()="
				+ getEmail() + ", getMdp()=" + getMdp()
				+ ", getDateInscription()=" + getDateInscription()
				+ ", getDateNaissance()=" + getDateNaissance()
				+ ", isStatut()=" + isStatut() + ", getId()=" + getId()
				+ ", getSexe()=" + getSexe() + ", getTelephone()="
				+ getTelephone() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	
}
