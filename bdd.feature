  

Feature: compra de pontos
 como usuario
 quero realizar o acessoa a página compra de pontos
 para comprar pontos
 


      
  @compradepontosteste1
  Scenario: Compra de pontos para voce
    Given que eu esteja no site da livelo não logado
    And clico em compre pontos
    And clico em para voce
    When preencho as informações
    And clico em comprar pontos
    Then sou redirecionado para a tela de login
