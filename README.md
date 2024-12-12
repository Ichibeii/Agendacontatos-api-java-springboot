# Agendamento de Contatos - API RESTful

Este projeto é uma **API RESTful** desenvolvida para o gerenciamento de contatos, com funcionalidades de **CRUD** (Create, Read, Update, Delete) e a capacidade de buscar contatos por **nome** e **número**. Foi desenvolvido com a linguagem **Java** utilizando o framework **Spring Boot**.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Spring Boot**: Framework para construção de APIs RESTful.
- **JPA (Java Persistence API)**: Para interação com banco de dados.
- **H2 Database**: Banco de dados em memória para armazenamento dos dados (pode ser alterado conforme necessidade).
- **Maven**: Gerenciador de dependências e construção do projeto.

## Funcionalidades

- **Criar Contato**: Permite cadastrar um novo contato com os campos `nome`, `gênero` e `número`.
- **Listar Contatos**: Retorna todos os contatos cadastrados.
- **Atualizar Contato**: Permite atualizar os dados de um contato existente.
- **Excluir Contato**: Exclui um contato existente.
- **Buscar Contato**: Busca contatos por **nome** ou **número**.

## Endpoints da API

### 1. **POST /agendacontato**

Cria um novo contato.

#### Request:
```json
{
  "nome": "Carlos Silva",
  "gênero": "Masculino",
  "numero": "123456789"
}
```
### 2. **GET /agendacontato**

Lista todos o contatos cadastrados.

#### Request:
```json
[
  {
    "id": 1,
    "nome": "Carlos Silva",
    "gênero": "Masculino",
    "numero": "123456789"
  },
  {
    "id": 2,
    "nome": "Maria Souza",
    "gênero": "Feminino",
    "numero": "987654321"
  }
]
```
### 3. **GET/agendacontato/search/nome/{nome}&numero{numero}**

Busca contatos por nome ou número.

Exemplo 1: Buscar por nome

#### Request:
```http
GET /agendacontato/search/nome/Carlos Silva
```
Exemplo 2: Buscar por número

#### Request:
```http
GET /agendacontato/search/numero/123456789
```
### 4. **PUT/agendacontato**

Atualiza o contato existente.

#### Request:
```json
  {
    "id": 1,
    "nome": "André Silva ",
    "gênero": "Masculino",
    "numero": "123456789"
  }
```
### 5. **DELETE/agendacontato**

Para deletar algum contato com o ID.

#### Request:
```http
DELETE /agendacontato/1






