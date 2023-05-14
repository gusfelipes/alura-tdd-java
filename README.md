# alura-tdd-java

Repositório utilizado no curso de TDD e Java: testes automatizados com JUnit

## Alura+
### Entenda a Pirâmide de Teste

Entenda os diferentes tipos de testes automatizados

- unit: Base (maioria dos testes no projeto)
- integration: Meio
- e2e: testes de interface
- Testes Manuais: nuvem

Testes de unidade -> testar a menor unidade do projeto, nesse caso 

Dublês de Testes??

Testes de integração

Testes de ponta a ponta, Testes de interface, end-to-end, e2e

Próximos estudos
- Testes de performance
- Testes de mutação
- BDD

## Testes Automatizados
Testes Manuais

- Chatos
- Lentos
- Sujeito a falhas (fator humano)

Testes Automatizados

- Automatização
- Feedback mais rápido
- Segurança ao mexer no código
- Favorece a melhoria no código (Refactoring)

Aprendido na Aula:
- O que são testes Automatizados
- A importância de se escrever testes automatizados em uma aplicação
- Como escrever um teste automatizado utilizando uma classe Java com o método *main*

## JUnit

- Biblioteca padrão por ser amplamente utilizada para a escrita de testes automatizados no Java
- Criada em 1995 por Kent Beck e Erich Gamma
- Gratuito e open source [Junit5](https://github.com/junit-team/junit5)
- Foco em testes de unidade (testes unitários)

Aprendido na Aula:
- A história do JUnit
- Como adicionar o JUnit ao projeto (via local ou maven)
- Como escrever um teste automatizado com JUnit
- Como executar os testes com JUnit e analisar o resultado da execução


## TDD: Test-Driven Development

- A abordagem mais comum é "Código antes, testes depois"
- TDD Testes->Implementacao->Refatoração

Regra de Negócio para o exemplo de TDD
> - Se o desempenho for classificado como "A desejar", o reajuste será de 3% do salário atual.
> - Se o desempenho for "Bom,", o reajuste será de 15% do salário.
> - Se o desempenho for "Ótimo", o reajuste será de 20% do salário.

Quando usar TDD?

Vantagens
- Código já sai "testado"
- Evita testes "viciados" na implementação
- Refatoração faz parte do processo
- Ajuda a manter o foco
- Temos uma "tendência" em escrever um código mais simples

Desvantagens
- Eu vou escrever meu teste automatizado

Quando Utilizar?

R: Na implementação de funcionalidades complexas, cuja estrutura não está clara ainda e com o TDD funciona como um rascunho.
Já quando for códigos mais simples, sem problemas de *design* não é interessante utilizar TDD.

Aprendido na Aula
- O que é o TDD;
- Como escrever uma funcionalidade via TDD;
- Como realizar uma refatoração no código;
- As vantagens de escrever os testes antes da implementação.


## LIdando com Exceptions

Aprendido na Aula
- Como testar métodos que podem lançar exceptions;
- As abordagens para testar um método que lança uma exception.