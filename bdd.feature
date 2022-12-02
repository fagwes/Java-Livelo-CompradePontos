  

Feature: compra de pontos
 como usuario
 quero realizar o acessoa a página compra de pontos
 para comprar pontos
 


      
  @compradepontos
  Scenario: Compra de pontos para voce
    Given que eu esteja em no site da livelo
    And clica em compre pontos
    And clico em para você
    And preencho quantos pontos voce quer comprar
    And preencho cupom de desconto
    When clico em comprar pontos
    Then sou redirecionado para a tela de login


 