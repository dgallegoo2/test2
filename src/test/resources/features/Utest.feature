#Autor: Daniel Estiven Gallego O.
  @stories
  Feature: Utest Academy
    As a future user, I want to register with the largest community of testers in the world.
  @scenario1
  Scenario: Join the world's largest community of testers
    Given than Daniel wants to be part of the world's largest independent software tester community
    | strFirstName  | strLastName | strEmailAddress                 |  strMonthOfBird  |  intDayOfBird  | intYearOfBird  | strCity  | intPostalCode  |  strCountry     |  strYourComputer  |  intVersion   | strLanguage  | strYourMobileDevice  |  strModel   |  strOperatingSystem  |  strPassword      |  strConfirmPassword  |
    | Daniel        | Gallego     | asddaeqe123-@yopmail.com        |  December        |        18      |    1995        | Medellin | 050016         |  Colombia       |  Windows          |   10          | Spanish      | Samsung              |  S20 Plus   |  Android 10          |  1026154371.Dego* |  1026154371.Dego*    |
    When he enters the world's largest community of freelance software testers
    | strUser                   | strPassword      |
    | destivengoo3@gmail.com    | 24368740.Blanca  |
    Then he finds that he is already part of the world's largest community of freelance software testers
    | strMessage               |
    | destivengoo3@gmail.com   |
