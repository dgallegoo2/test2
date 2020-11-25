package co.com.choucair.certification.test2.stepdefinitions;

import co.com.choucair.certification.test2.model.UtestAcademyData;
import co.com.choucair.certification.test2.questions.Answer;
import co.com.choucair.certification.test2.tasks.Join;
import co.com.choucair.certification.test2.tasks.OpenUp;
import co.com.choucair.certification.test2.tasks.Login;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Daniel wants to be part of the world's largest independent software tester community$")
    public void thanDanielWantsToBePartOfTheWorldSLargestIndependentSoftwareTesterCommunity(List<UtestAcademyData> utestAcademyData ) throws Exception {
        OnStage.theActorCalled("Daniel").wasAbleTo(OpenUp.thePage(), Join.
                onThePage(utestAcademyData.get(0).getStrFirstName(),utestAcademyData.get(0).getStrLastName(),utestAcademyData.get(0).getStrEmailAddress(),utestAcademyData.get(0).getStrMonthOfBird(),utestAcademyData.get(0).getIntDayOfBird(),utestAcademyData.get(0).getIntYearOfBird(),utestAcademyData.get(0).getStrCity(),utestAcademyData.get(0).getIntPostalCode(),utestAcademyData.get(0).getStrCountry(),utestAcademyData.get(0).getStrYourComputer(),utestAcademyData.get(0).getIntVersion(),utestAcademyData.get(0).getStrLanguage(),utestAcademyData.get(0).getStrYourMobileDevice(),utestAcademyData.get(0).getStrModel(),utestAcademyData.get(0).getStrOperatingSystem(),utestAcademyData.get(0).getStrPassword(),utestAcademyData.get(0).getStrConfirmPassword()));
    }

    @When("^he enters the world's largest community of freelance software testers$")
    public void heEntersTheWorldSLargestCommunityOfFreelanceSoftwareTesters(List<UtestAcademyData> utestAcademyData ) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(utestAcademyData.get(0).getStrUser(),utestAcademyData.get(0).getStrPassword()));
    }

    @Then("^he finds that he is already part of the world's largest community of freelance software testers$")
    public void heFindsThatHeIsAlreadyPartOfTheWorldSLargestCommunityOfFreelanceSoftwareTesters(List<UtestAcademyData> utestAcademyData ) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestAcademyData.get(0).getStrMessage())));
    }


}

