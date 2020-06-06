package br.com.steps;

import br.com.funcionalidades.HomeFuncionalidade;
import br.com.hooks.Hooks;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class MultiplicacaoSteps {

    @Quando("^multiplicar (\\d+) com (\\d+)$")
    public void multiplicar_com(int num1, int num2) throws Throwable {
        HomeFuncionalidade home = new HomeFuncionalidade();
        home.multiplicarNumeros(num1,num2);
    }

    @Entao("^devo visualizar o (\\d+) como resultado$")
    public void devo_visualizar_o_como_resultado(int resultado) throws Throwable {
        HomeFuncionalidade home = new HomeFuncionalidade();
        home.validaResultado(resultado);
        Hooks.depoisdoCenario();
    }
}
