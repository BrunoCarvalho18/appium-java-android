package br.com.hooks;

import cucumber.api.java.After;

import java.io.IOException;

import br.com.utils.Utils;

public class Hooks {

   static Utils utils = new Utils();

    @After
    public static void depoisdoCenario() throws IOException {
       utils.tiraPrint();

    }
}
