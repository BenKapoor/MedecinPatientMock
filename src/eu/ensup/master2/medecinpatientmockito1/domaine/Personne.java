package eu.ensup.master2.medecinpatientmockito1.domaine;

/**
 * @author benja
 *
 *         Class metier Personne
 */
public class Personne {

	private int id;
	private String nom;
	private String prenom;
	private String adresse;

	/**
	 *
	 */
	public Personne() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 */
	public Personne(int id, String nom, String prenom, String adresse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

	public String getAdresse() {
		return this.adresse;
	}

	public int getId() {
		return this.id;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Personne [id=" + this.id + ", nom=" + this.nom + ", prenom=" + this.prenom + ", adresse=" + this.adresse
				+ "]";
	}

}
