package base;

import org.openqa.selenium.support.PageFactory;
import utilities.*;
public class BaseTestClass {

    public BaseTestClass(){
        PageFactory.initElements(DriverManager.getDriver(),this);
    }

}
