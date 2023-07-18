# Projeto Extrato Bancário (Backend)

Este projeto "Banco" é uma aplicação de exemplo que demonstra o uso do Spring Boot e do Spring Data JPA
para criar um sistema básico de banco com funcionalidades de extrato bancário.
O projeto utiliza as seguintes tecnologias:

- Java 11
- Spring Boot
- Spring Data JPA
- H2 Database
- JUnit
- Lombook

## Estrutura do projeto

O Projeto está estruturado em diferentes camadas, seguindo as melhores práticas de desenvolvimento em Java.
Cada camada tem uma responsabilidade específica e contribui para o funcionamento correto do sistema.
A seguir, são explicadas as principais camadas do projeto:

### Entidades (Entities)
A camada de entidades é responsável por modelar as estruturas de dados da aplicação.
Neste projeto, as principais entidades são **`Conta`** e **`Transferencia`**.
A entidade **`Conta`** representa uma conta bancária, enquanto a entidade **`Transferencia`** representa uma transferência de fundos entre contas.
A relação entre **`Conta`** e **`Transferencia`** é um relacionamento de "um para muitos", ou seja, uma conta pode ter várias transferências.

### Repositórios (Repositories)
A camada de repositórios é responsável pela interação com o banco de dados.
Neste projeto, os repositórios são interfaces que estendem a interface **`JpaRepository`** do Spring Data JPA.
Eles fornecem métodos para realizar operações de consulta, inserção, atualização e exclusão no banco de dados.
Os principais repositórios neste projeto são **`ContaRepository`** e **`TransferenciaRepository`**.

### Serviços (Services)
A camada de serviços contém a lógica de negócio da aplicação.
Neste projeto, o serviço principal é o **`ExtratoService`**, que é responsável por fornecer funcionalidades relacionadas ao extrato bancário.
Ele utiliza os repositórios para obter os dados necessários e realiza as operações de filtragem e paginação.

### Controladores (Controllers)
A camada de controladores é responsável por receber as requisições HTTP e direcioná-las para os serviços adequados.
Neste projeto, o controlador **`ExtratoController`** expõe endpoints para obter o extrato bancário com base nos filtros fornecidos,
como período de tempo e nome do operador de transação.

### Camada de Testes
O projeto também conta com uma camada de testes, que é fundamental para garantir a qualidade do código 
e a correta funcionalidade da aplicação. Os testes unitários são escritos utilizando o
framework JUnit. Os testes validam o comportamento esperado dos serviços e controladores, verificando se as respostas estão corretas e se os erros são tratados adequadamente.

## Data.sql 
No arquivo **`data.sql`**, foram adicionadas novas contas e transferências para enriquecer os dados do sistema.
As contas foram adicionadas com os IDs 1 a 30, e as transferências foram adicionadas relacionadas a essas contas.

## Tecnologias Utilizadas

- Java 11: Linguagem de programação utilizada no projeto.
- Spring Boot: Framework utilizado para desenvolvimento de aplicações Java.
- Spring Data JPA: Biblioteca que simplifica o acesso a banco de dados com o Spring.
- H2 Database: Banco de dados em memória utilizado para armazenar os dados da aplicação.
- JUnit: Framework de testes unitários para Java.
- Lombok: Biblioteca que automatiza a geração de código repetitivo em classes Java.

## Como executar o projeto

1. Certifique-se de ter o Java 11 instalado em sua máquina.
2. Clone o repositório do projeto.
3. Abra o projeto em sua IDE preferida (recomendo o IntelliJ IDEA).
4. Aguarde as dependências serem baixadas pelo Maven.
5. Execute a classe BancoApplication como um aplicativo Java.
6. O aplicativo será iniciado e estará disponível em http://localhost:8080.

## Considerações Finais

O projeto "Banco" é um exemplo simples que demonstra o uso do Spring Boot e do Spring Data JPA
para criar uma aplicação bancária com funcionalidades de extrato. Ele utiliza as melhores práticas
de desenvolvimento e inclui testes unitários para garantir a qualidade do código.

Sinta-se à vontade para explorar o código-fonte e os testes, bem como para realizar alterações
e adicionar novas funcionalidades. Este projeto serve como base para entender e praticar conceitos
importantes de desenvolvimento de software com Java e o ecossistema Spring.

Espero que esta documentação tenha fornecido uma visão geral clara do projeto "Banco"
e suas principais camadas. Se você tiver alguma dúvida adicional ou precisar de mais informações,
não hesite em entrar em contato.

Email: victorgabdev@gmail.com <br />
Linkedin: www.linkedin.com/in/victor-gabriel-developer <br />
Telefone e Whatsapp: (98) 981815720
