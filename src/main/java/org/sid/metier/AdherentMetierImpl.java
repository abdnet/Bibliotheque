package org.sid.metier;

import java.util.List;

import org.sid.dao.IAdherentDao;
import org.sid.entities.Adherent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service
public class AdherentMetierImpl implements IAdherentMetier{
	private IAdherentDao dao;
	
	public void setDao(IAdherentDao dao) {
		this.dao = dao;
	}

	@Override
	public Adherent addAdherent(Adherent obj) {
		// TODO Auto-generated method stub
		return dao.addAdherent(obj);
	}

	@Override
	public void deleteAdherent(Long obj) {
		dao.deleteAdherent(obj);
	}

	@Override
	public Adherent updateAdherent(Adherent obj) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Adherent getAdherentById(Long idObj) {
		// TODO Auto-generated method stub
		return dao.getAdherentById(idObj);
	}

	@Override
	public List<Adherent> getAll(boolean statut) {
		// TODO Auto-generated method stub
		return dao.getAll(statut);
	}

	@Override
	public void DeleteAll() {
		dao.DeleteAll();
	}

	
	
}
