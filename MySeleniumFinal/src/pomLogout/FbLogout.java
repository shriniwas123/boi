package pomLogout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbLogout {
	@FindBy(xpath="(//div[@role='button'])[3]")
	private WebElement menu;
	
@FindBy(xpath="(//div[@class='j83agx80 cbu4d94t tvfksri0 aov4n071 bi6gxh9e l9j0dhe7 nqmvxvec'])[18]")
private WebElement ot;
	

	
	public FbLogout(WebDriver driver) {
	PageFactory.initElements(driver, this);
		
	}
	public void mbutton() {
		menu.click();
	}
	public void clickout() {
		ot.click();
	}

}
