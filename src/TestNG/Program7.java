package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Program7 {
	
	@Test (dataProvider="dataSet")
	public void method_1(String username, String password) {
		System.out.println("Class: Program7; Method: 1; Remark: This is the only method availble in the class,it will fetch and the username, password.");
		System.out.print(username +" ");
		System.out.print(password +" ");
		System.out.println();
	}

	@DataProvider(name="dataSet")
	public String[][] dataSet(){
		String[][] data= new String[3][2];
		
		data[0][0]= "Username1";
		data[0][1]= "Password1";
		
		data[1][0]= "Username2";
		data[1][1]= "Password2";
		
		data[2][0]= "Username3";
		data[2][1]= "Password3";
		
		return data;
		}
}
