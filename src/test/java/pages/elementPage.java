package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class elementPage {

    public elementPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[.='Add Element']")
    public WebElement addElementButton;


    @FindBy(xpath = "//button[.='Delete']")
    public WebElement deleteElement;

    @FindBy(xpath = "//button[.='Delete']")
    public List<WebElement> deleteElements;
}


