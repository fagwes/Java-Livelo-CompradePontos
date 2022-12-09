#Author: your.email@your.domain.com

Feature: compra de pontos
 como usuario
 quero realizar o acessoa a página compra de pontos
 para comprar pontos

 @compradepontosparaumamigo
  Scenario: Compra de pontos para um amigo
    Given que eu esteja no site da livelo  e não logado
    And clico em compre pontos novamente
    And clico em para um amigo 
    When preencho todas as informações 
    And clico em comprar pontos novamente
    Then sou redirecionado para a tela de login de acesso
      
      
      
      