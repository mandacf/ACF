package Ujian.ujiankeempat.nopcommerce.skenariotest;

public enum NCLogin {
	T1("User invalid data"),
	T2("User valid data");
//	T3("Dashboard user function");
	
	private String testName;
	
	private NCLogin(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}
