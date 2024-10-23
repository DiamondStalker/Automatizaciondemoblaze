package com.demoblaze.steps;

import com.demoblaze.page.HomePage;
import com.demoblaze.utils.Excel;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Map;

public class HomeSteps {
    @Page
    HomePage homePage;

    @Step("Abrir el Navegador")
    public void abrirNavegador() {
        homePage.openUrl("https://www.demoblaze.com/index.html");
    }

    @Step("Click al boton login")
    public void clickLogin() {
        homePage.getDriver().findElement(homePage.getBtnLogin()).click();
    }

    @Step("Ingresar la informacion")
    public void ingresarInformacion() {
        ArrayList<Map<String, String>> datos;

        try {
            datos = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Informacion.xlsx", "Info");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        homePage.getDriver().findElement(homePage.getBtnUserName()).sendKeys(datos.get(0).get("Usuario"));
        homePage.getDriver().findElement(homePage.getBtnContra()).sendKeys(datos.get(0).get("Contra"));

        homePage.getDriver().findElement(homePage.getBtnLogIn()).click();
    }

    @Step("Validar inicio de sesion")
    public void validarInicioSesion() {
        ArrayList<Map<String, String>> datos;

        try {
            datos = Excel.leerDatosDeHojaDeExcel("src/test/resources/Data/Informacion.xlsx", "Info");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        Assert.assertTrue(homePage.getDriver().findElement(homePage.getTxtWelcome()).getText().equals("Welcome " + datos.get(0).get("Usuario")));
    }

}