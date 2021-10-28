# Projeto Desing Pattern

**Introdução**

Este projeto foi realizado na linguagem java com auxilio do framework spring, para criação do DB vai ser realizado a implementação do H2 que é um armazenamento em memomira e a IDE utilizada para o desenvolvimendo do desenvolvimento foi o eclipse, este projeto tem o intuito de realizar um crud de cliente onde será envolvido o cadastro do banco telefone e endereço do mesmo.

**Spring Framework**

Este projeto foi utilizado a versão do spring 2.5.6, como dependecias foram utilizadas do Maven e a linguagem utilizada foi o Java na versão 11.

**As dependencias utilizadas nesse projeto foi:**
* Spring Web
* Spring Data JPA
* H2 Database
* OpenAPI UI
* Feign
* Validation

**Classes**

Neste projeto foi realizada a implementação das desing patterns de strategy e singleton, para que houvesse um auxilio na criação dos metodos para compor o projeto.
Foram implementadas quatro classes no pacote **bold model** do projeto:
* Cliente
* ContaBancaria
* Telefone
* Endereco

**Implementação**

A implementação foi feita utilizando como base o processo do Spring Web, onde foi feita a implementação dos pacotes *service, controller, model e repository* que fazem parte do projeto para que ele se comporte na forma correta onde cada um tem um papel para que não haja comportamentos desnecessarios nas camadas de interação.

Na parte de documentação e implatação do sistema para verificar as falhas foi feita a interação atraves do repositorio **bold openAPI** onde nele tem como realizar as verificações necessarias dos metodos crud.
