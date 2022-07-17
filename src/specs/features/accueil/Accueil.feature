@accueil
Feature: Accueil-OrangeHRM
  En tant que utilisateur orange je souhaite acceder au module Recruitment

  Background: 
    Given Je me connecte sur l application OrangeHRM
    When Je saisie le login "Admin"
    And Je saisie le mot de passe "admin123"
    And Je clique sur login
    Then Redirection vers l accueil

  @recruitment
  Scenario: Acceder au module Recruitment
    When je clique sur le module Recruitment
    Then je verifie l affichage de la page Recruitment "Candidates"

  @PIM
  Scenario: Acceder au module PIM
    When je clique sur le module PIM
    Then je verifie l affichage de la page PIM "Configuration"
