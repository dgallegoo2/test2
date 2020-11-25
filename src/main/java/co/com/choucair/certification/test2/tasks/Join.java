package co.com.choucair.certification.test2.tasks;

import co.com.choucair.certification.test2.userinterface.JoinPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Join implements Task {

    private String   strFirstName;
    private String   strLastName;
    private String   strEmailAddress;
    private String   strMonthOfBird;
    private Integer  intDayOfBird;
    private Integer  intYearOfBird;
    private String   strCity;
    private Integer  intPostalCode;
    private String   strCountry;
    private String   strYourComputer;
    private Integer  intVersion;
    private String   strLanguage;
    private String   strYourMobileDevice;
    private String   strModel;
    private String   strOperatingSystem;
    private String   strPassword;
    private String   strConfirmPassword;
    private String   strUser;

    public Join(String strFirstName, String strLastName, String strEmailAddress, String strMonthOfBird, Integer intDayOfBird, Integer intYearOfBird, String strCity, Integer intPostalCode, String strCountry, String strYourComputer, Integer intVersion, String strLanguage, String strYourMobileDevice, String strModel, String strOperatingSystem, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmailAddress = strEmailAddress;
        this.strMonthOfBird = strMonthOfBird;
        this.intDayOfBird = intDayOfBird;
        this.intYearOfBird = intYearOfBird;
        this.strCity = strCity;
        this.intPostalCode = intPostalCode;
        this.strCountry = strCountry;
        this.strYourComputer = strYourComputer;
        this.intVersion = intVersion;
        this.strLanguage = strLanguage;
        this.strYourMobileDevice = strYourMobileDevice;
        this.strModel = strModel;
        this.strOperatingSystem = strOperatingSystem;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }


    public static Join onThePage(String strFirstName, String strLastName, String strEmailAddress, String strMonthOfBird, Integer intDayOfBird, Integer intYearOfBird, String strCity, Integer intPostalCode, String strCountry, String strYourComputer, Integer intVersion, String strLanguage, String strYourMobileDevice, String strModel, String strOperatingSystem, String strPassword, String strConfirmPassword) {
        return Tasks.instrumented(Join.class, strFirstName, strLastName, strEmailAddress, strMonthOfBird, intDayOfBird, intYearOfBird, strCity, intPostalCode, strCountry, strYourComputer, intVersion, strLanguage, strYourMobileDevice, strModel, strOperatingSystem, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Click.on(JoinPage.JOIN_BUTTON),
            Enter.theValue(strFirstName).into(JoinPage.INPUT_FIRST_NAME),
            Enter.theValue(strLastName).into(JoinPage.INPUT_LAST_NAME),
            Enter.theValue(strEmailAddress).into(JoinPage.INPUT_EMAIL_ADDRESS),
            SelectFromOptions.byVisibleText(strMonthOfBird).from(JoinPage.INPUT_MONTH_BIRTH),
            SelectFromOptions.byVisibleText(intDayOfBird.toString()).from(JoinPage.INPUT_DAY_BIRTH),
            SelectFromOptions.byVisibleText(intYearOfBird.toString()).from(JoinPage.INPUT_YEAR_BIRTH),
            Click.on(JoinPage.BUTTON_NEXT_LOCATION),

            Enter.theValue(strCity).into(JoinPage.INPUT_CITY),
            Enter.theValue(intPostalCode.toString()).into(JoinPage.INPUT_POSTAL_CODE),
            Click.on(JoinPage.BOX_COUNTRY),
            Click.on(JoinPage.ITEM_COUNTRY),
            Click.on(JoinPage.BUTTON_NEXT_DEVICES),

            Click.on(JoinPage.BOX_YOUR_MOBILE_DEVICE),
            Click.on(JoinPage.ITEM_YOUR_MOBILE_DEVICE),

            Click.on(JoinPage.BOX_MODEL),
            Click.on(JoinPage.ITEM_MODEL),

            Click.on(JoinPage.BOX_OPERATING_SYSTEM),
            Click.on(JoinPage.ITEM_OPERATING_SYSTEM),

            Click.on(JoinPage.BUTTON_LAST_STEP),
            Enter.theValue(strPassword).into(JoinPage.INPUT_PASSWORD),
            Enter.theValue(strConfirmPassword).into(JoinPage.INPUT_CONFIRM_PASSWORD),
            Click.on(JoinPage.CHECK_STAY_INFORMED),
            Click.on(JoinPage.CHECK_TERMS),
            Click.on(JoinPage.CHECK_PRIVACY)

        );
    }
}
