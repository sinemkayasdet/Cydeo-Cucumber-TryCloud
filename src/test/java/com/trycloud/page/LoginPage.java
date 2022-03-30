package com.trycloud.page;

import com.trycloud.utilities.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


}
