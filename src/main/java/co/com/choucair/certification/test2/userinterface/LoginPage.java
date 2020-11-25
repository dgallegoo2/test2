package co.com.choucair.certification.test2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target BUTTON_UC = Target.the("Buton for Login Page")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[1]/div[2]/a"));
    public static final Target INPUT_USERNAME = Target.the("input for username")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("input for password")
            .located(By.id("password"));
    public static final Target BUTTON_GO = Target.the("button for login")
            .located(By.id("kc-login"));
    public static final Target MESSAGE = Target.the("successful user registration verification message")
            .located(By.xpath("/html/body/div/div/div[2]/div/div[1]/div/div/section/div[1]/span"));
}
