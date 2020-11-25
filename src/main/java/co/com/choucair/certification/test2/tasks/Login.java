package co.com.choucair.certification.test2.tasks;

import co.com.choucair.certification.test2.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {

    private  String strUser;
    private  String strPassword;

    public Login(String strUser, String strPassword) {
        this.strUser = strUser;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strUser,String strPassword) {
        return Tasks.instrumented(Login.class, strUser, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.BUTTON_UC),
                Enter.theValue(strUser).into(LoginPage.INPUT_USERNAME),
                Enter.theValue(strPassword).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_GO)
        );
    }
}
