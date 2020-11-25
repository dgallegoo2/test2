package co.com.choucair.certification.test2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target BUTTON_UC = Target.the("Selecciona la universidad choucair")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[1]/div[2]/a"));

    public static final Target INPUT_USERNAME = Target.the("Prueba Técnica - Analista Bancolombia")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("Da click para buscar el curso")
            .located(By.id("password"));
    public static final Target BUTTON_GO = Target.the("Da click para buscar el curso")
            .located(By.id("kc-login"));
    public static final Target MESSAGE = Target.the("Da click para buscar el curso")
            .located(By.xpath("//span[text()[contains(.,'destivengoo3@gmail.com')]]"));


    /*
    ************************************************************************************************************
          * NOTA: En base a que el usuario asignado para la prueba no tiene acceso a 'Universidad Choucair'
          * ya que indica 'Usted no tiene permiso para ver esta lista de cursos.',
          * Se orienta la prueba de busqueda para ir 'Selección Choucair' y seleccionar
          * el curso habilitado llamado: 'Prueba Técnica - Analista Bancolombia'.
          * Se presentan inconvenientes para buscar el nombre del curso con tildes,
          * por tanto se implementa la busqueda de solo una parte del nombre del cursno.
    ************************************************************************************************************
    */
}
