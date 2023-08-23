package com.adactin.tests;

import org.junit.Test;

import com.adactin.pages.LoginPageExecution;
import com.adactin.pages.SearchPageExecution;

public class AdactinTest {
	@Test
	public void login() {
		LoginPageExecution.loginWithValidUsernameAndPassword();
		SearchPageExecution.searchHotel();
	}
}
