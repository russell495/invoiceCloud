package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigurationReader;
import utilities.Driver;

public class Hooks {
    @Before
    public void setUp(){
        Driver.get().get(ConfigurationReader.get("url"));
    }
    @After
    public void teatDown(){
        System.out.println("This comming After scenario\n");
        Driver.closeDriver();

    }
}
