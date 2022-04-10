package metier;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Rayon")
public class Rayon implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_Rayon")
	private int id;
	@Column(name="Rayon_Frais")
	private boolean rayonFrais;
	@Column(name="Nom_Responsable")
	private String nomResponsable;
	
	
	public boolean isRayonFrais() {
		return rayonFrais;
	}
	public void setRayonFrais(boolean rayonFrais) {
		this.rayonFrais = rayonFrais;
	}
	public String getNomResponsable() {
		return nomResponsable;
	}
	public Rayon() {
	}
	public Rayon(boolean rayonFrais, String nomResponsable) {
		this.rayonFrais = rayonFrais;
		this.nomResponsable = nomResponsable;
	}
	public void setNomResponsable(String nomResponsable) {
		this.nomResponsable = nomResponsable;
	}
}
