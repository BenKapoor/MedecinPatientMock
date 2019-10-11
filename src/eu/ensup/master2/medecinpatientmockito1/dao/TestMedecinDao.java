package eu.ensup.master2.medecinpatientmockito1.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import eu.ensup.master2.medecinpatientmockito1.domaine.Medecin;
import eu.ensup.master2.medecinpatientmockito1.service.MedecinService;

public class TestMedecinDao {
	/**
	 *
	 */
	@Test
	public void testLectureInfoMedecin() {
		/**
		 * Sénario de test : La demande de lecture de l'information d'un médecin à
		 * partir de son identifiant nous ramène la totalité des informations de ses
		 * caractéristiques
		 */

		// 1- Mocker l'interface du dao
		IMedecinDao dao = Mockito.mock(IMedecinDao.class);

		// 2- Créer le service -> remettre le constructeur dans le service
		MedecinService service = new MedecinService(dao);

		// 3- Imposer un comportement au mock(stubber)
		Mockito.when(dao.getMedecinById(1)).thenReturn(new Medecin(1, "JJ", "KK", "adresse", "disponibilite"));

		// 4- Appeler une méthode du service
		Medecin medecin = service.lireUnMedecin(1);

		// 5- COmparer le résultat réel avec le résultat attendu
		Assertions.assertEquals(medecin.getId(), 1);
	}
}
