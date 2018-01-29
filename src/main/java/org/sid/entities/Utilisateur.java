package org.sid.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="category",length=3)
public class Utilisateur implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String nom, prenom, adresse, email, mdp, sexe, telephone;
	private Date dateInscription, dateNaissance;
	private boolean statut;
	
	
	public Utilisateur(String nom, String prenom, String adresse, String email, String mdp, String sexe,
			String telephone, Date dateInscription, Date dateNaissance, boolean statut) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.mdp = mdp;
		this.sexe = sexe;
		this.telephone = telephone;
		this.dateInscription = dateInscription;
		this.dateNaissance = dateNaissance;
		this.statut = statut;
	}
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public Date getDateInscription() {
		return dateInscription;
	}
	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	public long getId() {
		return id;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	
	
	
}

