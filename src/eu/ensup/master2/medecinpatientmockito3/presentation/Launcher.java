package eu.ensup.master2.medecinpatientmockito3.presentation;

import java.util.Scanner;

import eu.ensup.master2.medecinpatientmockito3.dao.MedecinDao;
import eu.ensup.master2.medecinpatientmockito3.domaine.Medecin;
import eu.ensup.master2.medecinpatientmockito3.domaine.Patient;
import eu.ensup.master2.medecinpatientmockito3.service.MedecinService;

public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medecin m1 = new Medecin();
		Patient p1 = new Patient();

		MedecinDao dao = new MedecinDao();

		// > remettre le constructeur dans le service
		MedecinService medecinService = new MedecinService(dao);

		System.out.println("Entrer l'identifiant du médecin : ");
		Scanner scUnMedecin = new Scanner(System.in);
		int idUnMedecin = scUnMedecin.nextInt();
		Medecin listUnMedecin = new Medecin();
		listUnMedecin = medecinService.lireUnMedecin(idUnMedecin);

		System.out.println(listUnMedecin);

		Patient pat = new Patient(2, "Jeam-Michel", "Patient", "41 rue de la maladie", "Toux", m1);
		Medecin med = new Medecin(2, "Dr", "Alban", "Rue de la pompe", "oui", p1);
		medecinService.creerMedecin(med);
	}
}
