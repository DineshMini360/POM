package com.adactin.pages;

import org.openqa.selenium.By;

import com.adactin.locators.SearchPageLocator;
import com.baseclass.utils.BaseClass;

public class SearchPageExecution extends BaseClass{
	public static void searchHotel() {
		//SearchPageLocator spl = new SearchPageLocator();
		
		dropDownSelectAValue(new SearchPageLocator().getLocation(), "Paris");
		dropDownSelectAValue(new SearchPageLocator().getHotel(), "Hotel Sunshine");
		dropDownSelectAValue(new SearchPageLocator().getRoomType(), "Deluxe");
		dropDownSelectAValue(new SearchPageLocator().getNumberOfRooms(), "2" );
		//driver.findElement(By.xpath("//input[contains(@id, 'datepick_in')]")).sendKeys("23/08/2023");
		dataSend(new SearchPageLocator().getCheckInDate(), "23/08/2023");
		//driver.findElement(By.xpath("(//input[starts-with(@class, 'date_pick')])[2]")).sendKeys("24/08/2023");
		dataSend(new SearchPageLocator().getCheckOutDate(), "24/08/2023");
		dropDownSelectAValue(new SearchPageLocator().getAdultsPerRoom(), "2");
		dropDownSelectAValue(new SearchPageLocator().getChildrenPerRoom(), "1");
		click(new SearchPageLocator().getSearch());
	}
		
}
