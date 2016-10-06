
public class Pixel {
	private int RED_VAL;
	private int GREEN_VAL;
	private int BLUE_VAL;
	
	public Pixel(int aRED_VAL, int aGREEN_VAL, int aBLUE_VAL){
		this.RED_VAL = aRED_VAL;
		this.GREEN_VAL = aGREEN_VAL;
		this.BLUE_VAL = aBLUE_VAL;
	}

	/**
	 * @return the RED_VAL
	 */
	public int getRED_VAL() {
		return RED_VAL;
	}

	/**
	 * @return the GREEN_VAL
	 */
	public int getGREEN_VAL() {
		return GREEN_VAL;
	}

	/**
	 * @return the BLUE_VAL
	 */
	public int getBLUE_VAL() {
		return BLUE_VAL;
	}

	public void setALL(int aRED_VAL, int aGREEN_VAL, int aBLUE_VAL){
		RED_VAL = aRED_VAL;
		GREEN_VAL = aGREEN_VAL;
		BLUE_VAL = aBLUE_VAL;
	}
	
	/**
	 * @param RED_VAL the RED_VAL to set
	 */
	public void setRED_VAL(int aRED_VAL) {
		RED_VAL = aRED_VAL;
	}

	/**
	 * @param GREEN_VAL the GREEN_VAL to set
	 */
	public void setGREEN_VAL(int aGREEN_VAL) {
		GREEN_VAL = aGREEN_VAL;
	}

	/**
	 * @param BLUE_VAL the BLUE_VAL to set
	 */
	public void setBLUE_VAL(int aBLUE_VAL) {
		BLUE_VAL = aBLUE_VAL;
	}
	
}
