# language:pt
# encoding UTF-8

Funcionalidade: Realizar multiplicação

  @multiplicacao
  Cenário: Realizar multiplicação de 2 números inteiros
    Dado que esteja na tela inicial da calculadora
    Quando multiplicar 12 com 12
    Então devo visualizar o 144 como resultado