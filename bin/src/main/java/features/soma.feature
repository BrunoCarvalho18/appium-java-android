# language:pt
# encoding UTF-8

Funcionalidade: Realizar soma

  @soma
  Cenário: Realizar soma de 2 números inteiros
    Dado que esteja na tela inicial da calculadora
    Quando somo 19 com 16
    Então  visualizo o 35 como resultado