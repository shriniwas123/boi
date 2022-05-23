package pomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logut {
	@FindBy(xpath ="//*[@id=\"mount_0_0_GE\"]/div/div[1]/div/div[2]/div[4]/div[1]/span/div/div[1]")
	private WebElement drop;

	@FindBy(xpath = "(//span[@class='d2edcug0 hpfvmrgz qv66sw1b "
			+ "c1et5uql lr9zc1uh a8c37x1j fe6kdd0r mau55g9w c8b282yb keod5gw0 " + "nxhoafnm aigsh9s9 d3f4x2em iv3no6db "
			+ "jq4qci2q a3bd9o3v ekzkrbhg oo9gr5id hzawbc8m'])[6]")
	private WebElement logout;
	
	public Logut(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public void dropMenu() {
		drop.click();
	}

	public void clicklogout() {
		logout.click();

	}

}
