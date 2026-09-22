package com.vtiger.contact;

import org.testng.annotations.Test;

public class ContactTest {
	@Test(groups="RT")
	public void createContact() {

		String URl = System.getProperty("url", "http://testenv");
		String Browser = System.getProperty("browser", "chrome");
		String username = System.getProperty("username", "admin");
		String password = System.getProperty("password", "admin");

		System.out.println(URl);
		System.out.println(Browser);
		System.out.println(username);
		System.out.println(password);

	}
	@Test(groups="ST")
	public void createContactWithDropdown() {

		
		System.out.println("Step1");
		System.out.println("Step2");
		System.out.println("Step3");
		System.out.println("Step4");

	}

}
