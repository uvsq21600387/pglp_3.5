package Mathieu_De_Jesus.pglp_3_5;

public class UneClasseMetier{
	
	AfficheMetier am;
	
	public UneClasseMetier(AfficheMetier am) {
		this.am = am;
	}
	
	public void uneMethodeMetier() {
		am.afficheDebut(); // log message
		
		//Traitements métiers
		
		am.afficheFin(); // log message
	}
}
