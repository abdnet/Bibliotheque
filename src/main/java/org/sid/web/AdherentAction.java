package org.sid.web;

import java.util.Date;
import java.util.List;

import org.sid.entities.Adherent;
import org.sid.metier.IAdherentMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class AdherentAction extends ActionSupport {
	@Autowired
	public  IAdherentMetier adherent;
	public Long id;
	public String nom,prenom,mdp,email,adresse;
	public List<Adherent> adherents;
	
	public String index(){
		adherents=adherent.getAll(true);
		return SUCCESS;
	}
	
	public String save(){
		Adherent a = new Adherent();
		a.setAdresse(adresse);
		a.setEmail(email);
		a.setNom(nom);
		a.setPrenom(prenom);
		a.setMdp(mdp);
		a.setDateInscription(new Date());
		a.setDateNaissance(new Date());
		a.setSexe("");
		adherent.addAdherent(a);
		
		adherents=adherent.getAll(true);
		
		return SUCCESS;
	}
}

