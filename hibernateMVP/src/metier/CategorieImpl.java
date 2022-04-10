package metier;
import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import util.HibernateUtil;

public class CategorieImpl implements ICategorieMetier,Serializable {

	@Override
	public void addProduit(Produit p) {
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(p);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
	}

	@Override
	public void addCategorie(Categorie c) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(c);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
	}

	@Override
	public void addCRayon(Rayon r) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		try {
			session.save(r);
		} catch (Exception e) {
			session.getTransaction().rollback();
			e.printStackTrace();
		}
		session.getTransaction().commit();
		
	}

	@Override
	public List<Produit> listProduits() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req =  session.createQuery("select p from Produit p");
		List<Produit> prods = req.list();
		session.getTransaction().commit();
		
		return prods;
	}

	@Override
	public List<Categorie> listCategorie() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req =  session.createQuery("select p from Categorie p");
		List<Categorie> prods = req.list();
		session.getTransaction().commit();
		
		return prods;
	}

	@Override
	public List<Rayon> listRayon() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Query req =  session.createQuery("select p from Rayon p");
		List<Rayon> prods = req.list();
		session.getTransaction().commit();
		
		return prods;
	}

	
	
}
