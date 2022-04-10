package test;

import java.util.List;

import metier.Categorie;
import metier.CategorieImpl;
import metier.Produit;

public class TestProject {
public static void main(String[] args) {
	
	CategorieImpl metier = new CategorieImpl();
	metier.addCategorie(new Categorie("Fromage"));
	
	
		//CategorieImpl metier = new CategorieImpl();
		metier.addProduit(new Produit("Dell",13L,101));
		metier.addProduit(new Produit("GGGG",123L,102));
		metier.addProduit(new Produit("JHGJKH",133L,130));
		metier.addProduit(new Produit("KHKG", 153L, 133));
		/*
		List<Produit> prods = metier.listProduits();
		for(Produit p : prods) {
			System.out.println(p.getDesignation());
		}
		
		*/
}
}

