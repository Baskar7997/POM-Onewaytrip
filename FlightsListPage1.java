package pageObjectsOneWay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsListPage1 {
	
	@FindBy(xpath = "//div[@class='grid items-center w-full p-1']")
	public static WebElement chooseFlight;
}
