package org.sid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.entities.Adherent;

public class AdherentDao implements IAdherentDao{
	@PersistenceContext
	protected EntityManager em;

	@Override
	public Adherent addAdherent(Adherent obj) {
		if (obj != null && true==this.NotExiste(obj.getEmail())) {
			em.persist(obj);
			if (this.NotExiste(obj.getEmail())) {
				return this.getAdherentByEmail(obj.getEmail());
			}
			return null;
		} else
			return null;
		
	}

	@Override
	public void deleteAdherent(Long idobj) {
		Adherent a  = this.getAdherentById(idobj);
		if(a!=null){
			em.remove(a);
		}
	}

	@Override
	public Adherent updateAdherent(Adherent obj) {
		Adherent a = this.getAdherentById(obj.getId());
		if(a!=null){
			return em.merge(obj);
		}
		return obj;
	}

	@Override
	public Adherent getAdherentById(Long idObj) {
		Adherent a= em.find(Adherent.class, idObj);
		if(a!=null){
			return a;
		}
		return null;
	}
	@Override
	public Adherent getAdherentByEmail(String idObj) {
		Adherent a= em.find(Adherent.class, idObj);
		if(a!=null){
			return a;
		}
		return null;
	}
	

	@Override
	public List<Adherent> getAll(boolean statut) {
		Query query = em.createQuery("select a from Adherent as a where a.statut=:x");
		query.setParameter("x", statut);
		return query.getResultList();
	}

	
	@Override
	public void DeleteAll() {
//		List<Adherent> adherents = this.getAll();
//		for(Adherent a:adherents){
//			this.deleteAdherent(a.getId());
//		}
	}
	public boolean NotExiste(String email){
		 Query q =em.createQuery("select a from Adherent a where a.email=:x");
		 q.setParameter("x", email);
		 
			if( q.getSingleResult()==null){
				return true;
			}else
			return false;
		}

	
}
