package pageObjectsOneWay;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CancelPage1 {
	@FindBy(xpath = "//span[text()='Cancel the ticket?']")
    public static WebElement cancel;	
	
	@FindBy(xpath = "//button[text()='Yes']")
	public static WebElement yes;
}
