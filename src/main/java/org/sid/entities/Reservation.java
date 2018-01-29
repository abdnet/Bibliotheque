package org.sid.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
@Entity
public class Reservation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idReservation;
	//@ManyToOne
	//@JoinColumn(name="adherentid")
	private Adherent adherent;
	//@ManyToMany
	//@Column(nullable = false)
	private List<Livre> livres;
	//@Column(nullable = false)
	private Date dateReservation;
	//@Column(nullable = false)
	private Date dateRestitutionTheorique;
	private Date dateRestitutionReel;
	private boolean retard;
	
	public Reservation(Adherent idAdherent, List<Livre> livres, Date dateReservation,
			Date dateRestitutionTheorique, Date dateRestitutionReel) {
		this.adherent = idAdherent;
		this.livres = livres;
		this.dateReservation = dateReservation;
		this.dateRestitutionTheorique = dateRestitutionTheorique;
		this.dateRestitutionReel = dateRestitutionReel;
		this.retard = false;
	}

	public Reservation() {
	}

	public Date getDateReservation() {
		return dateReservation;
	}

	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}

	public Date getDateRestitutionTheorique() {
		return dateRestitutionTheorique;
	}

	public void setDateRestitutionTheorique(Date dateRestitutionTheorique) {
		this.dateRestitutionTheorique = dateRestitutionTheorique;
	}

	public Date getDateRestitutionReel() {
		return dateRestitutionReel;
	}

	public void setDateRestitutionReel(Date dateRestitutionReel) {
		this.dateRestitutionReel = dateRestitutionReel;
	}

	public boolean isRetard() {
		return retard;
	}

	public void setRetard(boolean retard) {
		this.retard = retard;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public Adherent getAdherent() {
		return adherent;
	}

	public void setAdherent(Adherent adherent) {
		this.adherent = adherent;
	}

	public List<Livre> getLivres() {
		return livres;
	}

	public void setLivres(List<Livre> livres) {
		this.livres = livres;
	}

	
	
	
	
	
	
	

}
