package com.actitime.generic;

import java.io.IOException;
public class DemoA {
public static void main(String[] args) throws IOException {
	FileLib f=new FileLib();
	String url = f.readDataFromProperty("url");
	String un = f.readDataFromProperty("un");
	String pwd = f.readDataFromProperty("pwd");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
	String data = f.readDataFromExcel("createCustomer",1,3);
	System.out.println(data);
	String data1 = f.readDataFromExcel("multipleData",13,1);
	System.out.println(data1);
	String data2 = f.readDataFromExcel("InvalidLogin", 4, 1);
	System.out.println(data2);
	f.writeDataIntoExcel("CreateCustomer", 1, 5,"Fail");
	f.writeDataIntoExcel("multipledata",17,0,"Eve");
	f.writeDataIntoExcel("InvalidLogin", 8, 0,"Modi");
}
}
