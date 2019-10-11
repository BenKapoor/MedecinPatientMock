package eu.ensup.master2.medecinpatientmockito2.dao;

import java.util.ArrayList;

import eu.ensup.master2.medecinpatientmockito2.domaine.Medecin;
import eu.ensup.master2.medecinpatientmockito2.domaine.Patient;

public interface IMedecinDao {

	public void consulter(Medecin m1, Patient p1);

	public void creerMedecin(Medecin m1);

	public ArrayList<Medecin> getById(int id);

	public Medecin getMedecinById(int id);

}
