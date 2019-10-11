package eu.ensup.master2.medecinpatientmockito2.service;

import java.util.ArrayList;

import eu.ensup.master2.medecinpatientmockito2.dao.IMedecinDao;
import eu.ensup.master2.medecinpatientmockitoé.domaine.Medecin;
import eu.ensup.master2.medecinpatientmockitoé.domaine.Patient;

/**
 * @author benja Méthode consulter ayant en paramètre Medecin et Patient
 */
public class MedecinService {

//	public IMedecinDao dao;

	private IMedecinDao dao;

	/**
	 * @param dao
	 */
	// pour les test v2, v3 et v4
	public MedecinService(IMedecinDao dao) {
		super();
		this.dao = dao;
	}

	public void consulter(Medecin m1, Patient p1) {
		System.out.println("Le patient " + p1.getNom() + " est malade, il sera soigné par " + m1.getNom());
	}

	public void creerMedecin(Medecin m1) {
		this.dao.creerMedecin(m1);
	}

	public ArrayList<Medecin> lireMedecin(int id) {
		ArrayList<Medecin> ArrayUnMedecin = new ArrayList<>();
		ArrayUnMedecin = this.dao.getById(id);

		return ArrayUnMedecin;
	}

	public Medecin lireUnMedecin(int id) {
		Medecin medecin = new Medecin();
		medecin = this.dao.getMedecinById(id);
		return medecin;
	}
}
