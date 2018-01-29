package test;


import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.sid.entities.Adherent;
import org.sid.metier.IAdherentMetier;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.interceptor.annotations.Before;

public class AdherentTest {
	private IAdherentMetier metier;
	private ClassPathXmlApplicationContext context;
	
	@Before
	public void setUP() throws Exception{
		context = new ClassPathXmlApplicationContext(
				new String[]{"applicationContext.xml"});
		metier=(IAdherentMetier)context.getBean("metier");
	}
	
	@Test
	public void test() {
		Adherent p=new Adherent();
		p.setAdresse("adresse");
		p.setDateInscription(new Date());
		p.setDateNaissance(new Date());
		p.setEmail("idou@gmail.cpm");
		p.setMdp("sdsds");
		p.setNom("adsd");
		p.setPrenom("dsdfé");
		p.setSexe("F");
		metier.addAdherent(p);
		List<Adherent> ll =metier.getAll(true);
		assertTrue(ll.size()==1);


	}

}
