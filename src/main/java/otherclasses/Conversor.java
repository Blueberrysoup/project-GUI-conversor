/***
* Conversor - Handles conversion between degrees and radians
* @author: Carina Ekström
* @version: 1.0
**/

package otherclasses;

public class Conversor {

	/**
	 * Converts radians to degrees
	 * @param radians Value to convert
	 * @return Value converted to degrees
	 */
	public double toDegrees(double radians){
		return Math.toDegrees(radians);
	}
	
	/**
	 * Converts degrees to radians
	 * @param degrees Value to convert
	 * @return Value converted to radians
	 */
	public double toRadians(double degrees){
		return Math.toRadians(degrees);	
	}

}
