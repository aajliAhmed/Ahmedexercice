package web;

import java.io.IOException;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Categorie;
import metier.CategorieImpl;
import metier.ICategorieMetier;
import metier.Produit;
import metier.Rayon;

public class ControleurMarketServlet extends HttpServlet {
	private ICategorieMetier metier;

	@Override
	public void init() throws ServletException {

		metier = new CategorieImpl();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String action = req.getParameter("action");
		if(action != null) {
			if(action.equals("save")) {
				try {
					String nomProd = req.getParameter("nomProd");
					Long prix = Long.parseLong(req.getParameter("prix"));
					int nombreItem = Integer.parseInt(req.getParameter("nombreItem"));
					metier.addProduit(new Produit(nomProd, prix, nombreItem));
				}catch(Exception e) {
					req.setAttribute("exception", e.getMessage());
				}
			}
			if(action.equals("save1")) {
				try {
					String nomCat = req.getParameter("nomCat");
					metier.addCategorie(new Categorie(nomCat));
				}catch(Exception e) {
					req.setAttribute("exception", e.getMessage());
				}
			}
			if(action.equals("save2")) {
				try {
					boolean rayonFrais = Boolean.parseBoolean(req.getParameter("rayonFrais"));
					String nomResponsable = req.getParameter("nomResponsable");
					metier.addCRayon(new Rayon(rayonFrais, nomResponsable));
				}catch(Exception e) {
					req.setAttribute("exception", e.getMessage());
				}
			}
		}
		req.setAttribute("produits",metier.listProduits());
		req.setAttribute("cats",metier.listCategorie());
		req.setAttribute("rayon",metier.listRayon());
		req.getRequestDispatcher("vues/market.jsp").forward(req,resp);
	}
}
