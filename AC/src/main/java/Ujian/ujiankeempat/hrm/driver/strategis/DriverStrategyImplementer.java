package Ujian.ujiankeempat.hrm.driver.strategis;

import Training.TestObjek.util.Constants;

public class DriverStrategyImplementer {
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			return new Chrome();
		
		case Constants.FIREFOX://driver yg bakal dipake
			return new Firefox();

		default:
			return null;
		}
	}
}
