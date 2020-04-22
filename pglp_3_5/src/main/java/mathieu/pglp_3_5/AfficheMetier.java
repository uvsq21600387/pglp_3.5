package mathieu.pglp_3_5;

import java.time.LocalDateTime;

/**
 * classe pour l'affichage métier.
 */
public class AfficheMetier implements AffichageMetier {
    /**
     * fonction pour l'affichage du log au début.
     */
    public void afficheDebut() {
        System.out.println(LocalDateTime.now()
                + " : Début de UneMethodeMetier");
    }
    /**
     * fonction pour l'affichage du log à la fin.
     */
    public void afficheFin() {
        System.out.println(LocalDateTime.now()
                + " : Fin de UneMethodeMetier");
    }

}
