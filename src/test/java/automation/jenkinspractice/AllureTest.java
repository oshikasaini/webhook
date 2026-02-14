package automation.jenkinspractice;

import org.testng.annotations.*;
import org.testng.asserts.*;
import org.testng.Assert;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import io.qameta.allure.testng.*;
public class AllureTest {
	@Test
	@Story("Valid Login")
	@Severity(SeverityLevel.CRITICAL)
	@Description("Verify login with valid credeentials")
	void validLoginTest() {
		Assert.assertTrue(true);
	}
}
