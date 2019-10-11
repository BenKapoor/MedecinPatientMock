package eu.ensup.master2.medecinpatientmockito2.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import eu.ensup.master2.medecinpatientmockito2.service.MedecinService;
import eu.ensup.master2.medecinpatientmockitoé.domaine.Medecin;

public class TestMedecinDaoV2 {
	// 1- Mocker l'interface du dao
	@Mock
	IMedecinDao dao;

	@Test
	public void testLectureInfoMedecin() {
		// Permet d'initialiser l'objet mock
		MockitoAnnotations.initMocks(this);
		/**
		 * Sénario de test : La demande de lecture de l'information d'un médecin à
		 * partir de son identifiant nous ramène la totalité des informations de ses
		 * caractéristiques
		 */

		// 2- Créer le service -> remettre le constructeur dans le service
		MedecinService service = new MedecinService(dao);

		// 3- Imposer un comportement au mock(stubber)
		Mockito.when(this.dao.getMedecinById(1)).thenReturn(new Medecin(1, "JJ", "KK", "adresse", "disponibilite"));

		// 4- Appeler une méthode du service
		Medecin medecin = service.lireUnMedecin(1);

		// 5- Comparer le résultat réel avec le résultat attendu
		Assertions.assertEquals(medecin.getId(), 1);
	}
}
