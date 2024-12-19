@Enregistrement_utilisateur

@passage_page_login
Feature: Title of your feature
  En tant que utilisteur ,je remplie la page login
Background:
    

  @remplissage_information_page_signup
  Scenario: Remplissage mail et nom utilisateur
  
    Given Saisir url "https://automationexercise.com/"
    Then verifier la page home 
    When cliquer sur le bouton signup_login
    Then vérifier la page login
    When saisir le nom "ali"
    And saisie adress mail "test50222.test@test.com"
    And cliquer sur le bouton signup
    Then vérifier la page signup
    When cliquer sur bouton radio Mr
    And sasir le password "test1234"
    And selectionner la date de naissance
    And Cliquer sur les boutons checks box 
     And saisir Last name "ali"
    And saisr First name "rekik"
    And saisir adresse utilistaeur "avenue test"
    And selectionner country
    And saisir State "sfax"
    And saisir city "sfax"
    And saisir zip code "3000"
    And saisir telephone number "22221414"
    And cliquer Sur bouton create account 
    Then vérifier page account_created
    When cliquer sur le bouton continue
    Then vérifier que utilisateur connecté logged as "ali" dans la page home
    
    
   
   
   

  
