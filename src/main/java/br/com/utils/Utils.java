package br.com.utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import br.com.app.App;

import java.io.File;
import java.io.IOException;

public class Utils {

    static App app = new App();

    public void tiraPrint() throws IOException {
        File scrFile = ((TakesScreenshot) app.getDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("screenshot/screenshot.png"));
    }



}
