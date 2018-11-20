# language:pt
# encoding UTF-8

Funcionalidade: Realizar soma

  @soma
  Cenário: Realizar soma de 2 números inteiros
    Dado que esteja na tela inicial da calculadora
    Quando somo 12 com 12
    Então  visualizo o 24 como resultado