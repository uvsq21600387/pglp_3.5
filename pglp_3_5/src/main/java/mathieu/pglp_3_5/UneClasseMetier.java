package mathieu.pglp_3_5;

/**
 * une classe métier.
 */
public class UneClasseMetier {
    /**
     * pour afficher les logs du métier.
     */
    private AfficheMetier am;
    /**
     * constructeur de la classe.
     * @param amP initialise l'affichage
     */
    public UneClasseMetier(final AfficheMetier amP) {
        this.am = amP;
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
