# 🐾 Sistema de Clínica Veterinária

📝 Projeto desenvolvido como parte do curso de **Programação Back-End** no **Firjan SENAI**, com o objetivo de criar uma aplicação RESTful para gerenciamento de animais e suas consultas em uma clínica veterinária.

---

## 📌 Descrição

Este sistema permite o cadastro completo de animais e o vínculo com suas respectivas consultas. A aplicação foi construída com **Java e Spring Boot**, utilizando boas práticas de arquitetura em camadas e organização de pacotes. Ideal para simular o funcionamento de um sistema clínico real e consolidar conhecimentos em desenvolvimento back-end.

---

## 🚀 Objetivo

Aplicar os conceitos aprendidos no curso para desenvolver uma API funcional, escalável e bem estruturada. O projeto serve como base para sistemas maiores e mais complexos, além de ser uma excelente ferramenta de estudo para quem deseja aprender sobre APIs RESTful com Java.

---

## 💻 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Maven  
- JPA / Hibernate  
- Spring Tools for Eclipse  

---

## 🔧 Ferramentas

- Spring Initializr – estruturação do projeto  
- Postman – testes de API  
- Eclipse / VsCode – ambiente de desenvolvimento  

---

## 📂 Estrutura do Projeto

- src/
- ├── controllers/ # Camada de controle (API REST)
- ├── entities/ # Entidades JPA (Animal, Consulta)
- ├── repository/ # Interfaces de persistência 
- ├── services/ # Regras de negócio

---

## 🔗 Funcionalidades

### 🐶 Cadastro de Animais

- ID  
- Nome  
- Espécie  
- Raça  
- Idade  
- Nome do dono  

### 🩺 Cadastro de Consultas

- ID  
- Data  
- Diagnóstico  
- Tratamento  

### 🔗 Relacionamento

- Cada animal pode estar vinculado a uma ou mais consultas, permitindo o histórico clínico completo.

---

## 📡 Endpoints REST

### Animal

- `GET /animal` – Lista todos os animais  
- `GET /animal/{id}` – Busca animal por ID  
- `POST /animal` – Adiciona novo animal  
- `PUT /animal/{id}` – Edita dados do animal  
- `DELETE /animal/{id}` – Remove animal  

### Consulta

- `GET /consulta` – Lista todas as consultas  
- `GET /consulta/{id}` – Busca consulta por ID  
- `POST /consulta` – Adiciona nova consulta  
- `PUT /consulta/{id}` – Edita dados da consulta  
- `DELETE /consulta/{id}` – Remove consulta  

---

## 🛠️ Como Executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git


