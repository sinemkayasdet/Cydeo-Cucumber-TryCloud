package com.trycloud.page;

import com.trycloud.utilities.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CommonElementPAge extends BasePage {
    public static Actions actions = new Actions(Driver.getDriver());

    public static void favoriteListList(String favorite) {
        String s = "//span[@class='nametext']/span[.='" + favorite + "']";
        Driver.getDriver().findElement(By.xpath(s));
    }

    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement firstFavorite;

    @FindBy(xpath = "//tr[1]//span[@class='innernametext']")
    public WebElement list;

    @FindBy(css = ".icon-add")
    public WebElement iconSpan;

    @FindBy(css = ".icon-home")
    public WebElement iconhomeLink;

    @FindBy(id = "app-navigation-toggle")
    public WebElement appnavigationtoggleDiv;

    @FindBy(css = ".icon-add")
    public WebElement iconSpan2;

    @FindBy(css = "input[type='text']")
    public WebElement appnavigationsearchinput;

    @FindBy(css = "svg[width='24']")
    public WebElement materialdesigniconsvg;

    @FindBy(css = "div[role='textbox']")
    public WebElement newmessageformadvancedinputDiv;

    @FindBy(css = ".submit")
    public WebElement newmessageformbutton;

//
//    @FindBy(css = ".settings-button")
//    public WebElement settingsbutton;

    @FindBy(css = "label[for='showRichWorkspacesToggle']")
    public WebElement elementLabel;

    @FindBy(css = ".svg.active")
    public WebElement navicontrashbinLink;

    @FindBy(css = ".icon-quota p")
    public WebElement elementP;

//    @FindBy(xpath = "//label[@for='select_all_files']")
//    public WebElement checkBox;

    @FindBy(xpath = "//tbody/tr")
    public List<WebElement> listCheckBox;

    @FindBy(xpath = "//a[@class='action action-menu permanent']/span[@class='icon icon-more']")
    public WebElement iconButton;

    @FindBy(xpath = "//span[@class='nametext']/span[1]")
    public List<WebElement> favoriteList;

    @FindBy(xpath = "//span[@class='nametext extra-data']/span[1]")
    public List<WebElement> deletedlist;

    @FindBy(xpath = "//a/span[text()='Remove from favorites']")
    public WebElement removeFavorites;

    @FindBy(xpath = "//a/span[@class='icon icon-add']")
    public WebElement addIcon;

    @FindBy(xpath = "//input[@id='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement folderName;


    @FindBy(xpath = "//input[@id='view13-input-folder']")
    public WebElement folderNameInputBox;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement iconConfirmButton;

    @FindBy(xpath = "//span[.='Delete folder']")
    public WebElement deleteFile;

    @FindBy(xpath = "//a[.='Deleted files']")
    public WebElement deletedFolders;


    @FindBy(xpath = "//a/span[.='Details']")
    public WebElement detailsIcon;

    @FindBy(xpath = "//a[normalize-space()='Comments']")
    public WebElement commentOption;

    @FindBy(xpath = "//div[@class='message']")
    public WebElement messageBox;

    @FindBy(xpath = "//input[@class='submit icon-confirm has-tooltip']")
    public WebElement pushButton;


    @FindBy(xpath = "//button[normalize-space()='Settings']")
    public WebElement settingButton;

    @FindBy(xpath = "//label[.='Show rich workspaces']")
    public WebElement checkBoxutton;

    @FindBy(xpath = "//a/p")
    public WebElement currentStorageUssage;

    @FindBy(xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement searchBox;

    @FindBy(xpath = "//div[@placeholder='Write message, @ to mention someone …']")
    public WebElement messageBoxTalk;

    @FindBy(xpath = "//button[@class='new-message-form__button submit icon-confirm-fade']")
    public WebElement messageClickButton;

    @FindBy(xpath = "//span[normalize-space()='User35']")
    public WebElement user35;


    @FindBy(xpath = "//div/div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactList;

    @FindBy(css = "svg[viewBox~='24']")
    public WebElement searchIcon;

    @FindBy(xpath = "//input[@type=\'search\']")
    public WebElement searchInput;

    @FindBy(xpath = "//input[@aria-label='Reset search']")
    public WebElement reSearchButton;

    @FindBy(xpath = "(//span/strong[.='Talk'])[2]")
    public WebElement talkButton;


    public void verifyContactList() {
        for (WebElement each : contactList) {
            Assert.assertTrue(each.isDisplayed());
        }
    }

    public static void verifyMessageTalk(String text1) {
        String messageCommut = "//div[.='" + text1 + "']";
        WebElement talkMessage = Driver.getDriver().findElement(By.xpath(messageCommut));
        Assert.assertTrue(talkMessage.isDisplayed());
    }

    public static void verifyMesaage(String text) {
        String mesage = "//div[.='" + text + "']";

        WebElement element = Driver.getDriver().findElement(By.xpath(mesage));
        Assert.assertTrue(element.isDisplayed());
    }


    public static void iconModule(String name) {
        String iconModule = "//a/span[.='" + name + "']";
        Driver.getDriver().findElement(By.xpath(iconModule)).click();
    }

    public static void sideModule(String moduleName) {
        String sf = "//li[starts-with(@class,'nav')]/a[text()='" + moduleName + "']";
        actions.moveToElement(Driver.getDriver().findElement(By.xpath(sf))).click().perform();
    }


    public static void verifyFolder(String folderName) {
        String name = "//span[@class='"+ folderName+ "']";
        List<WebElement> element = Driver.getDriver().findElements(By.xpath(name));

        for (WebElement each : element) {
            Assert.assertTrue(each.isDisplayed());
        }

    }

    public boolean verifyRemovee(String fileName) {
        for (WebElement each : favoriteList) {
            if (each.getText().equals(fileName)) {
                return true;
            }
        }
        return false;
    }


    private static String fileNameH;

    @FindBy(id = "rightClickDetector")
    public WebElement rightClickDetectorDiv;

    public static String getFileNameHolder() {
        return fileNameH;
    }

    public static void setFileNameHolder(String fileNameHolder) {
        fileNameH = fileNameHolder;
    }

    public void deletedListModule(String text) {

        String textList = "//span[@class='nametext extra-data']/span[.='" + text + "']";
        WebElement element = Driver.getDriver().findElement(By.xpath(textList));
        Assert.assertTrue("jsfdkg", element.isDisplayed());
    }
}

