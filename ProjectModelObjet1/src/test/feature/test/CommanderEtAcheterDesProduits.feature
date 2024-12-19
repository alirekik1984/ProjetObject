
@Acheter_des_produits
Feature: Commander et acheter des produits
  en tant que utilisateur je commande et acheter des produits

  @Commander_et_acheter_des_produits
  Scenario: Commander et acheter des produits
    Given Saisir url "https://automationexercise.com/"
    Then verifier la page home 
    When cliquer sur le bouton signup_login
    Then vérifier la page login
    Then cliquer sur signup
    Then vérifier la page login/signup
    When saisir  mail "test502.test@test.com"
    And sasir le mot de passe "test1234"
    And cliquer sur le bouton login
    Then verif page home
    And vérifier le text du bouton products
    When cliquer sur le bouton products
    Then vérifier la page products
    When choisir un premier produit et cliquer sur add to cart
    Then vérifier Pop-up added
    When cliquer bouton continuer du pop-up added
    Then vérifier le retour a la page products
    When cliquer sur view products pour un autre products
    Then verifier affichage page details du produit selectionné
    When cliquer sur add to cart
    Then vérifier le Pop-up added
    When cliquer sur view cart
    Then vérifier page view cart
    And verifier les produits selectionnés existent
    When cliquer bouton checkout
    Then verifier affichage page checkout
    And verifier adress delivery
    And verifier billig adress
    And ecrire commentaire 
    When cliquer sur le bouton place order
    Then verifier affichage page paiement
    When saisir Name on card "test test"
    And saisir card number
    And saisir cvc "123"
    And saisir mois expiration "05"
    And année expiration "2025"
    When cliquer sur cliquer bouton paiement
    Then verifier page done paiement
    When cliquer sur bouton download
    Then vérifier téléchargement fichier txt
    When cliquer sur le bouton continuer 
    Then verifier affichage page home   
    
    
    
    
    

  