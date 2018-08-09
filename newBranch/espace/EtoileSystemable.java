package espace;

import java.util.List;

public interface EtoileSystemable {
	public void setCorpsCosmiqueList(List<CorpsCosmiqueable> corps );
	public void setCorpsCosmique(CorpsCosmiqueable corps);
	public void setEtoile(CorpsCosmiqueable etoile);
	
	public CorpsCosmiqueable getEtoile();
	public List<CorpsCosmiqueable> getCorpsCosmiqueList();
	
	public void update();
}
