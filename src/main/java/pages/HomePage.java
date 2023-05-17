package pages;

import org.openqa.selenium.*;

import java.util.ArrayList;

public class HomePage {
    private WebDriver driver;

    private final By allowAllCookieFilesBtn = By.cssSelector("[class=\"block pt-8 pb-6 px-24 type-small-fat leading-default rounded-full transition text-TypeConstant bg-Brand hover:bg-BrandDark shadow-elevated\"]");
    private final By goLifeSumPageBtn = By.cssSelector("[class=\"cursor-pointer bg-BrandNew text-TypeConstant uppercase text-14 font-demibold px-32 py-20 rounded-12\"]");
    private final By registrationTopBtn = By.cssSelector("[class=\"type-14-demibold xl:type-17-demibold block transition rounded-full bg-transparent border-2 lg:ml-12 py-4 px-12 xl:px-20 xl:pt-6 text-center max-w-golden-ratio lg:max-w-none truncate lg:relative border-Brand text-BrandDark hover:text-TypeConstant hover:bg-Brand\"]");
    private final By registrationTop = By.cssSelector("[class=\"type-14-demibold md:type-14-demibold-caps xl:type-17-demibold-caps text-inherit mx-6 lg:mx-12 py-2 border-b-2 border-transparent hover:border-Brand transition\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickAllowAllCookieFiles() {
        driver.findElement(allowAllCookieFilesBtn).click();
    }

    public void goLifeSumPage(){
        driver.findElement(goLifeSumPageBtn).click();
    }
    public void clickRegistrationBtn(){
        driver.findElement(registrationTopBtn).click();
    }


}