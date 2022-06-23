
@authentification
Feature: Authentification - OrangeHRM // Title of your feature
  En tant que utilisateur je souhaite m authentifier

  @authentification
  Scenario: Authentification - OrangeHRM
    Given J ouvre l application OrangeHRM
    When Je saisie le login
    And Je saisie le mot de passe
    And Je clique sur le bouton login
    Then Je verifie le compte admin


 