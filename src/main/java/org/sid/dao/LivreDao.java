package org.sid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.sid.entities.Livre;

public class LivreDao implements IlivreDao {
	@PersistenceContext
	protected EntityManager em;


	@Override
	public Livre addLivre(Livre obj) {
		if(obj!=null && !this.existe(obj.getIsbn())){
			em.persist(obj);
			if(this.existe(obj.getIsbn())){
				return this.getLivreById(obj.getIsbn());
			}
		}
		
		return null;
	}

	@Override
	public void deleteLivre(Long obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Livre updateLivre(Livre obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livre getLivreById(Long idObj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Livre> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void DeleteAll() {
		// TODO Auto-generated method stub
		
	}
	 public boolean existe(Long id){
			if( this.getLivreById(id)!=null && id!=null){
				return true;
			}else
			return false;
		}

}
