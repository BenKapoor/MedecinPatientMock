package eu.ensup.master2.medecinpatientv4.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import eu.ensup.master2.medecinpatientv4.domaine.Medecin;
import eu.ensup.master2.medecinpatientv4.service.MedecinService;

// @InjectMock
public class TestMedecinDaoV4 {
	// 1- Mocker l'interface du dao
	@Mock
	IMedecinDao dao;
	// Injecte le service
	@InjectMocks
	MedecinService service;

	@Test
	public void testLectureInfoMedecin() {
		// Permet d'initialiser l'objet mock
		MockitoAnnotations.initMocks(this);
		/**
		 * Sénario de test : La demande de lecture de l'information d'un médecin à
		 * partir de son identifiant nous ramène la totalité des informations de ses
		 * caractéristiques
		 */

		// 3- Imposer un comportement au mock(stubber)
		Mockito.when(this.dao.getMedecinById(1)).thenReturn(new Medecin(1, "JJ", "KK", "adresse", "disponibilite"));

		// 4- Appeler une méthode du service
		Medecin medecin = service.lireUnMedecin(1);

		// 5- Comparer le résultat réel avec le résultat attendu
		Assertions.assertEquals(medecin.getId(), 1);

		// verifier l'appel et le nombre de fois
		Mockito.verify(dao, Mockito.times(1)).getMedecinById(1);
	}
}
