package Login;

import com.qa.turtlemint.base.TestBase;
import com.qa.turtlemint.pages.login.LoginPage;
import com.qa.turtlemint.util.TestUtil;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.iTestListener;

import java.io.IOException;

@Listeners(iTestListener.class)
@Test(groups = {"login"})
public class MintproLoginTest extends TestBase {

    LoginPage Loginpage;

    public MintproLoginTest() {
        super();
    }

    @BeforeMethod()
    public void start() {
        initialization();
        Loginpage = new LoginPage();
    }

    @Test()
    public void loginTest(){
        Loginpage.ValidateLogin(prop.getProperty("username"), prop.getProperty("otp"));
    }

    @AfterMethod
    public void Close() {
        driver.quit();
    }
}


