package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void initializeTest()
    {
        base.driver = new ChromeDriver();
        base.driver.manage().window().maximize();
    }

    @After
    public void tearDownTest(){
        base.driver.close();
    }
}
