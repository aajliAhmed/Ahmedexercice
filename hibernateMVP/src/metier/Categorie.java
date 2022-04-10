package metier;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Categorie")
public class Categorie implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idC;
	private String nomCat;
	
	public String getNomCat() {
		return nomCat;
	}
	public Categorie() {

	}
	public Categorie(String nomCat) {
		this.nomCat = nomCat;
	}
	public void setNomCat(String nomCat) {
		this.nomCat = nomCat;
	}
}
