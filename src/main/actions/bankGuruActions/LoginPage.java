package bankGuruActions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import bankguruUI.LogInPageUI;
import commonPage.CommonFunctions;

public class LoginPage extends CommonFunctions {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public RegisterPage ClickHereLink() {
		waitVisible(LogInPageUI.HERE_LINK);
		click(LogInPageUI.HERE_LINK);
		return PageFactory.initElements(driver, RegisterPage.class);

	}
	// de chi hoi Vu

}
