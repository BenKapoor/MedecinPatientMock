package eu.ensup.master2.medecinpatientmockito3.domaine;

/**
 * @author benja
 *
 *         Class metier de Patient associé à celle de Medecin
 *
 *         Hérite de la classe Personne
 */
public class Medecin extends Personne {

	private String disponibilite;
	private Patient patient;

	/**
	 *
	 */
	public Medecin() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param disponibilite
	 */
	public Medecin(int id, String nom, String prenom, String adresse, String disponibilite) {
		super(id, nom, prenom, adresse);
		this.disponibilite = disponibilite;
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param disponibilite
	 * @param patient
	 */
	public Medecin(int id, String nom, String prenom, String adresse, String disponibilite, Patient patient) {
		super(id, nom, prenom, adresse);
		this.disponibilite = disponibilite;
		this.patient = patient;
	}

	/**
	 * @param disponibilite
	 * @param patient
	 */
	public Medecin(String disponibilite, Patient patient) {
		super();
		this.disponibilite = disponibilite;
		this.patient = patient;
	}

	public String getDisponibilite() {
		return this.disponibilite;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Override
	public String toString() {
		return "Medecin [disponibilite=" + this.disponibilite + ", patient=" + this.patient + ", getAdresse()="
				+ this.getAdresse() + ", getId()=" + this.getId() + ", getNom()=" + this.getNom() + ", getPrenom()="
				+ this.getPrenom() + "]";
	}

}
