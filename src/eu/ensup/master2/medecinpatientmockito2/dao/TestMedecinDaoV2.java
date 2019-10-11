package eu.ensup.master2.medecinpatientmockito2.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import eu.ensup.master2.medecinpatientmockito2.domaine.Medecin;
import eu.ensup.master2.medecinpatientmockito2.service.MedecinService;

public class TestMedecinDaoV2 {
	// 1- Mocker l'interface du dao
	@Mock
	IMedecinDao dao;

	@Test
	public void testLectureInfoMedecin() {
		// Permet d'initialiser l'objet mock
		MockitoAnnotations.initMocks(this);
		/**
		 * S�nario de test : La demande de lecture de l'information d'un m�decin �
		 * partir de son identifiant nous ram�ne la totalit� des informations de ses
		 * caract�ristiques
		 */

		// 2- Cr�er le service -> remettre le constructeur dans le service
		MedecinService service = new MedecinService(dao);

		// 3- Imposer un comportement au mock(stubber)
		Mockito.when(this.dao.getMedecinById(1)).thenReturn(new Medecin(1, "JJ", "KK", "adresse", "disponibilite"));

		// 4- Appeler une m�thode du service
		Medecin medecin = service.lireUnMedecin(1);

		// 5- Comparer le r�sultat r�el avec le r�sultat attendu
		Assertions.assertEquals(medecin.getId(), 1);
	}
}
