package Mathieu_De_Jesus.pglp_3_5;

import java.time.LocalDateTime;

public class AfficheMetier implements AffichageMetier{

	public void afficheDebut() {
		System.out.println(LocalDateTime.now() + " : Début de UneMethodeMetier");
	}

	public void afficheFin() {
		System.out.println(LocalDateTime.now() + " : Fin de UneMethodeMetier");
	}

}
