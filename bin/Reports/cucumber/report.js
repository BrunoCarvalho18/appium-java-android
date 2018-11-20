$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/multiplicacao.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language:pt"
    },
    {
      "line": 2,
      "value": "# encoding UTF-8"
    }
  ],
  "line": 4,
  "name": "Realizar multiplicação",
  "description": "",
  "id": "realizar-multiplicação",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 7,
  "name": "Realizar multiplicação de 2 números inteiros",
  "description": "",
  "id": "realizar-multiplicação;realizar-multiplicação-de-2-números-inteiros",
  "type": "scenario",
  "keyword": "Cenário",
  "tags": [
    {
      "line": 6,
      "name": "@multiplicacao"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "que esteja na tela inicial da calculadora",
  "keyword": "Dado "
});
formatter.step({
  "line": 9,
  "name": "multiplicar 12 com 12",
  "keyword": "Quando "
});
formatter.step({
  "line": 10,
  "name": "devo visualizar o 144 como resultado",
  "keyword": "Então "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});