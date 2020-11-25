package co.com.choucair.certification.test2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinPage {
    /*Join Button*/
    public static final Target JOIN_BUTTON = Target.the("button that shows us the form to login")
            .located(By.xpath("//a[@class='unauthenticated-nav-bar__sign-up']"));
    /*Primera Página*/
    public static final Target INPUT_FIRST_NAME = Target.the("button that shows us the form to login")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("button that shows us the form to login")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL_ADDRESS = Target.the("button that shows us the form to login")
            .located(By.id("email"));
    public static final Target INPUT_MONTH_BIRTH = Target.the("button that shows us the form to login")
            .located(By.id("birthMonth"));
    public static final Target INPUT_DAY_BIRTH = Target.the("button that shows us the form to login")
            .located(By.id("birthDay"));
    public static final Target INPUT_YEAR_BIRTH = Target.the("button that shows us the form to login")
            .located(By.id("birthYear"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("Estrae el nombre del curso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));

    /*Segunda Página*/
    public static final Target INPUT_CITY = Target.the("button that shows us the form to login")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE = Target.the("button that shows us the form to login")
            .located(By.id("zip"));
    public static final Target BOX_COUNTRY = Target.the("button that shows us the form to login")
            .located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target ITEM_COUNTRY = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[text()[contains(.,'Colombia')]]"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Estrae el nombre del curso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    /* Tercera página */
    public static final Target INPUT_YOUR_COMPUTER = Target.the("button that shows us the form to login")
            .located(By.xpath("//*[@id='web-device']/div[1]/div[2]/div/div[1]/span/span[2]"));
    public static final Target INPUT_VERSION = Target.the("button that shows us the form to login")
            .located(By.xpath("/html/body/ui-view/main[@class='registration']/section[@id='regs_container']/div[@class='container-fluid']/div[2]/div[@class='sign-up-form-container']/div[@class='ui-view']/div/div[@class='form-group-box']/div[@class='devices-box']/div[@id='web-device']/div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form'][2]/div[@class='ui-select-box']/div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid auto-detected ng-touched']/div[@class='ui-select-match']/span[@class='btn btn-default form-control ui-select-toggle']"));
    public static final Target INPUT_LANGUAGE = Target.the("button that shows us the form to login")
            .located(By.xpath("/html/body/ui-view/main[@class='registration']/section[@id='regs_container']/div[@class='container-fluid']/div[2]/div[@class='sign-up-form-container']/div[@class='ui-view']/div/div[@class='form-group-box']/div[@class='devices-box']/div[@id='web-device']/div[@class='form-group col-xs-12 col-sm-4 col-md-4 col-lg-4 select2-theme-form'][3]/div[@class='ui-select-box']/div[@class='ui-select-container ui-select-bootstrap dropdown ng-not-empty ng-valid auto-detected ng-touched']/div[@class='ui-select-match']/span[@class='btn btn-default form-control ui-select-toggle']/span[@class='ui-select-match-text pull-left ui-select-allow-clear']\n"));

    public static final Target BOX_YOUR_MOBILE_DEVICE = Target.the("button that shows us the form to login")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span"));
    public static final Target ITEM_YOUR_MOBILE_DEVICE = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[text()[contains(.,'Samsung')]]"));

    public static final Target BOX_MODEL = Target.the("button that shows us the form to login")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target ITEM_MODEL = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[text()[contains(.,'S20 Plus')]]"));

    public static final Target BOX_OPERATING_SYSTEM = Target.the("button that shows us the form to login")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span/span[1]"));
    public static final Target ITEM_OPERATING_SYSTEM = Target.the("button that shows us the form to login")
            .located(By.xpath("//div[text()[contains(.,'Android 10')]]"));
   public static final Target BUTTON_LAST_STEP = Target.the("Estrae el nombre del curso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));


    /* Cuarta página */
    public static final Target INPUT_PASSWORD = Target.the("button that shows us the form to login")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("button that shows us the form to login")
            .located(By.id("confirmPassword"));

    public static final Target CHECK_STAY_INFORMED = Target.the("Estrae el nombre del curso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECK_TERMS = Target.the("Estrae el nombre del curso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY = Target.the("Estrae el nombre del curso")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_SUBMIT = Target.the("Estrae el nombre del curso")
            .located(By.id("laddaBtn"));


}
