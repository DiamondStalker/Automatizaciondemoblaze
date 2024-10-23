package com.demoblaze.stepDefinitions;

import com.demoblaze.steps.HomeSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    HomeSteps homeSteps;

    @Dado("que el usuario abra la url de la pagina principal y este previamente registrado")
    public void queElUsuarioAbraLaUrlDeLaPaginaPrincipalYEstePreviamenteRegistrado() {
        homeSteps.abrirNavegador();
        homeSteps.clickLogin();
    }
    @Cuando("ingresar nombre de usuario, contraseña")
    public void ingresarNombreDeUsuarioContraseña() {
        homeSteps.ingresarInformacion();
    }
    @Entonces("en la parte superior vera un panel con el nombre del usuario y un boton para cerrar sesion")
    public void enLaParteSuperiorVeraUnPanelConElNombreDelUsuarioYUnBotonParaCerrarSesion() {
        homeSteps.validarInicioSesion();
    }
}
