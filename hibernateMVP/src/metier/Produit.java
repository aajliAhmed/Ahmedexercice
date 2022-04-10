package metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PRODUITS")
public class Produit implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Produit")
	private int id;
	@Column(name="NOMPRODUIT")
	private String nomProd;
	@Column(name="Prix")
	private long prix;
	private int nombreItem;
	public String getNomProd() {
		return nomProd;
	}
	public void setNomProd(String nomProd) {
		this.nomProd = nomProd;
	}
	public long getPrix() {
		return prix;
	}
	public void setPrix(long prix) {
		this.prix = prix;
	}
	public int getNombreItem() {
		return nombreItem;
	}
	public void setNombreItem(int nombreItem) {
		this.nombreItem = nombreItem;
	}
	public Produit(String nomProd, long prix, int nombreItem) {
		this.nomProd = nomProd;
		this.prix = prix;
		this.nombreItem = nombreItem;
	}
	public Produit() {
		
	}
}
