package com.adactin.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.utils.BaseClass;

public class SearchPageLocator extends BaseClass{
	public SearchPageLocator() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//*[contains(@id, 'location')])[1]")
	private WebElement location;
	
	@FindBys({@FindBy(xpath = "//*[starts-with(@name, 'hotels')]"),@FindBy(xpath = "(//*[starts-with(@class, 'search_combobox')])[2]")})
	private WebElement hotel;
	
	@FindBy(xpath = "//option[starts-with(text(), '- Select Room Type -')]/parent::select")
	private WebElement roomType;
	
	@FindBy(xpath = "//option[starts-with(text(), '- Select Number of Rooms -')]/ancestor::select")
	private WebElement numberOfRooms;
	
	@FindBy(xpath = "//input[contains(@id, 'datepick_in')]")
	private WebElement checkInDate;
	
	@FindBy(xpath = "(//input[starts-with(@class, 'date_pick')])[2]")
	private  WebElement checkOutDate;
	
	@FindBy(xpath = "//option[starts-with(text(), '- Select Adults per Room -')]/parent::select")
	private WebElement adultsPerRoom;
	
	@FindBy(xpath = "//select[starts-with(@name, 'child_room')]")
	private WebElement childrenPerRoom;
	
	@FindBy(xpath = "//input[starts-with(@name, 'Submit')]")
	private WebElement search;

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNumberOfRooms() {
		return numberOfRooms;
	}

	public WebElement getCheckInDate() {
		return checkInDate;
	}

	public WebElement getCheckOutDate() {
		return checkOutDate;
	}

	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}

	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}

	public WebElement getSearch() {
		return search;
	}
}
