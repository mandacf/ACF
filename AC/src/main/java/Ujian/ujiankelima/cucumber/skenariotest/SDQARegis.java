package Ujian.ujiankelima.cucumber.skenariotest;

public enum SDQARegis{
	

	T1("User invalid regis");
	

	
	private String testName;
	
	private SDQARegis(String value) {
		testName = value;
	}
	
	public String getTestName() {
		return testName;
	}	
}