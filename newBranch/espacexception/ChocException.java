package espacexception;

import espace.CorpsCosmiqueable;

public class ChocException extends Exception{
	/**
	 * 
	 */
	private CorpsCosmiqueable premiere, seconde;
	
	public ChocException(CorpsCosmiqueable a1, CorpsCosmiqueable a2) {
		premiere = a1;
		seconde = a2;
	}
	
	public CorpsCosmiqueable getObjNum(int num) {
		if(num == 0) {
			return premiere;
		}else {
			return seconde;
		}
	}
}
