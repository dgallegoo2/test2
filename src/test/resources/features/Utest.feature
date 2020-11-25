#Autor: Daniel Estiven Gallego O.
  @stories
  Feature: Utest Academy
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than Daniel wants to be part of the world's largest independent software tester community
    | strFirstName  | strLastName | strEmailAddress             |  strMonthOfBird  |  intDayOfBird  | intYearOfBird  | strCity  | intPostalCode  |  strCountry   |  strYourComputer  |  intVersion   | strLanguage  | strYourMobileDevice  |  strModel   |  strOperatingSystem  |  strPassword      |  strConfirmPassword  |
    | Daniel        | Gallego     | alejosu629@gmail.com        |  December        |        18      |    1995        | Medellin | 050001         |  Canada       |  Windows          |   10 64-bit   | Spanish      | Samsung              |  Galaxy J7  |  Android 10          |  1026154371.Dego* |  1026154371.Dego*    |
    When he enters the world's largest community of freelance software testers
    | strUser                   | strPassword      |
    | destivengoo3@gmail.com    | 24368740.Blanca  |
    Then he finds that he is already part of the world's largest community of freelance software testers
    | strMessage           |
    | destivengoo3@gmail.com   |
