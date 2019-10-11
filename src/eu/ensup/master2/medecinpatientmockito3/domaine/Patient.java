package eu.ensup.master2.medecinpatientmockito3.domaine;

/**
 * @author benja Class métier Médecin
 *
 *         Hérite la classe Personne
 */
public class Patient extends Personne {

	private String symptome;
	private Medecin medecin;

	/**
	 *
	 */
	public Patient() {
		super();
	}

	/**
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param adresse
	 * @param symptome
	 * @param medecin
	 */
	public Patient(int id, String nom, String prenom, String adresse, String symptome, Medecin medecin) {
		super(id, nom, prenom, adresse);
		this.symptome = symptome;
		this.medecin = medecin;
	}

	/**
	 * @param symptome
	 * @param medecin
	 */
	public Patient(String symptome, Medecin medecin) {
		super();
		this.symptome = symptome;
		this.medecin = medecin;
	}

	public Medecin getMedecin() {
		return this.medecin;
	}

	public String getSymptome() {
		return this.symptome;
	}

	public void setMedecin(Medecin medecin) {
		this.medecin = medecin;
	}

	public void setSymptome(String symptome) {
		this.symptome = symptome;
	}

	@Override
	public String toString() {
		return "Patient [symptome=" + this.symptome + ", medecin=" + this.medecin + "]";
	}
}
