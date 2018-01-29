package org.sid.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Adherent implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	@Column(unique=true)
	private String email;
	private String nom, prenom, adresse, mdp, sexe, telephone;
	private Date dateInscription, dateNaissance;
	private boolean statut;
	//@OneToMany(mappedBy = "adherent", cascade = CascadeType.ALL)
	private List<Reservation> reservation;
	//@OneToMany
	private List<Livre> favoris;
	//@OneToMany
	//@Where(clause="dateRestitutionReel<>null")
	private List<Reservation> historique;
	//@OneToMany
	//@Where(clause="retard=true")
	private List<Reservation> retards;
	private Date finAbonnement;
	
	public Adherent(String nom, String prenom, String adresse, String email,
			String mdp, String sexe, String telephone, Date dateNaissance,
			Date finAbonnement) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.email = email;
		this.mdp = mdp;
		this.sexe = sexe;
		this.telephone = telephone;
		this.dateNaissance = dateNaissance;
		this.finAbonnement = finAbonnement;
		this.dateInscription=new Date();
		this.statut=true;
		this.favoris=new ArrayList<Livre>();
		this.historique=new ArrayList<Reservation>();
		
	}

	public Adherent() {
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

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public List<Livre> getFavoris() {
		return favoris;
	}

	public void setFavoris(List<Livre> favoris) {
		this.favoris = favoris;
	}

	public List<Reservation> getHistorique() {
		return historique;
	}

	public void setHistorique(List<Reservation> historique) {
		this.historique = historique;
	}

	public List<Reservation> getRetards() {
		return retards;
	}

	public void setRetards(List<Reservation> retards) {
		this.retards = retards;
	}

	public Date getFinAbonnement() {
		return finAbonnement;
	}

	public void setFinAbonnement(Date finAbonnement) {
		this.finAbonnement = finAbonnement;
	}

	

	public long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Adherent [nom=" + nom + ", prenom=" + prenom + ", adresse="
				+ adresse + ", email=" + email + ", mdp=" + mdp + ", sexe="
				+ sexe + ", telephone=" + telephone + ", dateInscription="
				+ dateInscription + ", dateNaissance=" + dateNaissance
				+ ", statut=" + statut + ", finAbonnement=" + finAbonnement
				+  "]";
	}
	
	
	
	
}
