package hooks;

import cucumber.api.java.After;
import utils.Utils;

import java.io.IOException;

public class Hooks {

   static Utils utils = new Utils();

    @After
    public static void depoisdoCenario() throws IOException {
       utils.tiraPrint();

    }
}
