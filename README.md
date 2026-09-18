# Offline-First QR Payment System

A backend prototype for an offline-first QR payment system designed to explore how payment authorization can continue during temporary or unreliable network connectivity.

The system is being developed using Java, Spring Boot, Spring Data JPA, Hibernate, and MySQL. The current implementation provides the backend foundation for user management and persistent REST API operations. Future development will introduce merchants, transactions, offline payment authorization, QR-based payment tokens, and delayed transaction synchronization.

## Current Features

- Create and persist users through a REST API
- Retrieve all users
- Retrieve individual users by ID
- Persistent storage using MySQL
- Layered controller-service-repository architecture
- Database interaction through Spring Data JPA and Hibernate
- Environment-based database credential configuration

## Technology Stack

- **Java 26**
- **Spring Boot 4.0.7**
- **Spring Web** — REST API development
- **Spring Data JPA** — persistence abstraction
- **Hibernate** — object-relational mapping
- **MySQL** — relational database
- **Maven** — dependency management and build automation
- **Git** — version control

## Architecture

The backend follows a layered architecture that separates HTTP request handling, application logic, and database access.

```text
Client
  |
  v
UserController
  |
  v
UserService
  |
  v
UserRepository
  |
  v
Spring Data JPA / Hibernate
  |
  v
MySQL


One small Markdown detail: the architecture goes inside the triple-backtick `text` block. IntelliJ may visually highlight it differently; that's expected.

This architecture section is useful because if a recruiter opens the repository for **30 seconds**, they can immediately understand how you've structured the backend.

Add those two sections. That'll probably be enough for today's 15–20 minutes. If you've still got a few minutes afterward, we'll add **API Endpoints**, which should be very quick.

## API Endpoints

## Project Motivation

Digital payment systems typically depend on continuous network connectivity to authorize and process transactions. In environments with unreliable, congested, or temporarily unavailable connectivity, this dependency can prevent otherwise valid transactions from being completed.

This project explores an offline-first payment architecture where a limited amount of payment value can be authorized in advance and later exchanged through unique QR-based payment tokens. Transactions completed during connectivity loss would be stored locally and synchronized with the backend once connectivity is restored.

The current version focuses on establishing the backend foundation required to support this architecture.

## Running Locally

## Planned Development

The current backend provides the foundation for the larger offline payment system. Planned development includes:

- Merchant and transaction domain models
- Payment processing and transaction status management
- Offline spending allowances
- Unique and expiring payment authorization tokens
- QR-based payment authorization
- Local transaction storage during connectivity loss
- Delayed transaction synchronization
- Duplicate and replay protection
- Input validation and exception handling
- Automated testing
- Android client integration

### Prerequisites

- Java 26
- MySQL
- Git

### Setup

1. Clone the repository.
2. Create a MySQL database named `qr_payment_system_v1`.
3. Configure the `DB_PASSWORD` environment variable with your local MySQL password.
4. Run the Spring Boot application using the Maven wrapper.
5. The API will be available at `http://localhost:8080`.

### Create User

`POST /users`

Example request:

```json
{
  "username": "testuser",
  "balance": 100.00
}

Get All Users
GET /users

Example: GET/users/1


The **POST example is especially useful** because the reader needs to know what JSON the endpoint expects. For the GET endpoints, examples aren't really necessary because there's no request body.

Later, when we add `Transaction`, this section becomes more impressive because we'll document things like:

```text
POST /transactions
GET /transactions
GET /transactions/{id}
