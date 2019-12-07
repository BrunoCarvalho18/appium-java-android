package br.com.screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import static br.com.app.App.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;


public class HomeScreen {

    @AndroidFindBy(id = "result")
    MobileElement visor;

    @AndroidFindBy(id = "op_add")
    MobileElement soma;

    @AndroidFindBy(id = "eq")
    MobileElement igual;

    @AndroidFindBy(id = "op_mul")
    MobileElement multiplicacao;

    @AndroidFindBy(id = "op_div")
    MobileElement divisao;

    public HomeScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(getDriver()), this);
    }


    public MobileElement getVisor() {
        return visor;
    }

    public MobileElement getSoma() {
        return soma;
    }


    public MobileElement getIgual() {
        return igual;
    }

    public MobileElement getMultiplicacao() {
        return multiplicacao;
    }


    public MobileElement getDivisao() {
        return divisao;
    }


    public void tocaDigito(int valor) {
        String valores = String.valueOf(valor);
        char[] digitoToCharArray = valores.toCharArray();
        for (char digito : digitoToCharArray) {
            getDriver().findElement(By.id("digit_" + digito)).click();
        }
    }


}