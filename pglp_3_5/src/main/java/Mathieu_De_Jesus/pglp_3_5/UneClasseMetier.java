package Mathieu_De_Jesus.pglp_3_5;

/**
 * une classe métier.
 */
public class UneClasseMetier {
	/**
	 * pour afficher les logs du métier.
	 */
	AfficheMetier am;
	/**
	 * constructeur de la classe.
	 * @param am initialise l'affichage
	 */
	public UneClasseMetier(final AfficheMetier am) {
		this.am = am;
	}
	/**
	 * fonction pour traiter le métier.
	 */
	public void uneMethodeMetier() {
		am.afficheDebut(); // log message
		//Traitements métiers
		am.afficheFin(); // log message
	}
}
