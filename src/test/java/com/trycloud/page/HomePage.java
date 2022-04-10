package com.trycloud.page;

import com.trycloud.utilities.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {



    @FindBy(css = "#appmenu li[data-id='dashboard'] svg")
    public WebElement dashboard;

    @FindBy(css = "#appmenu li[data-id='files'] svg")
    public WebElement files;

    @FindBy(css = "#appmenu li[data-id='photos'] svg")
    public WebElement photos;

    @FindBy(css = "#appmenu li[data-id='activity'] svg")
    public WebElement activity;

    @FindBy(css = "#appmenu li[data-id='spreed'] svg")
    public WebElement talk;

    @FindBy(css = "#appmenu li[data-id='mail'] a")
    public WebElement mail;

    @FindBy(css = "#appmenu li[data-id='contacts'] svg")
    public WebElement contacts;

    @FindBy(css = "#appmenu li[data-id='circles'] a")
    public WebElement circles;

    @FindBy(css = "#appmenu li[data-id='calendar'] svg")
    public WebElement calendar;

    @FindBy(css = "#appmenu li[data-id='deck'] svg")
    public WebElement deck;

    @FindBy(xpath = "//ul[@id='appmenu']//*[@viewBox='0 0 20 20']/following-sibling::span")
    public List<WebElement> HomeModules;

    public static void headerModule(String head) {
        Actions actions = new Actions(Driver.getDriver());
        String s = "//span[normalize-space(text())='" + head + "']";
        actions.moveToElement(Driver.getDriver().findElement(By.xpath(s))).click().perform();
    }




}

