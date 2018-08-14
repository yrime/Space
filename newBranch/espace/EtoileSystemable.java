package espace;

import java.util.List;

public interface EtoileSystemable {
	/**
	 * 
	 * @param corps list du corps cosmique
	 */
	public void setCorpsCosmiqueList(List<CorpsCosmiqueable> corps );
	/**
	 * 
	 * @param corps un corps cosmique
	 */
	public void setCorpsCosmique(CorpsCosmiqueable corps);
	/**
	 * 
	 * @param etoile set de l'etoide systeme
	 */
	public void setEtoile(CorpsCosmiqueable etoile);
	/**
	 * 
	 * @return obj de l'etoile systeme
	 */
	public CorpsCosmiqueable getEtoile();
	/**
	 * 
	 * @return list de des corps cosmique
	 */
	public List<CorpsCosmiqueable> getCorpsCosmiqueList();
	/**
	 * <p>cet metod en generale dans cette systeme</p>
	 * <p>update params des corps cosmique(force, vitesse, acceleration etc)</p>
	 */
	public void update();
}
