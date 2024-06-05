package datadriven_testing;

import org.testng.annotations.DataProvider;

public class LearnDataProvider {
	@DataProvider
public Object[][] sendData() {
	Object[][]data= {{"http://localhost/login.do","admin","manager"},
			{"http://localhost/login.do","Dinga","Dingi"}};
	return data;
}
}
