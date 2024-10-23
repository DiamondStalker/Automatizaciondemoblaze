package com.demoblaze.page;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject {
    private By btnLogin = By.id("login2");
    private By btnUserName = By.id("loginusername");
    private By btnContra = By.id("loginpassword");
    private By btnLogIn = By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]");
    private By txtWelcome = By.id("nameofuser");

    public By getBtnLogin() {return btnLogin;}
    public By getBtnUserName() {return btnUserName;}
    public By getBtnContra() {return btnContra; }
    public By getBtnLogIn() {return btnLogIn;}
    public By getTxtWelcome() {return txtWelcome;}
}
