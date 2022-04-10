package metier;

import java.util.List;

public interface ICategorieMetier {
	public void addProduit(Produit p);
	public void addCategorie(Categorie c);
	public void addCRayon(Rayon r);
	public List<Produit> listProduits();
	public List<Categorie> listCategorie();
	public List<Rayon> listRayon();
}
