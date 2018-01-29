package org.sid.entities;

import java.util.Date;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value="AGENT")
public class Agent extends Utilisateur{
	private static final long serialVersionUID = 1L;

	private int dureeContrat;
	private String typeContrat;
	private Date finContrat;
	

	public Agent(String nom, String prenom, String adresse, String email, String mdp, String sexe, String telephone,
			Date dateInscription, Date dateNaissance, boolean statut) {
		super(nom, prenom, adresse, email, mdp, sexe, telephone, dateInscription, dateNaissance, statut);
		// TODO Auto-generated constructor stub
	}

	public Agent() {
		// TODO Auto-generated constructor stub
	}

	public int getDureeContrat() {
		return dureeContrat;
	}

	public void setDureeContrat(int dureeContrat) {
		this.dureeContrat = dureeContrat;
	}

	public String getTypeContrat() {
		return typeContrat;
	}

	public void setTypeContrat(String typeContrat) {
		this.typeContrat = typeContrat;
	}

	public Date getFinContrat() {
		return finContrat;
	}

	public void setFinContrat(Date finContrat) {
		this.finContrat = finContrat;
	}

	@Override
	public String toString() {
		return "Agent [dureeContrat=" + dureeContrat + ", typeContrat="
				+ typeContrat + ", finContrat=" + finContrat + "]";
	}
	
	

}

